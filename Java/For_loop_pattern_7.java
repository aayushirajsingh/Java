/*  1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i,j,n,k=1;
        System.out.println("Enter number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}