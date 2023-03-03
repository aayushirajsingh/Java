/* write a program that shows the use of StringTokenizer object */
package aayushi_java.Collection;
import java.util.*;

public class String_Tokenizer {
    public static void main(String[] args) 
    {
        String str = "He is a gentle man";
        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println("The Tokens are: ");
        while(st.hasMoreTokens())
        {
            String one = st.nextToken();
            System.out.println(one);
        }
    }
}