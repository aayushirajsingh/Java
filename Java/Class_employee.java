/* WAP to make a class to enter employee details */
package aayushi_java;
import java.util.Scanner;

class employee
{
    Scanner input = new Scanner(System.in);
    int emp_id, salary;
    String name;
    String designation;
    public void getdata()
    {
        System.out.println("Enter Employee ID:");
        emp_id=input.nextInt();
        System.out.println("Enter Employee Name:");
        name=input.next();
        System.out.println("Enter Designation:");
        designation=input.next();
        System.out.println("Enter Salary:");
        salary=input.nextInt();
    }
    public void display()
    {
        System.out.println("Enter Employee ID: "+emp_id);
        System.out.println("Enter Employee ID: "+name);
        System.out.println("Enter Employee ID: "+designation);
        System.out.println("Enter Employee ID: "+salary);
    }
}

public class Class_employee {
    public static void main(String[] args) {
        employee e1 = new employee();
        
        e1.getdata();
        e1.display();
    }
}   