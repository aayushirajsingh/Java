/*  1
    12
    123
    1234
    12345 */
package aayushi_java;
import java.util.Scanner;

public class For_loop_pattern_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i,j,n;
        System.out.println("Enter number upto which you want:");
        n=in.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");  
        }
    }
}