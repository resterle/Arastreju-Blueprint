/*
 * Copyright 2012 by lichtflut Forschungs- und Entwicklungsgesellschaft mbH
 */
package org.arastreju.bindings.blueprint.tx;

import org.arastreju.sge.persistence.TransactionControl;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.TransactionalGraph.Conclusion;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;

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
public class BpTransactionControll implements TransactionControl {
	
	private final OrientGraph graph;
	private boolean isActive = true;
	
	public BpTransactionControll(OrientGraph graph){
		this.graph=graph;
	}
	
	/** 
	 * {@inheritDoc}
	 */
	public void success() {
		graph.stopTransaction(Conclusion.SUCCESS);
		isActive=false;
	}

	/** 
	 * {@inheritDoc}
	 */
	public void fail() {
		graph.stopTransaction(Conclusion.FAILURE);
		isActive=false;

	}

	/** 
	 * {@inheritDoc}
	 */
	public void finish() {
		success();
	}

	/** 
	 * {@inheritDoc}
	 */
	public void commit() {
		success();

	}

	/** 
	 * {@inheritDoc}
	 */
	public void rollback() {
		fail();
	}

	/** 
	 * {@inheritDoc}
	 */
	public void flush() {
		// TODO Auto-generated method stub

	}

	/** 
	 * {@inheritDoc}
	 */
	public boolean isActive() {
		return isActive;
	}

}
