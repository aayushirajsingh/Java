/* WAP to enter 10 elements in two Matrixs and store their addition in 3rd Matrix */
package aayushi_java;
import java.util.*;

public class Matrix_sum_of_2_matrix {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        
        int i,j,n;
        System.out.println("Enter the size of Matrix: ");
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
        System.out.println("Sum of elements of Matrix A & B: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }   
}