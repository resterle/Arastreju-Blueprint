/*
 * Copyright 2012 by lichtflut Forschungs- und Entwicklungsgesellschaft mbH
 */
package org.arastreju.bindings.blueprint;

import org.arastreju.sge.persistence.TxProvider;
import org.arastreju.sge.spi.abstracts.AbstractConversationContext;

/**
 * <p>
 *  [DESCRIPTION]
 * </p>
 *
 * <p>
 * 	Created 29.08.2012
 * </p>
 *
 * @author Raphael Esterle

 */
public class BpConversationContext extends AbstractConversationContext {
	
	private final String dbURI;
	
	public BpConversationContext(String databaseURI){
		dbURI=databaseURI;
	}
	
	/** 
	 * {@inheritDoc}
	 */
	public TxProvider getTxProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	protected void clearCaches() {
		// TODO Auto-generated method stub

	}

}
