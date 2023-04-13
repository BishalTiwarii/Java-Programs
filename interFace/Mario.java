package interFace;

public class Mario implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump up");
		
	}

	@Override
	public void down() {
		System.out.println("slide down");
		
	}

	@Override
	public void left() {
		System.out.println("do nothing ");
		
	}

	@Override
	public void right() {
		System.out.println("move faster");
		
	}
	

}
