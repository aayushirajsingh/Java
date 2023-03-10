/* Reentrant Monitor in Java */
package aayushi_java.Multithreading;

class Reentrant
{
    public synchronized void m()
    {
        n();
        System.out.println("this is m() method");
    }
    public synchronized void n()
    {
        System.out.println("this is n() method");
    }
}
public class Synchronization_Reentrantmonitor {
    public static void main(String[] args) 
    {
        final Reentrant re = new Reentrant();
        Thread t1 = new Thread()
        {
            public void run()
            {
                re.m();
            }
        };
        t1.start();
    }
}