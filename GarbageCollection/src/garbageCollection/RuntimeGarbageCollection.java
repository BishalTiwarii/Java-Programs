package garbageCollection;

public class RuntimeGarbageCollection {

	public static void main(String[] args) {
		String s1=new String("Ruby");
		String s2=new String("c++");
		
		s1=new String("python");
		
		Runtime r1=Runtime.getRuntime();
		System.out.println(r1.freeMemory());
		r1.gc(); //by using Runtime class
		System.out.println(r1.freeMemory());
        
	
	}

}
