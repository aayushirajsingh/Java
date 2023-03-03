/*  55555
    4444
    333
    22
    1 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,n;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        
        for(i=n;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}