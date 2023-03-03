/*Create a class Rectangle with data members length, breadth and height. Use a parameterised constructor to initialize the object. With the help of function 
surfacearea() and volume(), calculate and display the surface area and volume of the rectangle. */
package aayushi_java;
import java.util.*;

class Rectangle
{
    double length,breadth,height;
    public Rectangle(double l, double b, double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void surfacearea()
    {
        double sa=2*(length*breadth+breadth*height+length*height);
        System.out.println("Surface area = "+sa);
    }
    public void volume()
    {
        double vol=length*breadth*height;
        System.out.println("Volume = "+vol);
    }
}
public class Constructor_Rectangle {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int l,b,h;
        System.out.println("Enter the lenght, breadth & height of the rectangle respectively: ");
        l=input.nextInt();
        b=input.nextInt();
        h=input.nextInt();
        Rectangle r = new Rectangle(l,b,h);
        r.surfacearea();
        r.volume();
    }
}