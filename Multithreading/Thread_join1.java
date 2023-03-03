/* Example of join(long miliseconds) method */
package aayushi_java.Multithreading;

public class Thread_join1 extends Thread{  
    public void run()
    {  
        for(int i=1;i<=5;i++){  
        try
        {  
            Thread.sleep(500);  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        System.out.println(i);  
    }  
}  
public static void main(String args[]){  
    Thread_join1 t1=new Thread_join1();  
    Thread_join1 t2=new Thread_join1();  
    Thread_join1 t3=new Thread_join1();  
    t1.start();  
    try
    {  
        t1.join(1500);  
    }
    catch(Exception e)
    {
        System.out.println(e);
    }  
    t2.start();  
    t3.start();  
    }  
}  