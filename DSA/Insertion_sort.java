package dsa;

import java.util.*;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] a = {5,4,20,2,9,3};
        int temp,i,j;
        
        for(i=1;i<6;i++)
        {
            temp = a[i]; 
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=temp;
        }
        /*for (i=1;i<6;i++)
        {
            temp = a[i];
            
            for(j=i-1;j>=0 && a[j]>temp;j--)
            {
                a[j+1] = a[j];
            }
            a[j+1]=temp;                                                                                                        
        }*/
        System.out.println("Elements of sorted array: ");
        for(i=0;i<6;i++)
        {
            System.out.println(a[i]);
        }
    }
}