/*Write a program in Java using a method Discount( ), to calculate a single discount or a successive discount. Use overload methods Discount(int), Discount(int,int) and 
Discount(int,int,int) to calculate single discount and successive discount respectively. Calculate and display the amount to be paid by the customer after getting discounts 
on the printed price of an article.
Sample Input:
Printed price: ₹12000
Successive discounts = 10%, 8%
= ₹(12000 - 1200)
= ₹(10800 - 864)
Amount to be paid = ₹9936 */
package aayushi_java;
import java.util.*;

class amount
{
    public void discount(int price)
    {
        System.out.println("Amount after single discount= "+discount(price,10));
        System.out.println("Amount after successive discount= "+discount(price,10,8));
    }
    public double discount(int price,int d)
    {
        double priceAfterDis = price - price * d/100.0;
        return priceAfterDis;
    }
    public double discount(int price,int d1,int d2)
    {
        double priceAfterDis1= price - price * d1/100.0;
        double priceAfterDis2= priceAfterDis1 - priceAfterDis1 * d2/100.0;
        return priceAfterDis2;
    }
}
public class Method_overloading_discount {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        amount a = new amount();
         
        int price;
        System.out.println("Enter the price: ");
        price=input.nextInt();    
        a.discount(price);
    }
}
