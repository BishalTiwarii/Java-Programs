package operators;

public class AndOrOperators {

	public static void main(String[] args) {
		String str="dell";
		String str1="lenovo";
		String str2="dell";
		
		if (str==str1||str2==str1||str==str2) //one condition must be true
		{
			
			System.out.println("Or operator will check for next if first or second is false ");
			
		}
        if (str==str1&&str2==str1&&str==str2) //all the condition must be true to execute below statement
        {
			
			System.out.println("&& operator will not check for next if first is false ");
			
		}


	}

}
