/* Example of interrupting a thread that stops working */
package aayushi_java.Multithreading;

public class Synchronization_interrupting extends Thread{  
    public void run()
    {  
        try
        {  
            Thread.sleep(1000);  
            System.out.println("task");  
        }
        catch(InterruptedException e)
        {  
            System.out.println("Exception handled "+e);  
        }  
        System.out.println("thread is running...");  
    }     
    public static void main(String args[])
    {  
        Synchronization_interrupting t1=new Synchronization_interrupting();  
        t1.start();  
        t1.interrupt();  
    }  
}  