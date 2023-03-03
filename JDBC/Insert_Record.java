/* JDBC(Java database connectivity) insert in table */
package aayushi_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Insert_Record {
    public static void main(String[] args) 
    {
        System.out.println("Inserting values in Mysql database tabel!");
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String db = "java_data";
        String driver = "com.mysql.jdbc.Driver";
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url+db,"root","root");
            try
            {
                Statement st = con.createStatement();
                int val = st
                .executeUpdate("INSERT employee (empid,empname,salary)values(2,'Shubhi','10000')");
                st.close();
                System.out.println("Data added");
            }
            catch(SQLException s)
            {
                System.out.println("SQL statement is not executed!");
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}