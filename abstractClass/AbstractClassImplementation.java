package abstractClass;

public class AbstractClassImplementation extends AbstractClass {
	static int a=10;
	static int b=20;

	public static void main(String[] args) {
		AbstractClassImplementation a1=new AbstractClassImplementation();
		a1.sum();
		a1.sub();
		a1.multiply();
		a1.mod();
		a1.divide(50, 5); //passing argument to the concrete method of abstract class

	}

	@Override
	public void sum() {
		
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		
		System.out.println(b-a);
		
	}

	@Override
	public void multiply() {
		System.out.println(a*b);		
		
	}

	@Override
	public void mod() {
		System.out.println(b%a);
		
	}

}
