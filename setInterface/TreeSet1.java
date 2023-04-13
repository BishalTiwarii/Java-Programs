package setInterface;
import java.util.TreeSet;
public class TreeSet1 {
	public static void main(String [] args)
	{
		TreeSet<Integer> treeSet=new TreeSet<>();
		treeSet.add(100);
		treeSet.add(90);
		treeSet.add(80);
		treeSet.add(70);
		treeSet.add(10);
		treeSet.add(9);
		
		System.out.println("from treeSet = "+treeSet);
		
		TreeSet<Integer> treeSet1=new TreeSet<>();
		treeSet1 .add(100);
		treeSet1.add(90);
		treeSet1.add(80);
		treeSet1.add(70);
		treeSet1.add(10);
		treeSet1.add(9);
		
		System.out.println("from treeSet1 = "+treeSet1);
		
		System.out.println(treeSet.floor(10));
		System.out.println(treeSet.lower(10));
		System.out.println(treeSet.lower(100));
		System.out.println("Are treeSet and treeSet1 equal? = "+treeSet.equals(treeSet1));
        System.out.println(treeSet.higher(80));
        System.out.println(treeSet.ceiling(80));
        System.out.println(treeSet.subSet(80,false,100,false));
        System.out.println(treeSet.subSet(80,true,100,true));


		
		
		
		
	}

}
