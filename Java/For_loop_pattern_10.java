/*  11111
    2222
    333
    44
    5   */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int i,j,n;
        System.out.println("Enter number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}