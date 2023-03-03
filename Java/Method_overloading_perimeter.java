/* Write a class with the name Perimeter using function overloading that computes the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r */
package aayushi_java;
import java.util.*;

class Perimeter
{
    public void perimeter(float s)
    {
        System.out.println("Perimeter of Square: "+4*s);
    }
    public void perimeter(float l, float b)
    {
        System.out.println("Perimeter of Rectangle: "+2*(l+b));
    }
    public void perimeter(float a, float pi, float r)
    {
        System.out.println("Perimeter of circle: "+a*pi*r);
    }
}
public class Method_overloading_perimeter {
    public static void main(String[] args)
    {
        Perimeter p = new Perimeter();
        
        p.perimeter(3);
        p.perimeter(10,7);
        p.perimeter(2,(float)3.14,6);
    }
}