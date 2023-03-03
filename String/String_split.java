/* Java String split() method example */
package aayushi_java.String;

public class String_split {
    public static void main(String args[])
    {  
        String s1="java string split method by javatpoint";  
        String[] words=s1.split("\\s");         //splits the string based on whitespace  
        for(String w:words)                     //using java foreach loop to print elements of string array  
        {  
            System.out.println(w);  
        }  
    }
}  