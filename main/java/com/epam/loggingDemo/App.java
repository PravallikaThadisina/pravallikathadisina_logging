package com.epam.loggingDemo;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
Scanner sc=new Scanner(System.in);
    	
       LOGGER.info( "Enter the values of Principal amount,time and rate of interest" );
        int principalAmount=sc.nextInt();
        int time=sc.nextInt();
        double rateOfInterest=sc.nextDouble();
        SimpleInterest s=new SimpleInterest();
        s.SI(principalAmount,time,rateOfInterest);
        CompoundInterest c=new CompoundInterest();
        c.CI(principalAmount,time,rateOfInterest);
        
       LOGGER.info("Enter your choice of material: 1)Standard 2)above Standard 3)high Standard 4)high Standard and fullyautomated");
        int material=sc.nextInt();
        int area=sc.nextInt();
        ConstructionCost cost=new ConstructionCost();
        System.out.println("Construction cost is :");
        if(material==1) {
       cost.Standard(area);
        }
        else if(material==2)
        	cost.aboveStandard(area);
        else if(material==3)
        	cost.highStandard(area);
        else if(material==4)
        	cost.fullyAutomated(area);

        
    }
}
