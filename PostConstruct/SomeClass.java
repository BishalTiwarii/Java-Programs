package com.springFramework.springframework.PostConstruct;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		this.someDependency = someDependency;
		System.out.println("All dependency are ready");
	}
	
	@PostConstruct
   public void initialize()
   {
	   someDependency.getReady();
   }
	
	@PreDestroy
	public void cleanUp() 
	{
		System.out.println("instance is in the process of being removed by the container");
	}
}
