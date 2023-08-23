package dsa;

import java.util.*;

public class Recursion_sum {
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {    
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Sum of numbers is = ");
        System.out.println(sum(num));
    }
}   