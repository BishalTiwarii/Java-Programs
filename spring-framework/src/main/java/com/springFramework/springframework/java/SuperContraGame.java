package com.springFramework.springframework.java;

public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump up");
		
	}

	@Override
	public void down() {
		System.out.println("lay down");
		
	}

	@Override
	public void left() {
		System.out.println("move back ");
		
	}

	@Override
	public void right() {
		System.out.println("shoot a bullet");
		
	}

}
