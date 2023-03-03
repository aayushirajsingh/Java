/* Program of Interface */
package aayushi_java;
import java.util.*;

interface calc1
{
    public void menu();
    public void getdata();
    public void add();
    public void sub();
    public void multi();
    public void div();
    public void mod();    
}
class calc_ans1 implements calc1
{
    Scanner input = new Scanner (System.in);
    int a,b,c;
    
    @Override
    public void menu()
    {
        System.out.println("Enter your choice: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");
    }
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
public class Interface_calculator {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        calc_ans1 c = new calc_ans1();
        int i;
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