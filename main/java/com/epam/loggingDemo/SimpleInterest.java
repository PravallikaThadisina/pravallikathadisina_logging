package com.epam.loggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public void SI(int p,int t,double r) {
		double ans=(p*t*r)/100;
	LOGGER.info("SimpleInterest is :"+ans);
	}


}
