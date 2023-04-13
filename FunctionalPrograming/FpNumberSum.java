package FunctionalPrograming;
import java.util.ArrayList;


public class FpNumberSum {

	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<>();
		number.add(100);
		number.add(43);
		number.add(89);
		number.add(63);
		
		int sum=number.stream().reduce(0,(number1,number2) -> number1+number2);
		
		System.out.println("sum of arraylist integer are -> "+sum);
		
		
		
	}

}
