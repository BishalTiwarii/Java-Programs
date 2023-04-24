package com.springFramework.springframework.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class SomeDependency {

	public void getReady() {
	
		System.out.println("some logic using dependency from getReady()");
		
	}

}
