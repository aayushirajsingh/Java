 /* 0 6 24 60 120 ... */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,n;
        System.out.println("Enter a number: ");
        n=input.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            a=(i*i*i)-i;
            System.out.print(a+ " ");
        }      
    }
}