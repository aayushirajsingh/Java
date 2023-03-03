/* WAP for matrix multiplication */
package aayushi_java;
import java.util.*;

public class Matrix_multiplication {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int[][] a = new int [10][10];
        int[][] b = new int [10][10];
        int[][] c = new int [10][10];
               
        int i,j,k,n;
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
        System.out.println("Enter elements of B: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix Mutiplication: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    c[i][j]=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}