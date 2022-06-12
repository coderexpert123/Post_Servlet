/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.helper;

/**
 *
 * @author Nishant Singh
 */
import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection(){
         try {
            
             //driver class load
             Class.forName("com.mysql.jdbc.Driver");
             
             //crete connection class
 
           
                              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newsblogs","root", "root");

             
            
        } catch (Exception e) {
            
          e.printStackTrace();
          
        }
        
        return con;
    }
    
    
    

    
}