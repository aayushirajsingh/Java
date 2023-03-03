/*  5432112345
    5432  2345
    543    345
    54      45
    5        5 */
package aayushi_java;
import java.util.*;

public class For_loop_pattern_22 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        /*int i,j,k,n;
        System.out.println("Enter number of rows: ");
        n=input.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)   //upper left triangle
            {
                System.out.print(j);
            }
            for(k=1;k<i;k++)
            {
                System.out.print(" ");            
            }
            for(j=i;j<=n;j++)   //upper right triangle
            {
                System.out.print(j);
            }
            System.out.println();
        }*/
        int i,j;
        int n = input.nextInt();
        for(i=n;i>n;i--)
        {
            for(j=0;j<(2*n);j++)
            {
                if(i+j<=n-1)  // upper left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if((i+n)<=j) // upper right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}