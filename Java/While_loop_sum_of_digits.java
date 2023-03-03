/* WAP to enter any number from the keyboard and calculate the total number of the digits using while loop */
package aayushi_java;
import java.util.*;

public class While_loop_sum_of_digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int sum=0,num;
        System.out.println("Enter a number: ");
        num=input.nextInt();
        while(num>0)
        {
            sum+=(num%10);
            num/=10;
        }
        System.out.println("Sum of digits= "+sum);    
    }
}