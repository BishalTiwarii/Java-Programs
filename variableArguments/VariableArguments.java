package variableArguments;

import java.util.Arrays;

public class VariableArguments {
	public static int[] print(int...values) //... represent variable arguments.
	{
		System.out.println(Arrays.toString(values)); //using overwritten toString method and printing values.
		return values;
	}
public static int sum(int...values) 
{
	int sum=0;
	for (int i = 0; i < values.length; i++) 
	{
		sum=sum+values[i]; //logic for sum
		
	}
	return sum;
	
}
	public static void main(String[] args) {
		print(100,200,300); //printing values
		System.out.println(sum(100,200,300)); //printing sum
		System.out.println(sum(100,200,300,500)); //print desired number of sum with passing desired no of arguments.

	}

}
