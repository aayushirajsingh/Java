/* Java String replaceAll() example: remove white spaces */
package aayushi_java.String;

public class String_replaceall {
    public static void main(String args[])
    {  
        String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
        String replaceString=s1.replaceAll("\\s","");  
        System.out.println(replaceString);  
        
        String str = "JavaTpoint";  
        System.out.println(str);  
        String regex = "";  
        str = str.replaceAll(regex, " ");       // adding a white space before and after every character of the input string.  
        System.out.println(str);  
    }
}