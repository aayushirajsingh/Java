/* WAP to print 3 digit Armstrong number using while loop */
package aayushi_java;
import java.util.*;

public class While_loop_armstrong {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int num, sum=0, temp;
        System.out.println("Enter a number: ");
        num=input.nextInt();
        temp=num;
        while(num>0)
        {
            sum=sum+(num%10)*(num%10)*(num%10);
            num/=10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
    }
}