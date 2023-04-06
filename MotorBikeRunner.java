package bishal;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike bajaj=new MotorBike(100);
		MotorBike harley=new MotorBike(50);
		
		System.out.println(bajaj);
		System.out.println(harley);
		
		bajaj.increaseSpeed(30);
		System.out.println(bajaj);
		
		harley.setSpeed(180);
		System.out.println(harley);
		
		harley.decreseSpeed(20);
		System.out.println(harley);
		
				

	}

}
