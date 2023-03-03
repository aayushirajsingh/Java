/* Program to create database */
package aayushi_jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_Database {
    static final String DB_URL="jdbc:mysql://localhost/";
    static final String USER="root";
    static final String PASS="root";
    public static void main(String[] args) 
    {
        try
        {
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = con.createStatement();
            String sql = "CREATE DATABASE FOOD";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}