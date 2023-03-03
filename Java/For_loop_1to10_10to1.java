/* WAP for For loop to print 1 to 10 */
package aayushi_java;
import java.util.*;

public class For_loop_1to10_10to1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Printing 1 to 10:");
          
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);        
        }
        
        System.out.println("\nPrinting 10 to 1:");
        
        for(int i=10;i>=1;i--)
        {
            System.out.println(i);        
        }
    }
}
