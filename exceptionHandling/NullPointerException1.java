package exceptionHandling;

public class NullPointerException1 {

	public static void main(String[] args) {
	  String str=null;
	 
		
		try {
			str.length();
			
			} catch (NullPointerException e)
		{
		   System.out.println("NullpointerException");
		}
		catch(Exception ex)
		{
			System.out.println("2nd catch blocked executed");
			
		}
	

	}

}
