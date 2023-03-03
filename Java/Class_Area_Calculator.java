/* WAP to creater a class Area use variables as per your assumption and use area rectangle, area triangle, area square, area circle use switch case and do while to create 
menu driven program */
package aayushi_java;
import java.util.*;

class calculator_area
{
    Scanner input = new Scanner (System.in);
    int l,b;
    float r,a;
    public void rect()
    {
        System.out.print("Enter the length of Rectangle: ");
        l=input.nextInt();
        System.out.print("Enter the breadth of Rectangle: ");
        b=input.nextInt();
        a=l*b;
        System.out.println("Area of Rectangle is: "+a);
    }
    public void tri()
    {
        System.out.print("Enter the length of Triangle: ");
        l=input.nextInt();
        System.out.print("Enter the base of Triangle: ");
        b=input.nextInt();
        a=(l*b)/2;
        System.out.println("Area of Rectangle is: "+a);    
    }
    public void sq()
    {
        System.out.print("Enter the length of Square: ");
        l=input.nextInt();
        a=l*l;
        System.out.println("Area of Square: "+a);
    }
    public void circle()
    {
        System.out.print("Enter the radius of Circle: ");
        r=input.nextFloat();
        a=r*r*3.14f;
        System.out.println("Area of Circle: "+a);
    }
}
public class Class_Area_Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        calculator_area c1 = new calculator_area();
        
        int i;
        
        do
        {
            System.out.println("Enter your choice:  \n1.Area of Rectangle \n2.Area of Triangle \n3.Area of Circle \n4.Area of Square ");
            i=input.nextInt();

            switch (i) 
            {
                case 1:
                    c1.rect();
                    break;
                case 2:
                    c1.tri();
                    break;
                case 3:
                    c1.circle();
                    break;
                case 4:
                    c1.sq();
                    break;
                default:
                    System.out.println("DOES NOT EXIST!!");
                    break;
            }
            i++;
        }while(i<=5);
    }
}