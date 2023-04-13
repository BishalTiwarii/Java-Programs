package array;

public class Arrayexample {

	public static void main(String[] args) {
		int [] a= {10,20,57,65,10,30};// array declared with the help of assignment operator.
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]); //accessing the value inside the array with the help of for loop.
		}
		
	 int [] b=new int[5]; //array declared with the help of new keyword.
	 
	 b[0]=200; // storing value in the array with the help of index no. and assignment operator.
	 b[1]=180; //""
	 
	 for (int j = 0; j < b.length; j++) //accessing value in the array with the help of for loop.
	 {
		
	
         
		System.out.println(b[j]);
	}

	String[] str=new String[5]; // string array using new keyword.
	
	str[0]="car";
	str[1]="bike";
	str[2]="cycle";
	str[3]="train";
	str[4]="flight";
	
	for (int i = 0; i < str.length; i++) //accessing string array using for loop
	{
		
		System.out.println(str[i]);
	}
	
	 System.out.println(a.equals(b)); //comparing array with the help of equals method and executed it
}
	}
