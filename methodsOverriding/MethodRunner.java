package methodsOverriding;

public class MethodRunner extends Method {

	public static void main(String[] args) {
		MethodRunner method=new MethodRunner();
		method.test();
		System.out.println(method.test2(10));
		
    }
	public void test()
	{
		System.out.println("method successfully overrided");
	}
	
	public int test2(int a) 
	{
		return a;
		
		
	}

}
