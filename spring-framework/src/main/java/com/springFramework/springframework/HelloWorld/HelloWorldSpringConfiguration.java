package com.springFramework.springframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){}
record Address(String firstLine,String city) {}

@Configuration
public class HelloWorldSpringConfiguration {
	@Bean
	public String name()
	{
		return "Neel";
		
	}
	@Bean
	public int age()
	{
		return 22;
	}
	
	@Bean
	public Person person()
	{
		return new Person("John",20);
		
	}
	@Bean
	public Address address()
	{
		return new Address("Baker Street","London");
	}

}
