/* Java String split() method with regex and length example 2 */
package aayushi_java.String;

public class String_split_2 {
    public static void main(String[] args) 
    {  
        String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", 0);  
        for (String w : arr) 
        {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
    }  
}
