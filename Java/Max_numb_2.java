/*WAP to enter any two numbers from the keyboard and find the greater number of two using if else  */
package aayushi_java;
import java.util.*;

public class Max_numb_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a, b;
        System.out.println("Enter the number 1: ");
        a= input.nextInt();
        System.out.println("Enter the number 2");
        b= input.nextInt();
        
        if (a>b)
        {
            System.out.println(a+ " is Greater");
        }
        else
        {
            System.out.println(b+ " is Greater");
        }
    }    
}