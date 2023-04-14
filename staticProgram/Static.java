package staticProgram;

public class Static {
	
static int a; //global static variable
static int b;
static String str;
static //static block
{
	
	System.out.println("static block executes first");
}
static //multiple static block
{
	System.out.println("2nd static block");
}

	public static void main(String[] args) {
		
		
		a=10; //modifying values of gloabal static variable
		b=50;
		
		System.out.println(sum()); //calling static method for execution
		

	}
	public static int sum() //static method
	{
		int sum=a+b;
		return sum;
	}

}
