/* Program to Delete record from database */
package aayushi_jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class Delete {
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT empid,empname,salary FROM employee";
    public static void main(String[] args) 
    {
        try
        {
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM employee"+"WHERE empname = 'Deepak";
            stmt.executeQuery(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next())
            {
                System.out.println("ID: "+rs.getInt("empid"));
                System.out.println(", Name: "+rs.getString("empname"));
                System.out.println(", Salary: "+rs.getInt("salary"));
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();    
        }
    }
}