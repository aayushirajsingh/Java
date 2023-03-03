/* Program of synchronized block */
package aayushi_java.Multithreading;

class Table2
{  
    void printTable(int n)
    {  
        synchronized(this)
        {
            for(int i=1;i<=5;i++)
            {  
                System.out.println(n*i);  
                try
                {  
                    Thread.sleep(400);  
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }  
            }  
        }  
    }
}    
class MyThread3 extends Thread
{  
    Table t;  
    MyThread3(Table t)
    {  
        this.t=t;  
    }  
    public void run()
    {  
        t.printTable(5);  
    }  
}  
class MyThread4 extends Thread
{  
    Table t;  
    MyThread4(Table t)
    {  
        this.t=t;  
    }  
    public void run()
    {  
        t.printTable(100);  
    }  
}
public class Synchronized_block {
    public static void main(String args[])
    {  
        Table obj = new Table();
        MyThread1 t1=new MyThread1(obj);  
        MyThread2 t2=new MyThread2(obj);  
        t1.start();  
        t2.start();  
    }  
}