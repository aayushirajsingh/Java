/* SINGLE INHERITANCE: Inheritance program; inheriting sudent class deatails in employee class  */
package aayushi_java;
import java.util.*;

class Student1
{
    Scanner s1 = new Scanner(System.in);
    int rollno;
    String name;
    String course;
    public void getdata()
    {
        System.out.print("Enter Rollno: ");
        rollno=s1.nextInt();
        System.out.print("Enter Name: ");
        name=s1.next();
        System.out.print("Enter Course: ");
        course=s1.next();
    }
    public void display()
    {
        System.out.println("Rollno is: "+rollno);
        System.out.println("Name is "+name);
        System.out.println("Course is: "+course);
    }
}
class Employee1 extends Student1
{
    Scanner s1 = new Scanner(System.in);
    int empid;
    String ename;
    float Salary;
    public void getemp()
    {
        System.out.print("Enter Emp ID: ");
        empid=s1.nextInt();
        System.out.print("Enter Name: ");
        ename=s1.next();
        System.out.print("Enter Salary: ");
        Salary=s1.nextInt();
    }
    public void dispemp()
    {
        System.out.println("Employee ID is: "+empid);
        System.out.println("Name is "+ename);
        System.out.println("Salary is: "+Salary);        
    }
}
public class Inheritance_stud_emp {
    public static void main(String[] args) 
    {
        Employee1 e1=new Employee1();
        e1.getemp();
        e1.dispemp();
        e1.getdata();
        e1.display();     
    }
}