/* WAP to enter 9 elements in 3x3 matrix and find out the maximum element from them */
package aayushi_java;
import java.util.*;

public class Matrix_max_elements {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[][] a = new int[10][10];
        
        int i,j,n,max=0;
        System.out.print("Enter N number: ");
        n=input.nextInt();
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=input.nextInt();
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println("Max element in the Martix: "+max);
    } 
}