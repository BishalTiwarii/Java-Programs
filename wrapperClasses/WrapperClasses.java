package wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		int i=100;
		
		Integer a=Integer.valueOf(i);//Explicitly conerting int to Integer
		
		Integer b=i;//autoboxing
		System.out.println(i+" "+a+" "+b);
		
		//converting Integer to int
		
		Integer c=Integer.valueOf(3);
		int d=Integer.valueOf(c); //converting integer to int explicitly
		int j=c; //unboxing //compiler will write j.intValue() internally
		
		System.out.println(c+" "+d+" "+j);
		
		
		byte e=10;
		short f=20;
		int g=30;
		long h=40;
		float k=50.0F;
		double l=60.0D;
		char m='a';
		boolean n=true;
		
		//Autoboxing converting primitives data type into objects
		
		Byte byteobj=e;
		Short shortobj=f;
		Integer integerobj=g;
		Long longobj=h;
		Float floatobj=k;
		Double doubleobj=l;
		Character charobj=m;
		Boolean booleanobj=n;
		
		//printing objects
		System.out.println("------printing objects value-------");
		System.out.println("Byte object= "+byteobj);
		System.out.println("Short object= "+shortobj);
		System.out.println("Integer object= "+integerobj);
		System.out.println("Long object= "+longobj);
		System.out.println("Float object= "+floatobj);
		System.out.println("Double object= "+doubleobj);
		System.out.println("Character object= "+charobj);
		System.out.println("Boolean object= "+booleanobj);
		
		//converting objects to primitives also known as unboxing
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=integerobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		
		//printing primitives
		System.out.println("-----printing primitives value----");
		System.out.println("byte value= "+bytevalue);
		System.out.println("short value= "+shortvalue);
		System.out.println("int value= "+intvalue);
		System.out.println("long value= "+longvalue);
		System.out.println("float value= "+floatvalue);
		System.out.println("double value= "+doublevalue);
		System.out.println("char value= "+charvalue);
		System.out.println("boolean value= "+booleanvalue);
		
		
		
		

	}

}
