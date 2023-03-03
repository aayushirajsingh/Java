/* Program for Interface */
package aayushi_java;
import java.util.*;

interface area1
{
    public void rect();
    public void circle(float pi, float r);
    public void triangle(int h, int b);
    public void square(int l);
}
class area_ans1 implements area1
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
public class Interface_area {
    public static void main(String[] args) 
    {
        area_ans1 a1=new area_ans1();
        a1.rect();
        a1.circle(3.14f,7);
        a1.triangle(4,8);
        a1.square(8);
    }
}