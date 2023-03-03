/* write a program to create an ArrayList with strings and perform various operations on it */
package aayushi_java.Collection;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) 
    {
        ArrayList<String> ar1 = new ArrayList<>();
        
        ar1.add("Apple");
        ar1.add("Mango");
        ar1.add("Grapes");
        ar1.add("Guava");
        
        System.out.println("Contents: "+ar1);
        
        ar1.remove(3);
        ar1.remove("Apple");
        
        System.out.println("Contents after removing: "+ar1);
        System.out.println("Size of ArrayList: "+ar1.size());
        System.out.println("Extracting using Iterator: ");
        Iterator it = ar1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}