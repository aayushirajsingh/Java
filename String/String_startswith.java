/* Java String startsWith(String prefix, int offset) Method Example */
package aayushi_java.String;

public class String_startswith {
    public static void main(String[] args) 
    {    
        String str = "Javatpoint";    
        System.out.println(str.startsWith("J"));   
        System.out.println(str.startsWith("a"));  
        System.out.println(str.startsWith("a",1));   
        String s = "Tokyo Olympics";  
        if(s.startsWith(""))  
        {  
            System.out.println("The string starts with the empty string.");  
        }  
        else  
        {  
            System.out.println("The string does not start with the empty string.");     
        }  
    }    
}