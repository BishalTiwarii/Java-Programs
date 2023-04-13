package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		sum(10,20);
		sum(100,200,300);
		sum(200,300,400,100);
		sum(10.20,20.20);
		sum(20,10);

	}
	public static void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void sum(int d,int b,int c)
	{
		int sum=d+b+c;
		System.out.println(sum);
	}
	public static void sum(int a,int b,int c,int d) 
	{
		int sum=a+b+c+d;
		System.out.println(sum);
	}
	public static void sum(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
		
	}

