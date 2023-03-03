/*  1
    22
    333
    4444
    55555   */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int i,j,n;
        System.out.println("Enter number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}