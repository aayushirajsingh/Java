/* WAP ro enter the basic salary of an employee from the keyboard and calculate HRA (House rent allowance) 10% of basic salary, DA (Dearness allowance) 5% of the basic salary,
TA (Travelling allowance) 15% of the basic salary, and also calculate net salary of an employee */
package aayushi_java;
import java.util.*;

public class Salary {
    public static void main(String[] args)
    {
        Scanner input= new Scanner (System.in);
        
        int sal, hra, da, ta, net;
        System.out.println("Enter Salary");
        sal=input.nextInt();
        
        hra= (sal)*10/100;
        da= (sal)*5/100;
        ta= (sal)*15/100;
        
        System.out.println("House Rent allowance: "+hra);
        System.out.println("Dearness allowance: "+da);
        System.out.println("Travelling allowance: "+ta);
        
        net=sal+hra+da+ta;
        
        System.out.println("Net Salary is: "+net);
    }
}