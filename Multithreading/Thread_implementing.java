/* Java Thread Example by implementing Runnable interface */
package aayushi_java.Multithreading;

public class Thread_implementing implements Runnable{
    public void run()
    {
        System.out.println("threading is running...");
    }
    public static void main(String[] args)
    {
        Thread_implementing t1 = new Thread_implementing();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}