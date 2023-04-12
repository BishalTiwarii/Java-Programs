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
}
