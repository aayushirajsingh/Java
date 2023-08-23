package dsa;

import java.util.*;

public class Recursion_fact
{
    static int fact (int n)
    {
        if (n==0)
        {
            return 0;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Factorial is = ");
        System.out.println(fact(num));
    }
}