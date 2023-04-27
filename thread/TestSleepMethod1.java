package thread;
class TestSleepMethod1 extends Thread{    
	 public void run()
	 {    
	  for(int i=1;i<5;i++)
	  {   
	  
		  // the thread will sleep for the 600 milli seconds  
		  
	    try{
	    	Thread.sleep(600);
	    	}
	    catch(InterruptedException ex)
	    {
	    	System.out.println(ex);
	    }    
	    
	    System.out.println(i);    
	  }    
	 }    
	 public static void main(String args[])
	 {    
	  TestSleepMethod1 thread1=new TestSleepMethod1();    
	  TestSleepMethod1 thread2=new TestSleepMethod1();    
	     
	  thread1.start();    
	  thread2.start();    
	 }    
	}    