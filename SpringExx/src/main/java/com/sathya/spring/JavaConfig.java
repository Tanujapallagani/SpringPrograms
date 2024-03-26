package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
@Bean
public Person person()
{
	Person person1 = new Person();
	
	person1.setName("Thanu");
	person1.setEmail("tanu@gamil.com");
	return person1;
}	
	
	@Bean
	public Person person1()
	{
		Person person2 = new Person();
	
	person2.setName("Chinni");
	person2.setEmail("chinni@gamil.com");
	return person2;
	
}
 
	@Bean
	public Person person2()
	{
		Person person3 = new Person();
		
		person3.setName("Himanth");
		person3.setEmail("nani@gmail.com");
		return person3;
	}

}
