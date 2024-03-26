package com.sathya.spring;

import org.springframework.stereotype.Component;
@Component
public class EmailService implements MessageService{

	@Override
	public void message() {
		System.out.println(" This is EmailService implemented by MessageService");
		
	}
	

}
