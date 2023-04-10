package bishal;

public class ConstructorRunner extends Constructor {

	public ConstructorRunner(String name)
	{
		super(name);// calling the constructor of super class
	
	}
	public ConstructorRunner(int value) {
		super(value);
	}
	
	public static void main(String [] args)
	{
		Constructor c1=new Constructor("Neel");// calling String argument constructor of super class
		Constructor c2=new Constructor();//calling no argument constructor of super class
		Constructor c3=new Constructor(100);//calling int argument Constructor of super class
		
	}

}
