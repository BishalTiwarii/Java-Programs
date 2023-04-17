package exceptionHandling;

public class ArrayIndexOutOfBoundsException1 {

	public static void main(String[] args) {
	    method1();
		System.out.println("further statement executed");
		method2();

	}

	private static void method2() {
		System.out.println("method2 got executed");
		
	}

	private static void method1() {
		try {
			int aar[]= {1,2};
			System.out.println(aar[2]);
			
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointerException handled");
		
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			
		}
		
	}

}
