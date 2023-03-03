/* Example of interrupting thread that behaves normally */
package aayushi_java.Multithreading;

public class Synchronization_interrupted_normal extends Thread{    
    public void run()
    {  
        for(int i=1;i<=5;i++)  
        System.out.println(i);  
    }  
  
    public static void main(String args[])
    {  
        Synchronization_interrupted_normal t1=new Synchronization_interrupted_normal();  
        t1.start();  
        t1.interrupt();   
    }  
}