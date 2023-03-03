/*  1
    10
    101
    1010
    10101 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_6 {
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
                if(j%2==0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}