/* Java String split() method with regex and length example */
package aayushi_java.String;

public class String_split_1 {
    public static void main(String args[])
    {  
        String s1="welcome to split world";  
        System.out.println("returning words:");  
        for(String w:s1.split("\\s",0))
        {  
            System.out.println(w);  
        }  
        System.out.println("returning words:");  
        for(String w:s1.split("\\s",1))
        {  
            System.out.println(w);  
        }  
        System.out.println("returning words:");  
        for(String w:s1.split("\\s",2))
        {  
            System.out.println(w);  
        }  
    }
}  