/* WAP to enter any number from keyboard and check whether the number is palindrome or not */
package aayushi_java;
import java.util.*;

public class While_loop_palindrome {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,n,sum=0,temp;    
        System.out.print("Enter a number: ");
        n=input.nextInt();
        temp=n;
        
        while(n>0)
        {    
            a=n%10;
            sum=(sum*10)+a;    
            n=n/10;    
        }    
        if(temp==sum)    
        {
            System.out.println("Palindrome number ");
        }
        else
        {
            System.out.println("Not Palindrome");    
        }  
    }
}