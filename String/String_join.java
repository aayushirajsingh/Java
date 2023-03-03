/* Java String join() Method Example */
package aayushi_java.String;

public class String_join {
    public static void main(String args[])
    {  
        String string = String.join("-","welcome","to","javatpoint");  
        System.out.println(string);  
        String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time);  
        String str = null;  
        str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
        System.out.println(str);  
    }
}  