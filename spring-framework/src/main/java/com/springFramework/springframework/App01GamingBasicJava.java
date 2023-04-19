package com.springFramework.springframework;

import com.springFramework.springframework.java.GameRunner;
import com.springFramework.springframework.java.MarioGame;
import com.springFramework.springframework.java.PacmanGame;
import com.springFramework.springframework.java.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		 // var game=new MarioGame();
		//var game=new SuperContraGame();
		 var game=new PacmanGame();
		
		var gameRunner=new GameRunner(game);
		
		gameRunner.run();

	}

}
