package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        //Start the container
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	System.out.println("*********************");
    	
    	//get the object from container call your methods
    	GreetingImpli greetingImpli = context.getBean("greet", GreetingImpli.class);
    	greetingImpli.greet();
    }
}
