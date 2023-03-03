/* 0 3 8 15 24 ... */
package aayushi_java;
import java.util.*;

public class For_loop_pattern {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,n;
        System.out.println("Enter a number: ");
        n=input.nextInt();
        
        for(int i=0;i<n;i++)
        {
            a=i*(i+1)+i;
            System.out.print(a+ " ");
        }      
    }
}