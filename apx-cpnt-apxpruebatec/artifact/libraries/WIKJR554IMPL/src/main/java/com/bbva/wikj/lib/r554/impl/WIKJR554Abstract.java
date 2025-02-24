package com.bbva.wikj.lib.r554.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r554.WIKJR554;
import com.bbva.wikj.lib.r555.WIKJR555;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR554Abstract extends AbstractLibrary implements WIKJR554 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR555 wikjR555;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param wikjR555 the this.wikjR555 to set
	*/
	public void setWikjR555(WIKJR555 wikjR555) {
		this.wikjR555 = wikjR555;
	}

}