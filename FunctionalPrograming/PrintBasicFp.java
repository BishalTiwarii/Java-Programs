package FunctionalPrograming;

import java.util.ArrayList;

public class PrintBasicFp {
	
public ArrayList<String> printBasic(ArrayList<String> list)
{
	list.stream().forEach(element -> System.out.println(element));
	return list;
			
	}

public ArrayList<Integer> printBasicInt(ArrayList<Integer> list)
{
	list.stream().forEach(element -> System.out.println(element));
	return list;
			
	}
	public void printBasicFiltering(ArrayList<String> list)
{
	list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println("element ending with 'at' -> "+element));
	}
public void printBasicFilteringOdd(ArrayList<Integer> list)
{
	list.stream().filter(element -> element%2==1).forEach(element -> System.out.println("odd values are -> "+element));
	}
}
