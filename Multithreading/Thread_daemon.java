/* Simple example of Daemon thread in java */
package aayushi_java.Multithreading;

public class Thread_daemon extends Thread{  
    public void run()
    {  
        if(Thread.currentThread().isDaemon())
        {  
            System.out.println("daemon thread work");  
        }  
        else
        {  
            System.out.println("user thread work");  
        }  
    }  
    public static void main(String[] args)
    {  
        Thread_daemon t1=new Thread_daemon();  
        Thread_daemon t2=new Thread_daemon();  
        Thread_daemon t3=new Thread_daemon();  
        t1.setDaemon(true); 
        t1.start();
        t2.start();  
        t3.start();  
    }  
}  