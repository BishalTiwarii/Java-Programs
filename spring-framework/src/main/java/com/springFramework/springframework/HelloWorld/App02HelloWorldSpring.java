package com.springFramework.springframework.HelloWorld;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try (//Launch Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldSpringConfiguration.class)) 
		{
			//Retrieving Bean managed by Spring
			System.out.println(context.getBean("name"));	
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address"));
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
		
	   //configure the things you want spring to manage
	  //HelloWorldSpringConfiguration @Configuration
	 //name()-@Bean


	}

}
