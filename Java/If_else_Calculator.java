/* WAP to enter any two numbers from keyboard and calculate addition, subtraction, mutiplication, division, modulous of two numbers on the basis of choice using if else if ladder */
package aayushi_java;
import java.util.*;

public class If_else_Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,a,b,c;
        System.out.println("Enter the value of a: ");
        a=input.nextInt();
        System.out.println("Enter the value of b: ");
        b=input.nextInt();
        System.out.println("Enter your choice: 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulus");
        i=input.nextInt();
        
        if(i==1)
        {
            c=a+b;            
            System.out.println("Addition is: "+c);
        }
        else if(i==2)
        {
            c=a-b;
            System.out.println("Subtraction is: "+c);
        }
        else if(i==3)
        {
            c=a*b;
            System.out.println("Multiplication is: "+c);
        }
        else if(i==4)
        {
            c=a/b;
            System.out.println("Division is: "+c);
        }
        else if(i==5)
        {
            c=a%b;
            System.out.println("Modulus is: "+c);
        }
        else
        {
            System.out.println("DOES NOT EXIST!!");
        }
    }
}
