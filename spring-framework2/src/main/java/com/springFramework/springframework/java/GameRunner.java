package com.springFramework.springframework.java;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}

	public void run()
	{
		System.out.println("Game Running : "+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

	

}
