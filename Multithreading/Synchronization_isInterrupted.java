/* What about isInterrupted and interrupted method?
The isInterrupted() method returns the interrupted flag either true or false. 
The static interrupted() method returns the interrupted flag afterthat it sets the flag to false if it is true. */
package aayushi_java.Multithreading;

public class Synchronization_isInterrupted extends Thread{    
    public void run()
    {  
        for(int i=1;i<=2;i++)
        {  
            if(Thread.interrupted())
            {  
                System.out.println("code for interrupted thread");  
            }  
            else
            {  
                System.out.println("code for normal thread");  
            }  
        }
    }  
    public static void main(String args[])
    {  
        Synchronization_isInterrupted t1=new Synchronization_isInterrupted();  
        Synchronization_isInterrupted t2=new Synchronization_isInterrupted();  
        t1.start();  
        t1.interrupt();  
        t2.start();  
    }  
}  