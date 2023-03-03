/* Java String substring() method example */
package aayushi_java.String;

public class String_substring {
    public static void main(String args[])
    {  
        String s1="Javatpoint";  
        System.out.println(s1.substring(2,4));  
        System.out.println(s1.substring(2));
        String substr = s1.substring(0);
        System.out.println(substr);  
        String substr2 = s1.substring(5,10); 
        System.out.println(substr2);    
    }
}  