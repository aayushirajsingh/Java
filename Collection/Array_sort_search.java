/* write a program that shows the use of arrays 
sorting and searching in an array */
package aayushi_java.Collection;
import java.io.*;
import java.util.*;

public class Array_sort_search {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter an Integer: ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Contents of the array: ");
        display(arr);
        Arrays.sort(arr);
        System.out.println("The sorted array: ");
        display(arr);
        
        System.out.println("which element to search? ");
        int element = Integer.parseInt(br.readLine());
        int index = Arrays.binarySearch(arr, element);
        if(index<0)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at location: "+(index+1));
        }
    }
    static void display(int arr[])
    {
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}