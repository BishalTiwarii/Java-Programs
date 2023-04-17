package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		method1();
		System.out.println("main ended");

	}
	public static void method1()
	{
		method2();
		System.out.println("Method1 ended");
	}
	public static void method2()
	{
		try {
			String str=null;
			str.length();
			System.out.println("method2 ended");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
			}
	
	
	
}
