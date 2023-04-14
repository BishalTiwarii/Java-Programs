package constructorChaining;

public class ConstructorChaining extends ConstructorSuper{
	ConstructorChaining()
	{
		System.out.println("no argument constructor");
		
	}
ConstructorChaining(String name,int rollNo)//parameterized constructor
{
	this(name);// calls one argument constructor
	System.out.println("parameterized constructor");
	
		
	}
ConstructorChaining(String name)
{
	
	this();//calls no argument constructor
	System.out.println("one argument constructor");
	
}
ConstructorChaining(String name,int rollno,int mobno)
{
	super(name,rollno,mobno);
	
}

	public static void main(String[] args) 
	{
		ConstructorChaining cc=new ConstructorChaining("krishna",01);//calls two argument constructor
		ConstructorChaining cc1=new ConstructorChaining("john",02,560076);

	}

}
