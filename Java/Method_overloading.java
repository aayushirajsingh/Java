/* Program for method overloading */
package aayushi_java;
import java.util.*;

class addition
 {
     public void sum(int a)
        {
            System.out.println(a+a);   
        }
     public void sum(int a,int b)
     {
         System.out.println(a+b);
     }
     public void sum(int a,int b,int c)
     {
         System.out.println(a+b+c);
     }
 }
public class Method_overloading {
    public static void main(String[] args) {
        
        addition a1=new addition();
        a1.sum(5);
        a1.sum(5, 10);
        a1.sum(5,6,7);
    }
}