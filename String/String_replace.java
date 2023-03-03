/* Java String replace() Method Example */
package aayushi_java.String;

public class String_replace {
    public static void main(String[] args) 
    {  
        String str = "oooooo-hhhh-oooooo";  
        System.out.println(str);
        String rs = str.replace("h","s");       // Replace 'h' with 's'  
        System.out.println(rs);  
        rs = rs.replace("s","h");               // Replace 's' with 'h'  
        System.out.println(rs);  
    }  
}
