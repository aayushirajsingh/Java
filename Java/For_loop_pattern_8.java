/*  54321
    5432
    543
    54
    5 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,n;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}