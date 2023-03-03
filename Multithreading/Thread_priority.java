/* Example of priority of a Thread:
   Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10. */
package aayushi_java.Multithreading;

public class Thread_priority extends Thread{  
    public void run()
    {  
        System.out.println("running thread name is:"+Thread.currentThread().getName());  
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
    }  
    public static void main(String args[]){  
        Thread_priority m1=new Thread_priority();  
        Thread_priority m2=new Thread_priority();  
        m1.setPriority(Thread.MIN_PRIORITY);  
        m2.setPriority(Thread.MAX_PRIORITY);  
        m1.start();  
        m2.start();  
    }  
}     