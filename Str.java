package bishal;

public class Str {
    public static void main(String [] args)
{
    	String s1="hello"; //with the help of assignment operator
    	String s2=new String("world"); //with the help of new keyword
    	System.out.println(s1);
    	System.out.println(s2);
    	int length=s1.length();
    	System.out.println(length);
    	System.out.println(s1.isEmpty());
    	System.out.println(s1.charAt(4));
    	System.out.println(s1.concat(s2));
    	System.out.println(s1.toUpperCase());
    	}
}
