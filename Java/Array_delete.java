/* WAP to enter 10 elements and delet an element */
package aayushi_java;
import java.util.*;

public class Array_delete {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[] a = new int[10];
        
        int i,j,r,n;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.print("Enter the element you want to delete: ");
        r=input.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==r)
            {
                break;
            }
        }
        for(j=i;j<n;j++)
        {
            a[j]=a[j+1];
        }
        n--;
        System.out.println("New array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    } 
}