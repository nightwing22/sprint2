/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author jamel_pc
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseConnection {
    

    
    
  static Connection myconnection;
  static String url = "jdbc:mysql://localhost:3306/pidevbugfree";
  static String login = "root";
  static String pwd = "";
  static DatabaseConnection instance;
  
    private DatabaseConnection() {
         try {
       myconnection = DriverManager.getConnection(url,
                   login, pwd);
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }
    
    public static DatabaseConnection getInstance(){
        
        if(instance== null)
            instance = new DatabaseConnection();
        
        
        return instance;
        
    }
    
    public Connection getConnection(){
        return myconnection;
    }
    
    
}
    
    
