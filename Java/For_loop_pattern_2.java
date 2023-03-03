/* 2 9 28 65 126 ... */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,n;
        System.out.println("Enter a number: ");
        n=input.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            a=(i*i*i)+1;
            System.out.print(a+ " ");
        }      
    }
}