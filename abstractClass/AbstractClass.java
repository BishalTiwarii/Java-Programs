package abstractClass;

public abstract class AbstractClass //abstract class declared
{
	abstract public void sum(); //abstract method//without implementation
	abstract public void sub();
	abstract public void multiply();
	abstract public void mod();
	
	public  void divide(int a,int b) //concrete method 
	{
		int divide=a/b;              //implementation
		System.out.println(divide);
	}
	

}
