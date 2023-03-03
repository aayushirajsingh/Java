/* Java Thread Example by extending Thread class */
package aayushi_java.Multithreading;
//import java.util.*;

public class Thread_extending extends Thread {
    public void run()
    {
        System.out.println("thread is running...");
    }
    public static void main (String[] args)
    {
        Thread_extending t1= new Thread_extending();
        t1.start();
    }
}