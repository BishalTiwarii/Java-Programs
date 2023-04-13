package variables;

public class Variables {
	 static String name; //static global variable
	 int mobno; //non static global variable
	 
	 public static void main(String [] args)
	 {
		 int mobno=10; //local variable
		
		 System.out.println(name);//printing the value of static global variable
		 Variables obj=new Variables();//object creation of class
		System.out.println(obj.mobno); //printing the non static global variable value
		 System.out.println(mobno);//printing the value of local variable
		 System.out.println(name);
		 
	 }
	 

}
