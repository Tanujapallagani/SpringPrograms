package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.sathya.spring")
@Configuration
public class JavaCongi {
	
	/*@Bean
	public EmailService emailService()
	{
		EmailService emailService = new EmailService();
		return emailService;
	}

	  @Bean
	  public JavaCourseService javacourseService()
	  {
		  JavaCourseService javacoureService = new JavaCourseService();
		  return javacoureService;
	  }
	  
	  
	  //Constructor
	  @Bean
	  public Student student()
	  {
	     Student student = new Student(EmailService(),JavaCourseService();
	     return student;
	  }
	  
	  
	  //setters and getters
	  @Bean
	  public Student student()
	  {
		  Student student = new Student();
		  //we are setting email,java course to student
		  student.setEmailService(emailService());
		  student.setJavacourseService(javacourseService());
		  return student;
	  }*/
}
