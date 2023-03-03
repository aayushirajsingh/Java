/* Design a class overloading a function calculate() as follows:
1.void calculate(int m, char ch) with one integer argument and one character argument. It checks whether the integer argument is divisible by 7 or not, if ch is 's', otherwise, 
it checks whether the last digit of the integer argument is 7 or not.
2.void calculate(int a, int b, char ch) with two integer arguments and one character argument. It displays the greater of integer arguments if ch is 'g' otherwise, 
it displays the smaller of integer arguments. */
package aayushi_java;
import java.util.*;

class Calculate
{
    public void calculate(int m, char ch)
    {
        if(ch=='s')
        {
            if(m%7==0)
            {
                System.out.println("Divisible by 7");
            }
            else
            {
                System.out.println("Not divisible by 7");
            }
        }
        else
        {
            if(m%10==7)
            {
                System.out.println("Last digit is 7");
            }
            else
            {
                System.out.println("Last digit is not 7");
            }
        }
    }
    public void calculate(int a,int b, char ch)
    {
        if(ch=='g')
        {
            System.out.println("Greater: "+(a>b?a:b));
        }         
        else
        {
            System.out.println("Smaller: "+(a<b?a:b));
        }
    }
}
public class Method_overloading_calculate {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Calculate c = new Calculate();
        
        int n1,n2;
        System.out.println("Enter a number: ");
        n1=input.nextInt();
        c.calculate(n1,'s');
        c.calculate(n1,'t');
        
        System.out.println("Enter number a: ");
        n1=input.nextInt();
        System.out.println("Enter number b: ");
        n2=input.nextInt();
        c.calculate(n1,n2,'g');
        c.calculate(n1,n2,'k');
    }
}