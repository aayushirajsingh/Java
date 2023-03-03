/* An electronics shop has announced a special discount on the purchase of Laptops as given below:
Category             Discount on Laptop
Up to ₹25,000           5.0%
₹25,001 - ₹50,000	7.5%
₹50,001 - ₹1,00,000	10.0%
More than ₹1,00,000	15.0%
Define a class Laptop described as follows:
Data members/instance variables:
1.name
2.price
3.dis
4.amt
Member Methods:
1.A parameterised constructor to initialize the data members
2.To accept the details (name of the customer and the price)
3.To compute the discount
4.To display the name, discount and amount to be paid after discount.
Write a main method to create an object of the class and call the member methods. */
package aayushi_java;
import java.util.*;

class Laptop
{
    String name;
    float price,dis,amt;
    
    public Laptop(float p,String n)
    {
        name = n;
        price = p;
    }
    public void compute()
    {
        if(price<=25000)
        {
            dis = (float) (price * 0.05);
        }
        else if(price<=50000)
        {
            dis = (float) (price * 0.075);
        }
        else if(price<=100000)
        {
            dis = (float) (price * 0.1);
        }
        else
        {
            dis = (float) (price * 1.5);
        }
        amt = price-dis;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Disout: "+dis);
        System.out.println("Amount to be paid: "+amt);
    }
}
public class Constructor_discount {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String s;
        float p;
        System.out.print("Enter your name: ");
        s=input.next();
        System.out.print("Enter the price: ");
        p=input.nextFloat();
        
        Laptop l = new Laptop (p,s);
        l.compute();
        l.display();
    }
}