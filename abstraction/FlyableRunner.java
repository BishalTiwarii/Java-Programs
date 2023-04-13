package abstraction;

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects= {new Bird(),new Aeroplane()};
		for (Flyable objects:flyingObjects) 
		{
			
			objects.fly();
		}
		}
	}


