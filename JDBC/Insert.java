/* Program to insert data into database */
package aayushi_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    static final String DB_URL = "jdbc:mysql://localhost:3306/java_data";
    static final String USER = "root";
    static final String PASS = "root";
    public static void main(String[] args) 
    {
        try
        {
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = con.createStatement();
            System.out.println("Inserting records into table");
            String sql = "INSERT INTO employee VALUES (100, 'Zara', 10000)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}