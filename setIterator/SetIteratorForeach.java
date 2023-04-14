package setIterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetIteratorForeach {

	public static void main(String[] args) {
		// Creating a set
		
	    Set<String> languages = new HashSet<>();
	    languages.add("Java");
	    languages.add("ruby");
	    languages.add("Python");
	    languages.add("c++");
	    System.out.println("Set: " + languages);

	    // Using forEach loop
	    
	    System.out.println("Iterating over Set using for-each loop:");
	    for(String language : languages) 
	      System.out.print(language);
	      System.out.print(", ");
	      
	      

	}

}
