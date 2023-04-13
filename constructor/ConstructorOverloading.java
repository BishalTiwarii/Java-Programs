package constructor;

public class ConstructorOverloading {
	private int a;
	private int b;
	private String str;
	
	public ConstructorOverloading()
	{
		System.out.println("from no argument Constructor");
	}

	public ConstructorOverloading(int a, int b, String str) {
		
		this.a = a;
		this.b = b;
		this.str = str;
		
		System.out.println("from int,int,string constructor");
	}
	public ConstructorOverloading(int a)
	{
		this.a=a;
		System.out.println("from int arguument constructor");
	}
	public ConstructorOverloading(String str)
	{
		this.str=str;
		System.out.println("from string argument constructor");
	}
	

	public static void main(String[] args) {
		
		ConstructorOverloading co1=new ConstructorOverloading();
		ConstructorOverloading co2=new ConstructorOverloading("calling string constructor");
		ConstructorOverloading co3=new ConstructorOverloading(100);
		ConstructorOverloading co4=new ConstructorOverloading(20,50,"string");
		

	}

}
