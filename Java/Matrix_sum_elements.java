/* WAP to enter 9 elements in 3x3 matrix and calculate total of all elements */
package aayushi_java;
import java.util.*;

public class Matrix_sum_elements {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[][] a = new int[10][10];
        
        int i,j,n,sum=0;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=input.nextInt();
                sum+=a[i][j];
            }
        }
        System.out.println("Sum of element in the Matrix: "+sum);
    } 
}