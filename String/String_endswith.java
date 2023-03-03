/* Java String endsWith() Method Example */
package aayushi_java.String;

public class String_endswith {
    public static void main(String args[])
    {  
        String s1="java by javatpoint";  
        System.out.println(s1.endsWith("t"));  
        System.out.println(s1.endsWith("point"));  
        System.out.println(s1.endsWith(""));       // prints true
        System.out.println(s1.endsWith(" "));      // prints false as there is no white space after the string  
    }
}