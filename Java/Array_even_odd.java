/* WAP to enter 10 elements in an array and calculate total number of odd and even elements in them */
package aayushi_java;
import java.util.*;

public class Array_even_odd {
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
            if (elements[i]%2==0)
            {
                e++;
            }
            else
            {   
                o++;
            }
        }
        System.out.println("Even numbers: "+e);
        System.out.println("Odd numbers: "+o);
    } 
}