/* Program to create table */
package aayushi_jdbc;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;*/

public class Create_Table {
    static final String DB_URL = "jdbc:mysql://localhost/food";
    static final String USER = "root";
    static final String PASS = "root";
    
    public static void main(String[] args) 
    {
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE REGISTRATION (id INTEGER not NULL,  first VARCHAR(255),  last VARCHAR(255),  age INTEGER,  PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}