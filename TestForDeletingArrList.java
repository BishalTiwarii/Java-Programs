package bishal;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestForDeletingArrList {

	public static void main(String[] args) {
		ArrayList<String> word=new ArrayList<>();
		word.add("cat");
		word.add("dog");
		word.add("bat");
		
		word.remove(2); //deleting values with index number from array list
		
		System.out.println(word);
		
		for (Iterator iterator = word.iterator(); iterator.hasNext();) //deleting using sub string
		{
			String string = (String) iterator.next();
			if(string.startsWith("ca"))
				iterator.remove();
		}

		System.out.println(word);
		
		List<String> word2=new ArrayList<String>();
		word2.add("apple");
		word2.add("grapes");
		word2.add("watermelon");
		
		word.addAll(word2);
		System.out.println(word);
		
	}

}
