/* Program for assuming a class cricket. Declare a derive class batsman from cricketer. Data member of batsman. Total runs, average run and best performance */
package aayushi_java;
import java.util.*;

class cricket
{
    Scanner input = new Scanner(System.in);
    private String name;
    
    public void read()
    {
        System.out.println("Enter the name: ");
        name=input.next();
    }
    public  void show()
    {
        System.out.println("Name: "+name);
    }
}
class Batsman extends cricket
{
    Scanner input = new Scanner(System.in);
    private int total_run, total_match, best_perf;
    private double average_run;
    
    public void read()
    {
        super.read();
        System.out.println("Total matches: ");
        total_match=input.nextInt();
        System.out.println("Total Runs: ");
        total_run=input.nextInt();
        System.out.println("Best Performance: ");
        best_perf=input.nextInt();
    }
    public void calculate()
    {
        average_run=total_run/total_match;
    }
    public void show()
    {
        super.show();
        System.out.println("Total Match: "+total_match);
        System.out.println("Total Runs: "+total_run);
        System.out.println("Average: "+average_run);
        System.out.println("Best Performance: "+best_perf);
    }
}
public class Inheritance_cricket {
    public static void main(String[] args) 
    {
        Batsman b = new Batsman();
        b.read();
        b.calculate();
        b.show();
    }
}