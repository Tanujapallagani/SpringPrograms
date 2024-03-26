package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the IOC container
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//get the bean
    	Traveller traveller = context.getBean("traveller",Traveller.class);
    	traveller.startJourny();
    }
}
