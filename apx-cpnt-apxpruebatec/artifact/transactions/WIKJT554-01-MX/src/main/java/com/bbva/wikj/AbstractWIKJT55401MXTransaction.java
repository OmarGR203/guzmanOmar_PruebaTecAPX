package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.customer.DtoIn;
import com.bbva.wikj.dto.customer.DtoOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT55401MXTransaction extends AbstractTransaction {

	public AbstractWIKJT55401MXTransaction(){
	}


	/**
	 * Return value for input parameter dtoIn
	 */
	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}

	/**
	 * Set value for DtoOut output parameter dtoOut
	 */
	protected void setDtoout(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
