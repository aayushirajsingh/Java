/* Design a class overloading and a function display( ) as follows:
1.void display(String str, int p) with one String argument and one integer argument. It displays all the uppercase characters if 'p' is 1 (one) otherwise,
it displays all the lowercase characters.
2.void display(String str, char chr) with one String argument and one character argument. It displays all the vowels if chr is 'v' otherwise, it displays all the alphabets. */
package aayushi_java;
import java.util.*;

class Display
{
    public void display(String s, int p)
    {
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(p==1 && Character.isUpperCase(ch))
            {
                System.out.println(ch);
            }
            else if(p!=1 && Character.isLowerCase(ch))
            {
                System.out.println(ch);
            }
        }
    }
    void display(String s, char chr)
    {
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            ch = Character.toUpperCase(ch);
            if(chr!='v' && Character.isLetter(s.charAt(i)))
            {
                System.out.println(s.charAt(i));
            }
            else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.println(s.charAt(i));
            }
        }
    }
}
public class Method_overloading_display {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter string: ");
        String s = in.nextLine();
        
        Display d = new Display();
        System.out.println("p=1");
        d.display(s,1);
        System.out.println("\np!=1");
        d.display(s,0);
        System.out.println("\nchr!='v'");
        d.display(s,'v');
        System.out.println("\nchr!='v'");
        d.display(s,'u');
    }
}