/* WAP to print Factorials of the number entered */
package aayushi_java;
import java.util.*;

public class For_loop_Factorial {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a=1,n;
        System.out.println("Enter a number: ");
        n=input.nextInt();
        
        for (int i=1;i<=n;i++)
        {
            a=i*a;
        }
        
        System.out.println("Factorial of " +n+ " is: "+a);
    }
}