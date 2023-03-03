/* Java String charAt() Method Examples */
package aayushi_java.String;

public class String_charat {
    public static void main(String[] args) 
    {  
        String str = "Javatpoint";      
        int strLength = str.length();    
        char ch=str.charAt(4);  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) 
        {  
            if(str.charAt(i) == 't') 
            {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
        System.out.println("character at poition 4: "+ch);
        System.out.println("Character at 0 index is: "+ str.charAt(0));      
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
    }  
}