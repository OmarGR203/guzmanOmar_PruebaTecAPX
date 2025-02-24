package com.bbva.wikj;

import com.bbva.wikj.dto.customer.DtoOut;
import com.bbva.wikj.lib.r554.WIKJR554;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT55401MXTransaction extends AbstractWIKJT55401MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT55401MXTransaction.class);

	@Override
	public void execute() {
		WIKJR554 wikjR554 = this.getServiceLibrary(WIKJR554.class);
		DtoOut dtoOut = wikjR554.execute(this.getDtoin());
		this.setDtoout(dtoOut);
	}

}
