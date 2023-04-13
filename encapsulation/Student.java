package encapsulation;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Student {

	private String [] name;
	private int[] marks;
	
	public Student(String[] name,int[] marks) {
		this.name = name;
		this.marks =marks;
		
	}
	public int getNumberOfMarks()
	{ 
		int number;
		return number=marks.length;
	}
	public int sumOfNumberOfMars()
	{
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			
			sum=sum+marks[i];
		}
		return sum;
	}
	public int getMaximumMarks()
	
	{
		int max = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i]>max) {
				max=marks[i];
				
			}
			
		}
		return max;
		
	}
	public int getMinimumMarks()
	{
		int min=0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i]<min) {
				min=marks[i];
				
			}
			
		}
		return min;
	}
	public BigDecimal getAverageOfMarks()

	{
		int sum=sumOfNumberOfMars();
		int number=getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number));
	}
	public int addNewMark() {
		return 0;
		
	}
}
