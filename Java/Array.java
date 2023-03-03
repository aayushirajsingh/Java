/* WAP to enter 10 elements in an array and print them on screen */
package aayushi_java;
import java.util.*;

public class Array {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[] elements = new int[10];
        
        int i, n;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            elements[i]=input.nextInt();
        }
        System.out.println("Element in the array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(elements[i]);
        }
    } 
}