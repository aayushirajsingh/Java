/*    5
     44
    333
   2222
  11111 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_19 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,k,n;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(n+1-i);
            }
            System.out.println();
        }
    }
}