package thread;

class ThreadTest extends Thread{  
public void run()
{  
System.out.println("thread is running...");  
}  

public static void main(String args[]){  
	
ThreadTest t1=new ThreadTest();  
t1.start();  

}  
}  