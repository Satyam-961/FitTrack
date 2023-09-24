/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author SATYAM GUPTA
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
         //   Class.forName("com.mysql.cj.jdbc.Driver");
         //   Connection con=DriverManager.getConnection("jdbc:mysql://loacalhost:3306/gms","root","Satyam@143");
         //   return con;
            
            Class.forName("com.mysql.jdbc.Driver");  
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","Satyam@143");  

      //    Statement stmt=con.createStatement();  
          return con;
        }
        catch(Exception e)
        {
             return null;
       
        }
    }
}
