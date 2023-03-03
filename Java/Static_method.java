    /* Example of static method */
package aayushi_java;
import java.util.*;

class Stud1
{
    int rollno;
    String name;
    static String college = "ITS";
    static void change()
    {
        college = "BBIDT";
    }
    Stud1(int r,String n)
    {
        rollno = r;
        name = n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
class cal
{
    static int cube(int x)
    {
        return x*x*x;
    }
}
public class Static_method {
    public static void main(String[] args) 
    {
        Stud1.change();
        Stud1 s1 = new Stud1(111,"Karna");
        Stud1 s2 = new Stud1(222,"Aryan");
        s1.display();
        s2.display();
        
        System.out.println();
        
        int result = cal.cube(5);
        System.out.println(result);
    }
}