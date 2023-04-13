package polymorphism;

public class BankRunner {

	public static void main(String[] args) {
		Bank rate1=new SbiBank();
		Bank rate2=new AxisBank();
		
		System.out.println(rate1.getRateOfInterest());
		System.out.println(rate2.getRateOfInterest());

	}

}
