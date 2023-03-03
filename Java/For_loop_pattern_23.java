/* 11111
    2222
     333
      44
       5 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_23 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,k,n;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(j=n;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}