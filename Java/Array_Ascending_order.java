/* WAP to enter 10 elements in an array and print the max element from them */
package aayushi_java;
import java.util.*;

public class Array_Ascending_order {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int[] a = new int [10];
        
        int i,j,n,temp;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter the numbers: ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Array in Ascending order:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    } 
}