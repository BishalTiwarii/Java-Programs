package string;
import java.util.Arrays;
public class MaxNoOfStr {

	public static void main(String[] args) {
		String weekDays[]= {"Monday","Tuesday","Wedenesday","Thursday","Friday","Saturday","Sunday"};
		
		String maxStringInDays="";
		
		for (int i = 0; i < weekDays.length; i++) {
			
			if (weekDays[i].length()>maxStringInDays.length())  //logic
			{
				maxStringInDays=weekDays[i];
				
			}
			
		}
		System.out.println(maxStringInDays);// printing the max no of string in array
		
		for (int i = weekDays.length-1; i>=0; i--) {
			
			System.out.println(weekDays[i]); //printing the values in a reverse order
			
		}
		
			
		

}
	}
