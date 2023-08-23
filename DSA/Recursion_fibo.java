package dsa;
import java.util.*;
public class Recursion_fibo {
    static int fibonacci(int n)
    {
        return (fibonacci(n-1)+fibonacci(n-2));     
    }
    
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
    }
}