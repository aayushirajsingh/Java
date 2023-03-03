/* WAP for matrix multiplication */
package aayushi_java;
import java.util.*;

public class Matrix_transpose {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int[][] a = new int [10][10];
               
        int i,j,n;
        System.out.println("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements of A: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix transpose: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}