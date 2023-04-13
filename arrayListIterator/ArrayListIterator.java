package arrayListIterator;
import java.util.ArrayList;
import java.util.Iterator;;
public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("data");
		a1.add("structure");
		a1.add("algorithm");
		
		for (int i = 0; i < a1.size(); i++) //accessing values in the ArrayList one by one.
		{
			
			System.out.println(a1.get(i));
			
		}
		
		Iterator a2=a1.iterator(); //Iterating ArrayList
		
		while (a2.hasNext()) 
		{
			
			System.out.println(a2.next());
			
		}
		
		for (Iterator iterator = a1.iterator(); iterator.hasNext();)//deleting values from the array list.
		{
		
			String string = (String) iterator.next();
			if(string.endsWith("re"))
				iterator.remove();
			
			
		}
         System.out.println(a1);
	}

	
}

 