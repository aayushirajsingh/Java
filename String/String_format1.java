/* Java String format() Method Example 2 */
package aayushi_java.String;

public class String_format1 {
    public static void main(String[] args) 
    {  
        String str1 = String.format("%d", 101);          
        String str2 = String.format("%s", "Amar Singh"); 
        String str3 = String.format("%f", 101.00);       
        String str4 = String.format("%x", 101);          
        String str5 = String.format("%c", 'c');
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
    } 
}