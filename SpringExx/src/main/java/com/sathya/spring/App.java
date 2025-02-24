package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	//get the beans
    	Person person = context.getBean("person",Person.class);
    	person.PersonInfo();
    	
    	
    	
    	Person person1 = context.getBean("person1",Person.class);
    	person1.PersonInfo();
    	
    	Person person2 = context.getBean("person2  ",Person.class);
    	person2.PersonInfo();
    }
}

			
			