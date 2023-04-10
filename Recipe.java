package bishal;

public abstract class Recipe {
	
	public void execute()//concrete method
	{
		getReady();
		doTheDish();
		cleanup();
		
	}
	
	abstract void getReady(); //abstract method
	abstract void doTheDish();//""
	abstract void cleanup();//""
		
	

}
