/*  1  
    1 4  
    1 4 9  
    1 4 9 16  
    1 4 9 16 25   */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_5 {
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
                System.out.print(j*j+ " ");
            }
            System.out.println();
        }
    }
}