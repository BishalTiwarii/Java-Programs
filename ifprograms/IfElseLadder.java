package ifprograms;

public class IfElseLadder {

	public static void main(String[] args) {
		char ch='a';
		int a=ch;
		int b=30;
		
	    if (a>b) {
	    	System.out.println(a+" is greater than "+b);
			
		}
	    else if(b>a) {
	    	System.out.println(b+" is greater than "+a);
	    }
	    else if(a==b)
	    {
	    	System.out.println(a+" =Both numbers are equal= "+b);
	    }
	    else
	    {
	    	System.out.println("you can have this part on your choice");
	    }

	}

}
