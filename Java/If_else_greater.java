/* WAP to enter any two numbers from the keyboard and find the greater number of two using if else */
package aayushi_java;
import java.util.*;

public class If_else_greater {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int a,b;
        System.out.print("Enter the value of a : ");
        a = input.nextInt();
        System.out.print("Enter the value of b : ");
        b = input.nextInt();
        if(a>b)
        {
            System.out.print("a is greater");
        }
        else
        {
            System.out.print("b is greater");
        }
    }
}
