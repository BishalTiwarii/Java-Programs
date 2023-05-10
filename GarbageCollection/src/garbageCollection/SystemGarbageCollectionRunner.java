package garbageCollection;

public class SystemGarbageCollectionRunner {

	public static void main(String[] args) {
		String s1=new String("java");
		
		System.out.println(s1);
		s1=null;
		System.gc(); //By using System class

	}

}
