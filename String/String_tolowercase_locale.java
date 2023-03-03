/* Java String toLowerCase(Locale locale) Method Example */
package aayushi_java.String;
import java.util.Locale;

public class String_tolowercase_locale {
    public static void main(String[] args) 
    {  
        String s = "JAVATPOINT HELLO stRIng";    
        String eng = s.toLowerCase(Locale.ENGLISH);  
        System.out.println(eng);  
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); 
        System.out.println(turkish);  
    }  
}