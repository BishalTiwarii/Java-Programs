package nonStatic;

public class NonStatic {
	int i; //non static variable
	int j;
	{
		System.out.println("first non static block");
	}
	{
		System.out.println("second non static block");
	}

	public static void main(String[] args) {
	
		NonStatic ns=new NonStatic();
		//modifying the value of the non static variable using object.variable name
        ns.i=10;
		ns.j=100;
		
		//calling non static method using object name.method name
		System.out.println(ns.sub());

	}
	
	//non-static method
	public int sub()
	{
		int sub=j-i;
		return sub;
	}

}
