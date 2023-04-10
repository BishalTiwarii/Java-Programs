package bishal;

public class GameRunner {
	
	public static void main(String[] args) {
		GamingConsole[] games= {new Mario(),new ChessGame()};
		for(GamingConsole game:games)
		{
			 game.up();
			 game.down();
			 game.left();
			 game.right();
			 
		}

	}

}
