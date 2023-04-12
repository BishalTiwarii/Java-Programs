package FunctionalPrograming;
import java.util.ArrayList;

public class FunctionalProgramming {

	public static void main(String[] args) {
		PrintBasicFp basic=new PrintBasicFp();
		ArrayList<String> list=new ArrayList<>();
		list.add("Cat");
		list.add("Dog");
		list.add("Giraffe");
		list.add("Lion");
		
		basic.printBasic(list);
		
		ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
        
        basic.printBasicInt(list2);

	}

	

}
