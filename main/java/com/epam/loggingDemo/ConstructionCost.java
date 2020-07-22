package com.epam.loggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	public void Standard(int a) {
		int ans=1200*a;
		LOGGER.info(ans);
	}
	public void aboveStandard(int a) {
		int ans=1500*a;
		LOGGER.info(ans);
	}
	public void highStandard(int a) {
		int ans=1800*a;
		LOGGER.info(ans);
	}
	public void fullyAutomated(int a) {
	    int ans=2500*a;
		LOGGER.info(ans);
	}


}
