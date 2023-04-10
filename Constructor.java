package bishal;

public class Constructor extends Object {
	private String name;
	private int value;

	public Constructor(String name) //Parameterized  constructor
	{
		super(); //will call the constructor of object class/no argument constructor of object class
		this.name = name;
		System.out.println("From String argument constructor = "+name);
	}
	public Constructor()
	{
		
	System.out.println("From No argument Constructor");
	}
	
	public Constructor(int value)
	{
		this.value=value;
		System.out.println("from int argument cunstructor = "+value);
	}
	

}
