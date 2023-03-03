/*WAP to enter the height and base from the keyboard and calculate the area of the triangle */
package aayushi_java;
import java.util.*;

public class Area_Triangle {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        int h, b, ar;
        System.out.println("Enter the Height: ");
        h= input.nextInt();
        System.out.println("Enter the Base: ");
        b= input.nextInt();
        
        ar=(h*b)/2;
        
        System.out.println("Area of Triangle= "+ar);
    }
}
