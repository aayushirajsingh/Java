/* Example of currentThread() method */
package aayushi_java.Multithreading;

public class Thread_currentthread extends Thread{  
    public void run()
    {  
        System.out.println(Thread.currentThread().getName());  
    }  
    public static void main(String args[])
    {  
        Thread_currentthread t1=new Thread_currentthread();  
        Thread_currentthread t2=new Thread_currentthread();  
        t1.start();  
        t2.start();  
    } 
}