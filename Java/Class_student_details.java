/* WAP to make a class to enter student details */
package aayushi_java;
import java.util.Scanner;

class Student
{
    Scanner input=new Scanner(System.in);
    int rollno;
    String name;
    String course;
    public void getdata()
    {
        System.out.println("Enter Rollno:");
        rollno=input.nextInt();
        System.out.println("Enter Name:");
        name=input.next();
        System.out.println("Enter Course:");
        course=input.next();
        
    }
    public void display()
    {
        System.out.println("Rollno is:"+rollno);
        System.out.println("Name is:"+name);
        System.out.println("Course is:"+course);
    }
}

public class Class_student_details {
    public static void main(String[] args) {
        Student s1=new Student();
        
        s1.getdata();
        s1.display();
    }
}