package setInterface;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
	 HashSet<String> words=new HashSet();
	 words.add("Apple");
	 words.add("Banana");
	 words.add("cat");
	
	 System.out.println(words);//insertion order is not constant
	 
	 System.out.println(words.add("Apple")); //do not accept duplicate values

	}

}
