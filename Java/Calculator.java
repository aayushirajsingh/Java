/* WAP to enter any two numbers from keyboard and calculate addition, subtraction, multiplication, division, modulation of two numbers */
package aayushi_java;
import java.util.*;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner input  = new Scanner (System.in);
        
        int a, b, add, sub, multi, div, mod;
        System.out.println("Enter number 1");
        a=input.nextInt ();
        System.out.println("Enter number 2");
        b=input.nextInt ();
        
        add=a+b;
        sub=a-b;
        multi= a*b;
        div=a/b;
        mod=a%b;
        
        System.out.println("Addition is: "+add);
        System.out.println("Subtraction is: "+sub);
        System.out.println("Multiplication is: "+multi);
        System.out.println("Division is: "+div);
        System.out.println("Modulous is: "+mod);
    }
}
