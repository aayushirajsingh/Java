/* Write a program to store a group of objects in an array import java.io. */
package aayushi_java.Collection;
import java.io.*;

class emp
{
    int id;
    String name;
    
   emp(int i,String n)
   {
       id = i;
       name = n;
   }
   void displayData()
   {
       System.out.println(id+"\t"+name);
   }
}
public class Array {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        emp arr[] = new emp[5];
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter id: ");
            int id = Integer.parseInt(br.readLine());
            
            System.out.print("Enter name: ");
            String name = br.readLine();
            
            arr[i] = new emp (id, name);
        }
        System.out.println();
        System.out.println("The Employee data is: ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i].displayData();
        }
    }
} 