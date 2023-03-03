/* WAP to enter principal amount, rate of interest, duration, from keyboard and calculate the simple interest */
package aayushi_java;
import java.util.*;

public class Principal_interest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        float p, r, t, simp_int;
        System.out.println("Enter the Principle amount: ");
        p= input.nextFloat();
        System.out.println("Enter the Duration: ");
        t= input.nextFloat();
        System.out.println("Enter the Rate of interest: ");
        r= input.nextFloat();
        
        simp_int = (p*r*t)/100;   
        
        System.out.println("Simple interest is: "+simp_int);
    }
}