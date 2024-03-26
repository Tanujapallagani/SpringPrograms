package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	System.out.println("******************");
    	
    	//get the beans
    	GreetingImpli greetingImpli=context.getBean("greet",GreetingImpli.class);
    	greetingImpli.greet();
    }
}
