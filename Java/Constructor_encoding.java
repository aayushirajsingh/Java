/* Write a program by using a class in Java with the following specifications:
Class name — Stringop
Data members:
1.String str
Member functions:
1.Stringop() — to initialize str with NULL
2.void accept() — to input a sentence
3.void encode() — to replace and print each character of the string with the second next character in the ASCII table. For example, A with C, B with D and so on
4.void print() — to print each word of the String in a separate line */
package aayushi_java;
import java.util.*;

class Stringop
{
    private String str;
    
    public Stringop()
    {
        str=null;
    }
    public void accept()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        str=input.nextLine();
    }
    public void encode()
    {
        char[] ar = new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ar[i]=(char)(str.charAt(i)+2);
        }
        str=new String(ar);
        System.out.println("\nEncoded sentence: ");
        System.out.println(str);
    }
    public void print()
    {
        System.out.println("\nPrinting each word on a separate line: ");
        int s = 0;
        while(s<str.length())
        {
            int e = str.indexOf(' ',s);
            if(e==-1)
            {
                e=str.length();
            }
            System.out.println(str.substring(s,e));
            s=e+1;
        }
    }
}
public class Constructor_encoding {
    public static void main(String[] args) 
    {
        Stringop op = new Stringop();
        op.accept();
        op.print();
        op.encode();
    }
}