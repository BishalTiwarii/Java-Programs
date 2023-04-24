package com.springFramework.springframework.Scope;

import org.springframework.context.annotation. AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ScopeSpringRunner {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(ScopeSpringRunner.class))
		{
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}
	
	
	
	

}
