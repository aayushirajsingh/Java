/* Example of run method */
package aayushi_java.Multithreading;

public class Thread_run extends Thread{
    public void run()
    {
        System.out.println("running...");
    }
    public static void main(String[] args)
    {
        Thread_run t1 = new Thread_run();
        t1.run();
    }
}