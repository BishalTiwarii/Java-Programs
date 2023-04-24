package com.springFramework.springframework.lazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
	System.out.println("Bean got initialized");
		this.classA = classA;
		
		}
	public void doSomething()
	{
		System.out.println("Bean got initialized when we try to use this method");
	}

}
