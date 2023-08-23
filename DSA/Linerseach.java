package dsa;

import java.util.*;
public class Linerseach {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int[] a = {10,15,29,6,7};
        int i,s;
        System.out.print("Enter the element you want to search: ");
        s=input.nextInt();
        
        for(i=0;i<5;i++)
        {
            if(a[i]==s)
            {
                System.out.println("position: "+i);
            }   
        }
        if(i == 5)
        {
            System.out.println("Element not found!");
        }
    } 
}