/* WAP to enter any two numbers from keyboard and calculate area of Rectangle, triangle, circle and square from keyboard and calculate necessary operation take necessary input */
package aayushi_java;
import java.util.*;

public class Do_while_Area_Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int i;
        float l,b,r,a;
                
        do
        {
            System.out.println("Enter your choice:  \n1.Area of Rectangle \n2.Area of Triangle \n3.Area of Circle \n4.Area of Square ");
            i=input.nextInt();

            switch (i) 
            {
                case 1:
                    System.out.print("Enter the length of Rectangle: ");
                    l=input.nextFloat();
                    System.out.print("Enter the breadth of Rectangle: ");
                    b=input.nextFloat();
                    a=l*b;
                    System.out.println("Area of Rectangle is: "+a);
                    break;
                case 2:
                    System.out.print("Enter the length of Triangle: ");
                    l=input.nextFloat();
                    System.out.print("Enter the Base of Triangle: ");
                    b=input.nextFloat();
                    a=(l*b)/2;
                    System.out.println("Area of Triangle is: "+a);
                    break;
                case 3:
                    System.out.print("Enter the Radius of Circle: ");
                    r=input.nextFloat();
                    a= r*r*3.14f;
                    System.out.println("Area of Circle is: "+a);
                    break;
                case 4:
                    System.out.print("Enter the length of Square: ");
                    l=input.nextFloat();
                    a=l*l;
                    System.out.println("Area of Square is: "+a);
                    break;
                default:
                    System.out.println("DOES NOT EXIST!!");
                    break;
            }
            i++;
        }while(i<=5);
    }
}