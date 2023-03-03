/* write a program to create a queue with interger objects */
package aayushi_java.Collection;
import java.util.*;

public class Queue_method {
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1;i<=5;i++)
        {
            q.offer(i);
        }
        System.out.println("The queue is: ");
        while (!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }
}