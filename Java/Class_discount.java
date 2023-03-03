/* Design a class program to calculate the discount given to a customer on purchasing LED television. The program also diplays the amount paid by the computer after discount. Use data 
memebers cost, discount, amount and member functions accept(), calculate(), display() */
package aayushi_java;
import java.util.*;

class Television
{
    Scanner input = new Scanner (System.in);
    int cost,discount,amount;
    
    public void accept()
    {
        System.out.println("Enter the cost of Television: ");
        cost=input.nextInt();
    }
    public void calculate()
    {
        System.out.println("Enter the Discount: ");
        discount=input.nextInt();
        amount=(cost*(100-discount))/100;
    }
    public void display()
    {
        System.out.println(discount+"% Discount applied");
        System.out.println("Amount to be payed after discount "+amount);
    }
}
public class Class_discount {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Television t1 = new Television();
        
        t1.accept();
        t1.calculate();
        t1.display();
    }
}