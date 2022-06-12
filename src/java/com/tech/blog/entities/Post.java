 
package com.tech.blog.entities;
import java.sql.*;

public class Post {
 
    
    private int PID;
    private String pTittle;
    private String pContent;
    private String pCode;
    private String pPic;
    private Timestamp pDate;
    private int catID;
    private int userId;

    public Post(int PID, String pTittle, String pContent, String pCode, String pPic, Timestamp pDate, int catID, int userId) {
        this.PID = PID;
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pPic = pPic;
        this.pDate = pDate;
        this.catID = catID;
        this.userId = userId;
    }

    public Post(String pTittle, String pContent, String pCode, String pPic, Timestamp pDate, int catID, int userId) {
        this.pTittle = pTittle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.pPic = pPic;
        this.pDate = pDate;
        this.catID = catID;
        this.userId = userId;
    }

    public Post() {
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getpTittle() {
        return pTittle;
    }

    public void setpTittle(String pTittle) {
        this.pTittle = pTittle;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpPic() {
        return pPic;
    }

    public void setpPic(String pPic) {
        this.pPic = pPic;
    }

    public Timestamp getpDate() {
        return pDate;
    }

    public void setpDate(Timestamp pDate) {
        this.pDate = pDate;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
    
    
    
}
