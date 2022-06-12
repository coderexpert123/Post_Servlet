/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.dao;
import java.sql.*;
import com.tech.blog.entities.User;
/**
 *
 * @author Nishant Singh
 */
public class UserDao {
    
    private Connection con;
    public UserDao(Connection con){
        this.con=con;    
    }

boolean f=true;
   public boolean saveUser(User user){
        try {
            //user-->
            
     
String q="insert into user(id,name,email,password) values (?,?,?,?)";            

PreparedStatement p=this.con.prepareStatement(q);

         p.setInt(1,user.getId());
        p.setString(2,user.getName());
        p.setString(3,user.getEmail());
        p.setString(4,user.getPassword());

        p.executeUpdate();
        f=true;
         
            
        } catch (Exception e) {
            
            e.printStackTrace();
         
            
        }
        return f;
    }
   
   //user login details
   
   public User getUserByEmailAndPassword(String email,String password){
       
       User user=null;
       
       try {
           
           String qu="select * from user where email=? and password=?";
           PreparedStatement st=this.con.prepareStatement(qu);
           st.setString(1, email);
           st.setString(2, password);
           
         ResultSet set=st.executeQuery();
           
           if (set.next()) {
               
               user=new User();
               String name=set.getString("name");
               user.setName(name);
               
               user.setId(set.getInt("id"));
               user.setEmail(set.getString("email"));
               user.setPassword(set.getString("password"));
               
               
           }
           
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  user;
       
   }
   
}
