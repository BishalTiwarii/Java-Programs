package com.springFramework.springframework.Cdi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan
public class CdiRunner {

	public static void main(String[] args) {
	try(var context= new AnnotationConfigApplicationContext(CdiRunner.class))
	{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BusinessService.class).getDataService());
		
	}

	}

}
