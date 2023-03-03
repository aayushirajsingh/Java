/* Write a class with the name Area using function overloading that computes the area of a parallelogram, a rhombus and a trapezium.
Formula:
Area of a parallelogram (pg) = base * ht
Area of a rhombus (rh) = (1/2) * d1 * d2
(where, d1 and d2 are the diagonals)
Area of a trapezium (tr) = (1/2) * ( a + b) * h
(where a and b are the parallel sides, h is the perpendicular distance between the parallel sides) */
package aayushi_java;
import java.util.*;

class Area
{
    public void area(float b,float h)
    {
        System.out.println("Area of parallelogram: "+b*h);
    }
    public void area(float l,float d1,float d2)
    {
        System.out.println("Area of rhombus: "+l*d1*d2);
    }
    public void area(float l, float a, float b, float h)
    {
        System.out.println("Area of trapezium: "+l*(a+b)*h);
    }
    
}
public class Method_overloading_area {
    public static void main(String[] args)
    {
        Area a1 = new Area();
        a1.area(24, 17);
        a1.area((float) 0.5,40,25);
        a1.area((float)0.5,4,6,3);
    }
}