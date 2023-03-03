/* WAP to create Fibonacci series */
package aayushi_java;
import java.util.*;

public class For_loop_Fibonacci {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int a=1,b=0,c=0,n;
        System.out.print("Enter the number of terms: ");
        n=input.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
}
