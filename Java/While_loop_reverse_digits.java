/* WAP to enter any number from the keyboard and print them in reverse using while loop */
package aayushi_java;
import java.util.*;

public class While_loop_reverse_digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,num,sum=0;
        System.out.println("Enter a number: ");
        num=input.nextInt();
        while(num>0)
        {
            a=(num%10);
            sum=sum*10+a;
            num/=10;
        }
        System.out.println("Reverse: "+sum);
    }
}