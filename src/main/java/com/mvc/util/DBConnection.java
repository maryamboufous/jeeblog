package com.mvc.util;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
 public static Connection createConnection()
 {
     Connection con =null;
     String url = "jdbc:mysql://localhost:3306/miniprojetjee"; //MySQL URL and followed by the database name
     String username = "root"; 
     String password = "boufous"; //MySQL password   
     try 
     {

            Class.forName("com.mysql.jdbc.Driver"); //loading  driver 
         System.out.println("error sql");
         con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
        
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
     System.out.println("Printing connection object "+con);
     return con; 
 }
}