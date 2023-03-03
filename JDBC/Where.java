/* program of where clause */
package aayushi_jdbc;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

public class Where {
    static final String DB_URL = "jdbc:mysql://localhost/food";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT id, first, last, age FROM Registration";
    
    public static void main(String[] args) 
    {
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            System.out.println("Fetching records without condition...");
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next())
            {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
            System.out.println("Fetching records with condition...");
            String sql = "SELECT id, first, last, age FROM Registration" + " WHERE id >= 101 ";
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
            rs.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}