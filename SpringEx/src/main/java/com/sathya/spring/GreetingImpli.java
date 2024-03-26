package com.sathya.spring;

public class GreetingImpli implements Greeting {
	@Override
	public void greet() {
		System.out.println("This is maven project..");
		System.out.println("no need..");
		
	}
    public GreetingImpli()
   {
	System.out.println("GreetingImplements constructor :: Object created");
   }

}
