package com.epam.loggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	public void CI(int p,int t,double r) {
 	   double ans=p*(Math.pow((1+r/100),t));
 	   LOGGER.info("CompoundInterest is :"+ans);
    }

}
