/* Example of sleep method in java */
package aayushi_java.Multithreading;

public class Thread_sleep extends Thread {
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }        
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Thread_sleep t1 = new Thread_sleep();
        Thread_sleep t2 = new Thread_sleep();
          
        t1.start();
        t2.start();       
    }
}