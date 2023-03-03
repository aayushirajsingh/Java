/* 0 2 6 12 20 ... */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a=0,n;
        System.out.println("Enter a number: ");
        n=input.nextInt();
        
        for(int i=0;i<n;i++)
        {
            a=a+(2*i);
            System.out.print(a+ " ");
        }      
    }
}