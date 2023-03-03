/* Program for inheritance. Use emp as a base class. */
package aayushi_java;
import java.util.*;

class emp
{
    int no;
    String name;
}
class off extends emp
{
    Scanner input = new Scanner(System.in);
    public int year;
    public String cla;
    
    public void getdata()
    {
        System.out.print("Enter number: ");
        no=input.nextInt();
        System.out.print("Enter name: ");
        name=input.next();
        System.out.print("Enter class: ");
        cla=input.next();
        System.out.print("Enter year: ");
        year=input.nextInt();
    }
    public void putdata()
    {
        System.out.println("Number: "+no);
        System.out.println("Name: "+name);
        System.out.println("Class: "+cla);
        System.out.println("Year: "+year);
    }
}
class tech extends emp
{
    //no variable is defined in class
}
class mech extends tech
{
    Scanner input = new Scanner(System.in);
    public String degree;
    public int exp;
    public void getdata()
    {
        System.out.print("Enter Number: ");
        no=input.nextInt();
        System.out.print("Enter Name: ");
        name=input.next();
        System.out.print("Enter Experience: ");
        exp=input.nextInt();
        System.out.print("Enter Degree: ");
        degree=input.next();
    }
    public void putdata()
    {
        System.out.println(no+" "+name+" "+exp+" "+degree+"\n");
    }
}
class ele extends tech
{
    Scanner input = new Scanner(System.in);
    public String degree;
    public int exp;
    public void getdata()
    {
        System.out.print("Enter Number: ");
        no=input.nextInt();
        System.out.print("Enter Name: ");
        name=input.next();
        System.out.print("Enter Experience: ");
        exp=input.nextInt();
        System.out.print("Enter Degree: ");
        degree=input.next();
    }
    public void putdata()
    {
        System.out.println(no+" "+name+" "+exp+" "+degree+"\n");
    }
}
public class Inheritance_employee {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        mech m = new mech();
        ele e = new ele();
        off o = new off();
        
        System.out.println("Enter Data of Mech. employee ");
        m.getdata();
        System.out.println("Enter Data of Elect. employee ");
        e.getdata();
        System.out.println("Enter Data of Officer ");
        o.getdata();
        System.out.println("Emp Data of Officer ");
        o.putdata();
        System.out.println("Emp Data of Mechanical ");
        m.putdata();
        System.out.println("Emp Data of Electrical ");
        e.putdata();       
    }
}    