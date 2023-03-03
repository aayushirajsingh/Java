/* WAP to enter any number from the keyboard and find out the max digit in the number using while loop */
package aayushi_java;
import java.util.*;

public class While_loop_max_digit {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int digit,num,large=0;
        System.out.println("Enter a number: ");
        num=input.nextInt();
        while(num>0)
        {
            digit= num%10;
            if(digit>large)
            {
                large=digit;
            }
            num/=10;    
        }
        System.out.println("Maximum digit= "+ large);    
    }
}