/* WAP a program to enter the marks of 5 subjects and calculate the total and percentage, and on the basis of percentage grade the students */
package aayushi_java;
import java.util.*;

public class If_elseif_Marksheet {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a,b,c,d,e,total,per;
	System.out.println("Enter the marks of: ");
	System.out.println("English.");
	a=input.nextInt();
	System.out.println("Maths.");
	b=input.nextInt();
	System.out.println("Physics.");
	c=input.nextInt();
	System.out.println("Chemistry.");
	d=input.nextInt();
	System.out.println("Computer Science.");
	e=input.nextInt();
        
	total=a+b+c+d+e;
        System.out.println("total: "+total);
	per=total/5;
        System.out.println("Percentage: "+per);
        
	if(per>=80)
	{
            System.out.println("Grade A+");
	}
	else if(per>=70 && per<80)
	{
            System.out.println("Grade A");
	}
	else if(per>=60 && per<70)
	{
            System.out.println("Grade B");
	}
	else if(per>=50 && per<60)
	{
            System.out.println("Grade C");
	}
	else if(per>=40 && per<50)
	{
            System.out.println("Grade D");
	}
	else if(per>=30 && per<40)
	{
            System.out.println("Grade E");
	}
	else
	{
            System.out.println("FAIL");
        }
    }
}