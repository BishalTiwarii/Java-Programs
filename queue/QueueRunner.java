package queue;

import java.util.Queue;
import java.util.List;
import java.util.PriorityQueue;

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> words=new PriorityQueue<String>();
		words.offer("zebra"); //adds the element
		words.offer("Zebra");
		words.offer("Monkey");
		words.offer("cat");
		words.offer("Lion");
		
		System.out.println(words);
		
		System.out.println(words.poll());//removes the first element
		System.out.println(words.peek()); //can look what element is at first
		System.out.println(words);
		
		System.out.println(words.hashCode());
		System.out.println(words.size());
		
		

	}

}
