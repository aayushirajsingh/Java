/* WAP to make a class to enter employee details */
package aayushi_java;
import java.util.*;

class calculator
{
    Scanner input = new Scanner(System.in);
    int a,b,c;
    public void getdata()
    {
        System.out.println("Enter the value of a: ");
        a=input.nextInt();
        System.out.println("Enter the value of b: ");
        b=input.nextInt();
    }
    public void add()
    {
        c=a+b;
        System.out.println("Addition is: "+c);
    }
    public void sub()
    {
        c=a-b;
        System.out.println("Subtraction is: "+c);
    }
    public void multi()
    {
        c=a*b;
        System.out.println("Multiplication is: "+c);
    }
    public void div()
    {
        c=a/b;
        System.out.println("Division is: "+c);
    }
    public void mod()
    {
        c=a%b;
        System.out.println("Modulus is: "+c);
    }
}

public class Class_calculator {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        calculator c1 = new calculator();
        
        int i;
        c1.getdata();
        
        do
        {
            System.out.println("Enter your choice: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");
            i=input.nextInt();

            switch (i) 
            {
                case 1:
                    c1.add();
                    break;
                case 2:
                    c1.sub();
                    break;
                case 3:
                    c1.multi();
                    break;
                case 4:
                    c1.div();
                    break;
                case 5:
                    c1.mod();
                    break;
                default:
                    System.out.println("DOES NOT EXIST!!");
                    break;
            }
            i++;
        }while(i<=6);
    }
}