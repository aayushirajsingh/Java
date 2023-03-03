/*WAP to enter any two numbers from the keyboard and check wheather the number is positive or negative */
package aayushi_java;
import java.util.*;

public class If_else_Pos_Neg {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a;
        System.out.println("Enter the number : ");
        a = input.nextInt();
        
        if (a>0)
        {
            System.out.println(a+ " is Positive");
        }
        else
        {
            System.out.println(a+ " is Negative");
        }
    }    
}