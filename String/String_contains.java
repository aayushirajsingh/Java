/* Java String contains() Method Example */
package aayushi_java.String;

public class String_contains {
    public static void main(String args[])
    {  
        String name="what do you know about me";  
        System.out.println(name.contains("do you know"));  
        System.out.println(name.contains("about"));  
        System.out.println(name.contains("hello"));
        System.out.println(name.contains("KNOW"));      //case sensitive
    }
}  