/* Java String length() method example */
package aayushi_java.String;

public class String_length {
    public static void main(String args[])
    {  
        String str="javatpoint";  
        String s2="python";
        System.out.println("string length is: "+s2.length());
        if(str.length()>0) 
        {  
            System.out.println("String is not empty and length is: "+str.length());  
        }  
        str = "";  
        if(str.length()==0) 
        {  
                System.out.println("String is empty now: "+str.length());  
        }  
    }
}  