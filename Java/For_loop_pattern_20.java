/*  1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1   */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_20 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int i,j,k,n;
        System.out.println("Enter number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+ " " );
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+ " " );
            }
            System.out.println();
        }
    }
}