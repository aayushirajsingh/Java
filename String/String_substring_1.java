/* Applications of substring() Method */
package aayushi_java.String;

public class String_substring_1 {
    public static void main(String argvs[])  
    {  
        String str[] = {"Praveen Kumar","Yuvraj Singh","Harbhajan Singh","Gurjit Singh","Virat Kohli","Rohit Sharma","Sandeep Singh","Milkha Singh"};  
        String surName = "Singh";  
        int surNameSize = surName.length();  
        int size = str.length;  
        for(int j = 0; j < size; j++)  
        {  
            int length = str[j].length();  
            String subStr = str[j].substring(length - surNameSize);  
            if(subStr.equals(surName))  
            {  
                System.out.println(str[j]);  
            }  
        }  
    }  
}