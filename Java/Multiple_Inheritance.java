/* Program of Multiple inheritance */
package aayushi_java;
import java.util.*;

interface Printable
{
    void print();
}
interface Showable
{
    void show();
}
class A7 implements Printable,Showable
{
    @Override
    public void print()
    {
        System.out.println("Hello");
    }
    @Override
    public void show()
    {
        System.out.println("Welcome");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) 
    {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}