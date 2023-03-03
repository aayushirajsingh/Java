/* Java String toCharArray() method example */
package aayushi_java.String;

public class String_tochararray {
    public static void main(String[] args) 
    {  
        String s1 = "Welcome to Javatpoint";  
        char[] ch = s1.toCharArray();  
        int len = ch.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) 
        {  
            System.out.println(ch[i]);  
        }  
    }  
}