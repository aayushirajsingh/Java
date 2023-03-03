/* WAP to enter the radius form keyboard and calculate the area of circle */
package aayushi_java;
import java.util.*;

public class Area_Circle {
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        float r, ar;
        System.out.println("Enter the radius: ");
        r= input.nextFloat();
        
        ar= r*r*3.14f;
        
        System.out.println("Area of Circle= "+ar);
    }
}