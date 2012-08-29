package org.arastreju.arastreju.bindings.orientDB;

import org.arastreju.sge.Arastreju;
import org.arastreju.sge.ArastrejuProfile;
import org.junit.Test;

public class TestOrientDB {

	final private ArastrejuProfile profile = ArastrejuProfile.read("arastreju.default.profile");

	
	@Test
	public void initTest(){
		Arastreju.getInstance(profile);
	}
	
}
