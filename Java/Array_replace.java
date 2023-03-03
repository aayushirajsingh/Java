/* WAP to enter 10 elements and replace old element with new element */
package aayushi_java;
import java.util.*;

public class Array_replace {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[] a = new int[10];
        
        int i,b,r,n;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.print("Enter the element you want to replace: ");
        r=input.nextInt();
        System.out.print("Enter new element: ");
        b=input.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==r)
            {
                a[i]=b;
            }
        }
        System.out.println("New array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    } 
}