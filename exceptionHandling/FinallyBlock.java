package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		int a=0;
		int b=-0;
		
		try {
			System.out.println(b/a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
			
		}finally {
			System.out.println("finally will executed in any case");
		}

	}

}
