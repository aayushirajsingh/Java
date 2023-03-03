/* Java String length() Method Example, replace */
package aayushi_java.String;

public class String_lenght_replace {
    public static void main(String argvs[])  
    {  
        String str = " Welcome To JavaTpoint ";  
        int sizeWithWhiteSpaces = str.length();  
        System.out.println("In the string: " + "'" + str + "'");  
        str = str.replace(" ", "");  
        int sizeWithoutWhiteSpaces = str.length();  
        int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;  
        System.out.println("Total number of whitespaces present are: " + noOfWhieSpaces);  
    }  
}  