package com.springFramework.springframework.lazyInitialization;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan
public class LazyIntializationLauncher {

	public static void main(String[] args) {
          try (var context=new AnnotationConfigApplicationContext(LazyIntializationLauncher.class))
          {
        	 // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        	  
        	  context.getBean(ClassB.class).doSomething(); //when this part of code execute bean got initialized
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
