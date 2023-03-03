/* Program to select database */
package aayushi_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_database {
    static final String DB_URL="jdbc:mysql://localhost:3306/food";
    static final String USER="root";
    static final String PASS="root";
    public static void main(String[] args) 
    {
        System.out.println("Connecting to a selected database...");
        try
        {
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database successfully...");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}