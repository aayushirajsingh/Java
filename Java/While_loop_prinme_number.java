/* WAP to enter any number from keyboard and check whether the number is prime or not */
package aayushi_java;
import java.util.*;

public class While_loop_prinme_number {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a=2,n,i=0;
        System.out.print("Enter a number: ");
        n=input.nextInt();
        while(a<=n/2)
        {
            if(n%a==0)
            {
                i++;
                break;
            }
            a++;
        }
        if (i == 0 ) 
        {
            System.out.print(n + " is a prime number ");
        } 
        else 
        {
            System.out.print(n + " is not a prime number ");
        }
    }
}