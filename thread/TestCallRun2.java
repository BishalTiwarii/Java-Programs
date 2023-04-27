package thread;

public class TestCallRun2 extends Thread{  
	 public void run()
	 {  
	  for(int i=1;i<=5;i++)
	  {  
	    try{Thread.sleep(500);
	    }
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[])
	 { 
		 
	  TestCallRun2 thread1=new TestCallRun2();  
	  TestCallRun2 thread2=new TestCallRun2();  
	  
	  //will be treated as a normal object instead of thread object if you directly call the run()
	  
	  thread1.run();  
	  thread2.run();  
	
	 }  
	
}  