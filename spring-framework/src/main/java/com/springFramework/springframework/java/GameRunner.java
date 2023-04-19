package com.springFramework.springframework.java;

public class GameRunner {
	static GamingConsole game;
	
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}

	public static void run()
	{
		System.out.println("Game Running : "+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

	

}
