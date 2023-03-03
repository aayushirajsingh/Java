/* WAP to enter any number from the keyboard and count the number of digits using while loop */
package aayushi_java;
import java.util.*;

public class While_loop_number_of_digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int digit,num,large=0;
        System.out.println("Enter a number: ");
        num=input.nextInt();
        while(num>0)
        {
            digit= num%10;
            if(digit>0)
            {
                large++;
            }
            num/=10;    
        }
        System.out.println("Number of digits= "+ large);    
    }
}