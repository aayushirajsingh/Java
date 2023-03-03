/* WAP to enter any three numbers from keyboard and find out the max number from them */
package aayushi_java;
import java.util.*;

public class Nested_if_Max_numb_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int a,b,c;
        System.out.println("Enter the 3 numbers: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+ " is greater");                
            }
            else
            {
                System.out.println(c+ " is greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+ " is greater");
            }
            else
            {
                System.out.println(c+ " is greater");
            }
        }
    }       
}