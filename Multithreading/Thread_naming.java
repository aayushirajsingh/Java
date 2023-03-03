/* Example of naming a thread
   getName(),setName(String) and getId() method: */
package aayushi_java.Multithreading;

public class Thread_naming extends Thread{  
    public void run()
    {  
        System.out.println("running...");  
    }  
    public static void main(String args[])
    {  
        Thread_naming t1=new Thread_naming();  
        Thread_naming t2=new Thread_naming();  
        System.out.println("Name of t1:"+t1.getName());  
        System.out.println("Name of t2:"+t2.getName());  
        System.out.println("id of t1:"+t1.getId());  
  
        t1.start();  
        t2.start();  

        t1.setName("Sonoo Jaiswal");  
        System.out.println("After changing name of t1:"+t1.getName());  
    }  
}  