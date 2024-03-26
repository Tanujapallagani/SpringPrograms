package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaCongi.class);
    	
    	//set the beans
    	Student student = context.getBean("student",Student.class);
    	student.details();  
    	
    }
}   