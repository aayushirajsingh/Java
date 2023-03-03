/* Java String toUpperCase(Locale locale) Method Example */
package aayushi_java.String;
import java.util.Locale;

public class String_touppercase_locale {
    public static void main(String[] args) {  
        String s = "hello string";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);
        System.out.println(english);  
    }  
}  