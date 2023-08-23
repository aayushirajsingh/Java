package dsa;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // try to make array function with static input
        int[] a = new int [5];
        
        int i,j,temp;
        System.out.println("Enter the numbers: ");
        for(i=0;i<5;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}