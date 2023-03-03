/* WAP to enter choice for the weekdays from keyboard and print appropriate for the weekday using if else if ladder */
package aayushi_java;
import java.util.*;

public class If_elseif_Weekdays {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int a;
        System.out.println("Enter the day ");
        a=input.nextInt();
        
        if(a==1)
        {
            System.out.println("Monday");
        }
        else if(a==2)
        {
            System.out.println("Tuesday");
        }
        else if(a==3)
        {
            System.out.println("Wednesday");
        }
        else if(a==4)
        {
            System.out.println("Thursday");
        }
        else if(a==5)
        {
            System.out.println("Friday");
        }
        else if(a==6)
        {
            System.out.println("Saturday");
        }
        else if(a==7)
        {
            System.out.println("Sunday!!");
        }
        else
        {
            System.out.println("DOES NOT EXIST!!");
        }
    }
}
