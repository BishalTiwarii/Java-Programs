package thread;


//A Java program for understanding 
//The ThreadJoin class is the child class of the class Thread  
public class ThreadJoin extends Thread  
{  
//overriding the run method  
public void run()  
{  
for (int j = 0; j < 2; j++)  
{  
try  
{  
//sleeping the thread for 300 milli seconds  
Thread.sleep(300);  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
}  
//catch block for catching the raised exception  
catch(Exception e)  
{  
System.out.println("The exception has been caught: " + e);  
}  
System.out.println( j );  
}  
}  

//main method  
public static void main (String argvs[])  
{  

//creating 3 threads  
ThreadJoin thread1 = new ThreadJoin();  
ThreadJoin thread2 = new ThreadJoin();  
ThreadJoin thread3 = new ThreadJoin();  

//thread thread1 starts  
thread1.start();  

//starting the second thread after when  
//the first thread th1 has ended or died.  

try  
{  
System.out.println("The current thread name is: "+ Thread.currentThread().getName());  

//invoking the join() method  
thread1.join();  
}  

//catch block for catching the raised exception  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}  

//thread thread2 starts  
thread2.start();  

//starting the thread3 thread after when the thread thread2 has ended or died.  
try  
{  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
thread2.join();  
}  

//catch block for catching the raised exception  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}  

//thread thread3 starts  
thread3.start();  
}  
}  