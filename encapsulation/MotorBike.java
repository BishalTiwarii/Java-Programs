package encapsulation;

public class MotorBike {
	private int speed;

	public MotorBike(int speed) {
		this.setSpeed(speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch)
	{
		this.speed=this.speed+howMuch;
	}
    public void decreseSpeed(int howmuch) 
    {
    	this.speed=this.speed-howmuch;
    }
    public String toString() 
    {
		return String.format("speed=%s", speed);
    	
    }
}
