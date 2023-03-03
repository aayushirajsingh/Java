/* WAP to enter any two numbers from keyboard and calculate addition, subtraction, mutiplication, division, modulous of two numbers on the basis of choice using Switch case */
package aayushi_java;
import java.util.*;

public class Switch_case_calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,a,b,c;
        System.out.println("Enter the value of a: ");
        a=input.nextInt();
        System.out.println("Enter the value of b: ");
        b=input.nextInt();
        System.out.println("Enter your choice: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");
        i=input.nextInt();
        
        switch (i) 
        {
            case 1:
                c=a+b;
                System.out.println("Addition is: "+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction is: "+c);
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication is: "+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Division is: "+c);
                break;
            case 5:
                c=a%b;
                System.out.println("Modulus is: "+c);
                break;
            default:
                System.out.println("DOES NOT EXIST!!");
                break;
        }
    }
}
