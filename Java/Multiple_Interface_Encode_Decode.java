/* Program for Multiple Interface */
package aayushi_java;
import java.util.*;

interface Encode
{
    void encode();
}
interface Decode
{
    void decode();
}
class en_de_code implements Encode,Decode
{
    Scanner input = new Scanner(System.in);
    public String s;
    
    public void getstring()
    {
        s=null;
        System.out.println("Enter a Sentence: ");
        s=input.nextLine();
    }
    @Override
    public void encode() 
    {
        char[] a = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=(char)(s.charAt(i)+2);
        }
        s = new String(a);
        System.out.println("Encoded String: ");
        System.out.println(s);
    }

    @Override
    public void decode() 
    {
        char[] a = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=(char)(s.charAt(i)-2);
        }
        s = new String(a);
        System.out.println("Decoded string: "+s);
    }
}
public class Multiple_Interface_Encode_Decode {
    public static void main(String[] args) 
    {
        en_de_code e = new en_de_code();
        e.getstring();
        e.encode();
        e.decode();
    }
}