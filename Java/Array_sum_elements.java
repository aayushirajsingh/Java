/* WAP to enter 10 elements in an array and print the sum of all the array elements */
package aayushi_java;
import java.util.*;

public class Array_sum_elements {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[] elements = new int[10];
        
        int i,n,sum=0;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            elements[i]=input.nextInt();
            sum+=elements[i];
        }
        System.out.println("Sum of elements in the array: "+sum);
    } 
}