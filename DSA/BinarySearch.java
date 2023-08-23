package dsa;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mid,l,r,n;
        int[] a = {5,9,25,31,43,48,59,65,93,99};
        
        l = a[0];
        r = a.length-1;        
        mid = (l+(r-1))/2;
        
        System.out.print("Enter the number you want to find: ");
        n = input.nextInt();
            
        while (l<=r)
        {
            if(n == a[mid])
            {
                System.out.println("Element found at = "+mid);
            }
            else if (a[mid]>n)
            {
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
            break;
        }
    }
    
    /*int binarySearch(int a[], int n, int l, int r) {
    
    while (l <= r) {
      int mid = l + (r - l) / 2;

      if (a[mid] == x)
        return mid;

      if (a[mid] < x)
        l = mid + 1;

      else
        r = mid - 1;
    }

    return -1;
  }*/

}