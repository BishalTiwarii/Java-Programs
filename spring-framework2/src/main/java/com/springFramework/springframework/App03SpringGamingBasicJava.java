package com.springFramework.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springFramework.springframework.java.GameRunner;
import com.springFramework.springframework.java.GamingConsole;

@Configuration
@ComponentScan("com.springFramework.springframework.java")
public class App03SpringGamingBasicJava {
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(App03SpringGamingBasicJava.class)) 
		{
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}

}
