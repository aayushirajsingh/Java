/* Java String length() Method Example. The length() method is also used to reverse the string. */
package aayushi_java.String;

public class String_length_rev {
    public static void main(String argvs[])  
    {  
        String str = "Welcome To JavaTpoint";  
        int size = str.length();  
        System.out.println(str.length());
        System.out.println("Reverse of the string: " + "'" + str + "'" + " is");  
        for(int i = 0; i < size; i++)  
        {  
            System.out.print(str.charAt(str.length() - i - 1));  
        }  
    }
}