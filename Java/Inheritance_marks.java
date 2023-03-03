/* Program for creating class student stores the roll_number, class_test stores the marks obtained in two subjects and class result contains the total marks obtained in the test. The class
result can inherit the details of the marks obtained in the test and the roll_number of student class */
package aayushi_java;
import java.util.*;

class student 
{
    protected int roll_num;
    
    public void get_number(int a)
    {
        roll_num=a;
    }
    public void put_number()
    {
        System.out.println("Roll number: "+roll_num);
    }
}
class tst extends student
{
    protected float sub1, sub2;
    
    public void get_marks(float x,float y)
    {
        sub1=x;
        sub2=y;
    }
    public void put_marks()
    {
        System.out.println("Marks of Subject 1: "+sub1);
        System.out.println("Marks of Subject 2: "+sub2);
    }
}
class result extends tst
{
    float total;
    
    public void display()
    {
        total=sub1+sub2;
        super.put_number();
        super.put_marks();
        System.out.println("Total: "+total);
    }
}
public class Inheritance_marks {
    public static void main(String[] args) 
    {
        result r = new result();
        r.get_number(999);
        r.get_marks(75.0f,59.5f);
        r.display();
    }
}