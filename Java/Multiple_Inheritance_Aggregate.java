/* Program for Multiple inhertance */
package aayushi_java;
import java.util.*;

interface First
{
    void Firstyear();
}
interface Second
{
    void Secondyear();
}
interface Third
{
    void Thirdyear();
}
interface Fourth
{
    void Fourthyear();
}
class aggregate implements First,Second,Third,Fourth
{
    Scanner input = new Scanner(System.in);
    double a,b,c,d,ag;
    @Override
    public void Firstyear()
    {
        System.out.println("Enter the percentage of 1st year: ");
        a=input.nextInt();
    }
    @Override
    public void Secondyear()
    {
        System.out.println("Enter the percentage of 2nd year: ");
        b=input.nextInt();
    }
    @Override
    public void Thirdyear()
    {
        System.out.println("Enter the percentage of 3rd year: ");
        c=input.nextInt();
    }
    @Override
    public void Fourthyear()
    {
        System.out.println("Enter the percentage of 4th year: ");
        d=input.nextInt();
    }      
    public void agg()
    {
        ag=(a+b+c+d)/4;
        System.out.println("Aggregate percentage: "+c+"%");
    }
}
public class Multiple_Inheritance_Aggregate {
    public static void main(String[] args) 
    {
        aggregate a = new aggregate();
        a.Firstyear();
        a.Secondyear();
        a.Thirdyear();
        a.Fourthyear();
        a.agg();
    }
}