package thread;

public class MyFirstThread {
	
	
	// Main method   
	
	public static void main(String argvs[])  
	{  
		
	// creating an object of the Thread class using the constructor Thread(String name)   
		
	Thread thread= new Thread("My first thread");  
	  
	// the start() method moves the thread to the active state 
	
	  thread.start(); 
	
	// getting the thread name by invoking the getName() method  
	
	String str = thread.getName();  
	System.out.println(str);  
	
	}  

}
