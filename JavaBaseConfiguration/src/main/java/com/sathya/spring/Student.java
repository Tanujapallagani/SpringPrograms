package com.sathya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	//fields
	@Autowired
	private EmailService emailService;
	@Autowired
	private JavaCourseService javacourseService;
	
   
     //generate the setters and getters
    
	/*public EmailService getEmailService() {
		return emailService;
	}
	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	

    
	public JavaCourseService getJavacourseService() {
		return javacourseService;
	}
	@Autowired
	public void setJavacourseService(JavaCourseService javacourseService) {
		this.javacourseService = javacourseService;
	}*/
	


    //generate the Constructor
    /* @Autowired
	    public Student(EmailService emailService, JavaCourseService javacourseService) {
		super();
		this.emailService = emailService;
		this.javacourseService = javacourseService;
	}*/
		
	
	
		public void  details()
		{
			emailService.message();
			javacourseService.courseInfo();
			
		}

	}

	


