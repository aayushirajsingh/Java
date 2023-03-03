/* WAP to enter any two numbers from the keyboard and check wheather the number is odd or even */
package aayushi_java;
import java.util.*;

public class If_else_Even_odd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a;
        System.out.println("Enter the number : ");
        a = input.nextInt();
        
        if (a%2==0)
        {
            System.out.println(a+ " is Even");
        }
        else
        {
            System.out.println(a+ " is Odd");
        }
    }    
}