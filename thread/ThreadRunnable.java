package thread;

public class ThreadRunnable implements Runnable {
	

	public static void main(String[] args) {
		
		ThreadRunnable t1=new ThreadRunnable();
		
		Thread thread =new Thread(t1);   // Using the constructor Thread(Runnable r)  
		
	     thread.start();
		

	}

	@Override
	public void run() {
	System.out.println("Thread is running....");
		
	}

}
