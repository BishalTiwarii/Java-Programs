package bishal;

public class Recipe1 extends Recipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("bring the utensils");
		
	}

	@Override
	void doTheDish() {
		System.out.println("cook the dish");
		
	}

	@Override
	void cleanup() {
		System.out.println("cleanup the utensils");
		
	}
	

}
