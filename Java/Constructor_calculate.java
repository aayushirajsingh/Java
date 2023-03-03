/* Write a program by using a class with the following specifications:
Class name — Calculate
Instance variables:
1.int num
2.int f
3.int rev
Member Methods:
1.Calculate(int n) — to initialize num with n, f and rev with 0 (zero)
2.int prime() — to return 1, if number is prime
3.int reverse() — to return reverse of the number
4.void display() — to check and print whether the number is a prime palindrome or not */
package aayushi_java;
import java.util.*;

class calculate
{
    int f,num,rev;
    public calculate(int n)
    {
        num=n;
        f=0;
        rev=0;
    }
    public int prime()
    {
        f=1;
        if(num==0||num==1)
        {
            f=0;
        }
        else
        {
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    f=0;
                    break;
                }
            }
        }
        return f;
    }
    public int reverse()
    {
        int t=num;
        while(t!=0)
        {
            int digit=t%10;
            rev=rev*10+digit;
            t/=10;
        }
        return rev;
    }
    public void display()
    {
        if(f==1 && rev==num)
        {
            System.out.println(num+" is prime palindrome");
        }
        else
        {
            System.out.println(num+" is not prime palindrome");
        }
    }
}
public class Constructor_calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x;
        System.out.println("Enter Number: ");
        x=input.nextInt();
        calculate c = new calculate(x);
        c.prime();
        c.reverse();
        c.display();        
    }    
}