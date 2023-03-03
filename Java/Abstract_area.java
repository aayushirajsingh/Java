/* Program for Abstract */
package aayushi_java;
import java.util.*;

abstract class area
{
    public void display()
    {
        System.out.println("Welcome to Area Calculator!");
    }
    public abstract void rect();
    public abstract void circle(float pi, float r);
    public abstract void triangle(int h, int b);
    public abstract void square(int l);
}
class area_ans extends area
{
    Scanner input = new Scanner(System.in);
    @Override
    public void rect() 
    {
        int l,b,ar;
        System.out.println("Enter the length and breadth of rectangle: ");
        l=input.nextInt();
        b=input.nextInt();
        ar=l*b;
        System.out.println("Area of Rectangle: "+ar);
    }
    @Override
    public void circle(float pi, float r) 
    {
        System.out.println("Area of Circle: "+(pi*r*r));
    }
    @Override
    public void triangle(int h, int b) 
    {
        System.out.println("Area of Triangle: "+(h*b)/2);
    }
    @Override
    public void square(int l) 
    {
        System.out.println("Area of Square: "+(l*l));
    }
}
public class Abstract_area {
    public static void main(String[] args) 
    {
        area_ans a1=new area_ans();
        a1.display();
        a1.rect();
        a1.circle(3.14f,7);
        a1.triangle(4,8);
        a1.square(8);
    }
}