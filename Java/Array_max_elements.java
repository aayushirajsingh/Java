/* WAP to enter 10 elements in an array and print the max element from them */
package aayushi_java;
import java.util.*;

public class Array_max_elements {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] elements = new int[10];
        
        int i,n,max=0;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            elements[i]=input.nextInt();
            if(elements[i]>max)
            {            
                max=elements[i];
            }
        }
        System.out.println("Max element in the array: "+max);
    } 
}