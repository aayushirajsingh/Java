/*  12345
    1234
    123
    12
    1 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,n;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}