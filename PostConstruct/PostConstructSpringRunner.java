package com.springFramework.springframework.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Configuration
@ComponentScan
public class PostConstructSpringRunner {

	public static void main(String[] args) {
         try(var context=new AnnotationConfigApplicationContext( PostConstructSpringRunner.class))
         {
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
         

	}

}
