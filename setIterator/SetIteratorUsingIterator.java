package setIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorUsingIterator {

	public static void main(String[] args) {
		// Creating a Set of Integer type
        Set<Integer> numbers = new HashSet<>();
        numbers.add(75);
        numbers.add(82);
        numbers.add(33);
        numbers.add(54);
        System.out.println("Set: " + numbers);

  // Creating an instance of Iterator
        
        Iterator<Integer> iterate = numbers.iterator();
        
        System.out.println("Iterating over Set:");
        
        while(iterate.hasNext()) //iterating over set
        {
          System.out.print(iterate.next() + ", ");

	}

}}
