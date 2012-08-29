package org.arastreju.bindings.blueprint;

import org.arastreju.sge.ArastrejuGate;
import org.arastreju.sge.ArastrejuProfile;
import org.arastreju.sge.context.DomainIdentifier;
import org.arastreju.sge.spi.ArastrejuGateFactory;
import org.arastreju.sge.spi.GateInitializationException;

public class BpGateFactory extends ArastrejuGateFactory{

	public BpGateFactory(ArastrejuProfile profile) {
		super(profile);
		System.out.println(profile.getProperty("org.arastreju.bindings.plueprint.url"));
	}

	@Override
	public ArastrejuGate create(DomainIdentifier identifier)
			throws GateInitializationException {
		return null;
	}

}
