/* An ArrayList handling a group of employee class objects */
package aayushi_java.Collection;
import java.io.*;
import java.util.*;

class employee
{
    int id;
    String name;
    String address;
    
    employee(int i,String n,String a)
    {
        id = i;
        name = n;
        address = a;
    }
    void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}
public class Arraylist_search {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id;
        String name;
        String address;
        
        ArrayList<employee> ar = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter id: ");
            id=Integer.parseInt(br.readLine());
            
            System.out.print("Enter name: ");
            name=br.readLine();
            
            System.out.print("Enter address: ");
            address=br.readLine();
            
            employee obj = new employee(id,name,address);
            ar.add(obj);
        }
        System.out.print("Enter id to search: ");
        id= Integer.parseInt(br.readLine());
        boolean found = false;
        for(int i=0;i<ar.size();i++)
        {
            employee obj = ar.get(i);
            if(id==obj.id)
            {
                obj.display();
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("Employee not found");
        }
    }
}