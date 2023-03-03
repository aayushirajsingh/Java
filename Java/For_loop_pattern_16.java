/*  1
    21
    321
    4321
    54321 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_16 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int i,j,n;
        System.out.println("Enter number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}