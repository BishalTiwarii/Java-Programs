package thread;

public class MySecondThread implements Runnable{

	@Override
	public void run() {
	System.out.println("my new thread is running");
		
	}
	
	public static void main(String argvs[])  
	{   
		
	// creating an object of the class MyThread2  
	Runnable r1 = new MySecondThread();   
	  
	// creating an object of the class Thread using Thread(Runnable r, String name)  
	Thread thread1 = new Thread(r1, "My new thread");    
	  
	// the start() method moves the thread to the active state  
	thread1.start();   
	  
	// getting the thread name by invoking the getName() method  
	
	String str = thread1.getName();  
	System.out.println(str);  
	
	}    

}
