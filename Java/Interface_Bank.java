/* Program for Abstract: WAP to create a class Bank to use variables account number, account type, account holder name, account type, inital balance. Use 3 methodes getdata(), 
deposit(), withdraw() to create menu driven program */
package aayushi_java;
import java.util.*;

interface bank1
{
    void getdata();     //making it public is not important.
    void deposit();
    void withdraw();
}
class bank_ans1 implements bank1
{
    Scanner input = new Scanner(System.in);
    int acc_no,dep,with,ch;
    float bal;
    String name,acc_type;
    @Override
    public void getdata()
    {
        System.out.print("Enter Account number: ");
        acc_no=input.nextInt();
        System.out.print("Enter Account holder's name: ");
        name=input.next();
        
        do
        {
            System.out.println("Enter your account type: \n1.Saving \n2.Current");
            ch=input.nextInt();
            if(ch==1)
            {
                acc_type = "SAVING";
            }
                    
            else if(ch==2)
            {
                acc_type = "CURRENT";            
            }
            else
            {
                System.out.println("INVALID CHOICE!");
            }     
        }while(ch!=1 && ch!=2);
        
        System.out.print("Initial balance: ");
        bal=input.nextFloat();
    }
    @Override
    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit: ");
        dep=input.nextInt();
        bal+=dep;
        System.out.println("Balance after deposition: "+bal);
    }
    @Override
    public void withdraw()
    {
        if(bal<500)
        {
            System.out.print("Not sufficient balance!!");
        }
        else
        {
            System.out.println("Enter the amount you want to withdraw: ");
            with=input.nextInt();
            bal-=with;
            System.out.println("Balance after withdrawal: "+bal);
        }
    }
}
public class Interface_Bank {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        bank_ans1 b1 = new bank_ans1();
        
        int i;
        b1.getdata();
        
        do
        {
            System.out.println("What do you want to do \n1.Deposit \n2.Withdraw ");
            i=input.nextInt();
            
            switch(i)
            {
                case 1:
                    b1.deposit();
                    break;
                case 2:
                    b1.withdraw();
                    break;
                default:
                    System.out.print("CHOICE NOT VALID!!");
                    break;
            }
            i++;
        }while(i<=3);
    }
}