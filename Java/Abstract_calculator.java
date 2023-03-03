/* Program for Absract */
package aayushi_java;
import java.util.*;

abstract class calc
{
    public void display()
    {
        System.out.println("Welcome to Calculator!");
    }
    public void menu()
    {
        System.out.println("Enter your choice: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");
    }
    public abstract void getdata();
    public abstract void add();
    public abstract void sub();
    public abstract void multi();
    public abstract void div();
    public abstract void mod();    
}
class calc_ans extends calc
{
    Scanner input = new Scanner (System.in);
    int a,b,c;
    @Override
    public void getdata()
    {
        System.out.println("Enter the value of a & b: ");
        a=input.nextInt();
        b=input.nextInt();
    }
    @Override
    public void add() 
    {
        c=a+b;
        System.out.println("Addition: "+c);
    }
    @Override
    public void sub() 
    {
        c=a-b;
        System.out.println("Subtraction: "+c);
    }
    @Override
    public void multi() 
    {
        c=a*b;
        System.out.println("Multiplication: "+c);
    }
    @Override
    public void div() 
    {
        c=a/b;
        System.out.println("Division: "+c);
    }
    @Override
    public void mod() 
    {
        c=a%b;
        System.out.println("Modulus: "+c);
    }
}
public class Abstract_calculator {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        calc_ans c = new calc_ans();
        int i;
        c.display();
        c.getdata();
        do
        {
            c.menu();
            i=input.nextInt();
            switch(i)
            {
                case 1:
                    c.add();
                    break;
                case 2:
                    c.sub();
                    break;
                case 3:
                    c.multi();
                    break;
                case 4:
                    c.div();
                    break;
                case 5:
                    c.mod();
                    break;
                default:
                    System.out.println("INCORRECT CHOICE");
                    break;
            }
            i++;
        }while(i<=6);
    }
}