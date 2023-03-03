/* WAP to enter 10 elements and insert a new element */
package aayushi_java;
import java.util.*;

public class Array_insert {
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
            System.out.print("Position "+i+ " :");
            a[i]=input.nextInt();
        }
        System.out.print("Enter the position of the element where you want to insert: ");
        r=input.nextInt();
        System.out.print("Enter new element: ");
        b=input.nextInt();
        for(i=n;i>=r;i--)
        {
            a[i]=a[i-1];
        }
        a[r]=b;
        n++;
        System.out.println("New array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    } 
}