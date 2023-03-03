/* Write a program that shows the use of LinkedList class */
package aayushi_java.Collection;
import java.io.*;
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) throws IOException
    {
        LinkedList<String> L1 = new LinkedList<>();
        L1.add("America");
        L1.add("India");
        L1.add("Japan");
        System.out.println("List= "+L1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position, choice=0;
        while(choice<4)
        {
            System.out.println("\nLinkedList Operations");
            System.out.println("1 Add an element");
            System.out.println("2 Remove an element");
            System.out.println("3 Change an element");
            
            System.out.print("Your choice: ");
            choice = Integer.parseInt(br.readLine());
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter element: ");
                    element = br.readLine();
                    System.out.print("At what position? ");
                    position = Integer.parseInt(br.readLine());
                    L1.add(position-1,element);
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    position = Integer.parseInt(br.readLine());
                    L1.remove(position-1);
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    position = Integer.parseInt(br.readLine());
                    System.out.print("Enter new element: ");
                    element = br.readLine();
                    L1.set(position-1,element);
                    break;
                default:
                    return;
            }
            System.out.print("List= ");
            Iterator it = L1.iterator();
            while(it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
        }
    }
}