

package com.tech.blog.dao;
import com.tech.blog.entities.Categories;
import com.tech.blog.entities.Post;
import java.sql.*;
import java.util.ArrayList;
public class PostDao {
    Connection con;

    public PostDao(Connection con) {
        
        this.con=con;
        
    }
    
    public ArrayList<Categories> getCategories(){
        
        ArrayList<Categories> list = new ArrayList<>();
        
        try {
            String q="select * from categories";
            Statement st=this.con.createStatement();
            ResultSet rt=st.executeQuery(q);
            
            while(rt.next()){
                int cid=rt.getInt("cid");
                String name=rt.getString("name");
                String desc=rt.getString("description");
                
                Categories c=new Categories(cid,name,desc);
                
                list.add(c);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
        
    }
    //save post data to database
    
    public boolean savePost(Post post){
        boolean f=false;
        try {
            
            String q="insert into post(pTittle,pContent,pCode,pPic,catID,userId) values (?,?,?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,post.getpTittle());
            pstmt.setString(2,post.getpContent());
            pstmt.setString(3,post.getpCode());
            pstmt.setString(4,post.getpPic());
            pstmt.setInt(5,post.getCatID());
            pstmt.setInt(6,post.getUserId());
            
            pstmt.executeUpdate();
            f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
