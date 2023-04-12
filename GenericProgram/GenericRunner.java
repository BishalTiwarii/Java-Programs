package GenericProgram;


public class GenericRunner {

	public static void main(String[] args) {
		GenericTest<String> list=new GenericTest<>();
		list.addElement("string0");
		list.addElement("string1");
		
		GenericTest<Integer> list2=new GenericTest<>();
		list2.addElement(Integer.valueOf(100));
		list2.addElement(200);
		list2.addElement(300);
		
		
		System.out.println(list);
		System.out.println(list2);
		list2.removeElement(300);
		System.out.println(list2);
		
		String value=list.get(0);
		Integer intValue=list2.get(0);
		
		System.out.println(value);
		System.out.println(intValue);
		
		

	}

}
