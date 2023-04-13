package methods;

public class TypesOfMethods {

	public static void main(String[] args) {
		TypesOfMethods typesofmethods=new TypesOfMethods();
		sum(20,30);
		typesofmethods.sub(50,20);
		System.out.println(returnValue());

	}
	public static void sum(int a,int b) //static method
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public  void sub(int a,int b) //non-static method

	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static String returnValue() //method returning some value
			{ 
		String s="returnvalue";
		return  s;
			}
	
}
