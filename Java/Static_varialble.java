/* Example of static variable */
package aayushi_java;
import java.util.*;

class Stud
{
    int rollno;
    String name;
    static String college = "ITS";
    Stud(int r,String n)
    {
        rollno = r;
        name = n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
class counter
{
    static int count = 0;
    counter()
    {
        count++;
        System.out.println(count);
    }
}
public class Static_varialble {
    public static void main(String[] args) 
    {
        Stud s1 = new Stud(111,"Karan");
        Stud s2 = new Stud(222,"Aryan");
        s1.display();
        s2.display();
        
        System.out.println();
        
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
    }
}