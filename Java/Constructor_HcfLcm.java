/* Write a program by using a class with the following specifications:
Class name — Hcflcm
Data members/instance variables:
1.int a
2.int b
Member functions:
1.Hcflcm(int x, int y) — constructor to initialize a=x and b=y.
2.void calculate( ) — to find and print hcf and lcm of both the numbers. */
package aayushi_java;
import java.util.*;

class HcfLcm
{
    int a,b;
    public HcfLcm(int x, int y)
    {
        a=x;
        b=y;
    }
    public void calculate()
    {
        int x = a, y = b;
        while(y!=0)
        {
            int t = y;
            y = x%y;
            x = t;
        }
        int hcf = x;
        int lcm = (a*b)/hcf;
        System.out.println("HCF = "+hcf);
        System.out.println("LCM = "+lcm);
    }
}
public class Constructor_HcfLcm {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,b;
        System.out.println("Enter number a & b respectively: ");
        a=input.nextInt();
        b=input.nextInt();  
        HcfLcm hl =  new HcfLcm(a,b);
        hl.calculate();
    }
}
