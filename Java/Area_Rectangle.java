/* WAP to enter the height and width from the keyboard and calculate the area of the reactangle */
package aayushi_java;
import java.util.*;

public class Area_Rectangle {
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        int h, w, ar;
        System.out.println("Enter the Height: ");
        h= input.nextInt();
        System.out.println("Enter the Widht: ");
        w= input.nextInt();
        
        ar=h*w;
        
        System.out.println("Area of Rectangle= "+ar);
    }
}
