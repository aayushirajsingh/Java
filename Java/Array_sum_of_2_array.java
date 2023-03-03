/* WAP to enter 10 elements in two 1D arrays and store their addition in 3rd array */
package aayushi_java;
import java.util.*;

public class Array_sum_of_2_array {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        
        int i,n;
        System.out.println("Enter the size of Array: ");
        n=input.nextInt();
        System.out.println("Enter elements of A: ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("Enter elements of B: ");
        for(i=0;i<n;i++)
        {
            b[i]=input.nextInt();
        }
        System.out.println("Sum of elements of array A & B: ");
        for(i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
            System.out.println(c[i]);
        }
    }   
}