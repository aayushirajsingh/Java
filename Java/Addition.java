/* Program of Addition of two numbers */
package aayushi_java;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        
        int no1,no2,sum;
        System.out.println("Enter Number 1");
        no1=input.nextInt();
        System.out.println("Enter Number 2:");
        no2=input.nextInt();
        
        sum=no1+no2;
        
        System.out.println("Addition is:"+sum);
    }
}