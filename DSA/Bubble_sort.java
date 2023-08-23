package dsa;

import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // try to make array function with static input
        int[] a = new int [5];
        int flag = 0;
        int i,j,temp;
        System.out.println("Enter the numbers: ");
        for(i=0;i<5;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<5-1;i++)
        {
            for(j=0;j<(5-i-1);j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                flag = 1;
            }
            if(flag==0)
            {
                break;
            }
        }
        System.out.println("Sorted Array:");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}