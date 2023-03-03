/*    1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_18 {
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
                System.out.print(j+ " " );
            }
            System.out.println();
        }
    }
}