package setInterface;

import java.util.List;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class SetTest {

	public static void main(String[] args) {
		List<Character> arr=new ArrayList<>();
		 arr.add('A');
		 arr.add('Z');
		 arr.add('A');
		 arr.add('Z');
		 arr.add('B');
		 arr.add('D');
		 System.out.println("from array list= s"+arr);
		 HashSet<Character> words=new HashSet(arr);//Sometime sorted /sometimes not +no insertion order maintain

		 
		 System.out.println("from HashSet = "+words);
		 
		 TreeSet<Character> words1=new TreeSet<Character>(arr);//Insertion is in Sorted Manner+avoid duplicates
		 System.out.println("from TreeSet = "+words1);
		 
		 LinkedHashSet<Character> words2=new LinkedHashSet<>(arr); //Maintain insertion order & avoid duplicates.
		 System.out.println("from LinkedHashSet = "+words2);
			}

}
