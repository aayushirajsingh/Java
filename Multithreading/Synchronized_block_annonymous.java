/* Program of synchronized block by using annonymous class */
package aayushi_java.Multithreading;

class Table3
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
public class Synchronized_block_annonymous {
    public static void main(String args[])
    {  
        final Table obj = new Table();  
        Thread t1=new Thread()
        {  
            public void run()
            {
                obj.printTable(5);  
            }  
        };  
        Thread t2=new Thread()
        {  
            public void run()
            {  
                obj.printTable(100);  
            }  
        };  
        t1.start();  
        t2.start();  
    }  
}  