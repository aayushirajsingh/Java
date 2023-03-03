/*  The substring() method can also be used to check whether a string is a palindrome or not. */
package aayushi_java.String;

public class String_substring_2 {
    public boolean isPalindrome(String str)  
    {  
        int size = str.length();  
        if(size == 0 || size == 1)  
        {  
            return true;  
        }  
        String f = str.substring(0, 1);  
        String l = str.substring(size - 1);  
        if(l.equals(f))  
        {  
            return isPalindrome(str.substring(1, size - 1));  
        }  
        return false;  
    }   
    public static void main(String argvs[])  
    {  
        String_substring_2 obj = new String_substring_2();  
        String str[] = {"madam","rock","eye","noon","kill"};  
        int size = str.length;  
        for(int j = 0; j < size; j++)  
        {  
            if(obj.isPalindrome(str[j]))  
            {  
                System.out.println(str[j] + " is a palindrome.");  
            }  
            else  
            {  
                System.out.println(str[j] + " is not a palindrome.");  
            }  
        }  
    }  
}  