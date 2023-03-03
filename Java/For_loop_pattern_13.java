/*  5
    44
    333
    2222
    11111 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,n;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}