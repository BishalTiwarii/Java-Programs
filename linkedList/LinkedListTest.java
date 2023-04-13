package linkedList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList(); //linked list 
		l1.add("linkedlist");
		l1.add(100);
		l1.add('B');
		l1.add(false);
		
		LinkedList<String> l2=new LinkedList<>(); //generic linked list
		
		l2.add("Generic string linked list");
		l2.add("bishal");
		l2.add("neel");
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.remove();//removes the first index value
		System.out.println(l1);
		
		l1.addFirst("first");
		System.out.println("after adding to first index = "+l1);
		
		l1.addLast("last");
		System.out.println("after adding to last index = "+l1);
		
        l1.add(2, 200);
        System.out.println("after adding using index number ="+l1);
        
        l1.addAll(l2);
        System.out.println("after adding l2 generic linked list to l1 = "+l1);
        
        l1.clear();
        System.out.println("after clearing all the elements from the linked list = "+l1);
        

	}

}
