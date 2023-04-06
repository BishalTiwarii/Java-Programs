package bishal;

public class Fanrunner {

	public static void main(String[] args) {
		Fan fan=new Fan("Usha", 22.05, 3, true);
		System.out.println(fan);
        fan.setSpeed(5);
        System.out.println(fan);
        fan.setRadius(20.00);
        fan.setMake("Havels");
        System.out.println(fan);
	}

}
