/* WAP to enter 10 elements in an array and calculate total number of positive and negative elements in them */
package aayushi_java;
import java.util.*;

public class Array_Pos_Neg {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[] elements = new int[10];
        
        int i,n,o=0,e=0;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            elements[i]=input.nextInt();
            if (elements[i]>0)
            {
                e++;
            }
            else
            {   
                o++;
            }
        }
        System.out.println("Positive numbers: "+e);
        System.out.println("Negative numbers: "+o);
    } 
}