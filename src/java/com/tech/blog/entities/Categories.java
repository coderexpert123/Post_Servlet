 
package com.tech.blog.entities;

 
public class Categories {
    
    
    private int cId;
    private String cName;
    private String cDescription;

    public Categories(int cId, String cName, String cDescription) {
        this.cId = cId;
        this.cName = cName;
        this.cDescription = cDescription;
    }

    public Categories() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public Categories(String cName, String cDescription) {
        this.cName = cName;
        this.cDescription = cDescription;
    }
    
    
}
