/* WAP to enter any two number from the keyboard and swap them (interchange) using third variable */
package aayushi_java;
import java.util.*;

public class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int a,b,c;
        System.out.println("Enter number a: ");
        a=input.nextInt();
        System.out.println("Enter number b: ");
        b=input.nextInt();
        
        c=a;
        a=b;
        b=c;
        
        System.out.println("After swapping a= "+a);
        System.out.println("After swapping b= "+b);
    }
}