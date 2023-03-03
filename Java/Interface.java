/* Program for interface */
package aayushi_java;
import java.util.*;

interface printable 
{
    void print();   //all methods in interface are by default abstarct, so no need to write abstract.
}
class A6 implements printable
{
    public void print()
    {
        System.out.println("Hello");
    }
}
public class Interface {
    public static void main(String[] args) 
    {
        A6 obj = new A6();
        obj.print();
    }
}