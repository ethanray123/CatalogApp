/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.Date;

/**
 *
 * @author student
 */
public class CatalogCard{
    private final int cardID;
    private String bookTitle;
    private String bookAuthor;
    private int yearPublished;
    private Date dateAdded;
    private Date dateUpdated;
    private String addedBy;
    private String updatedBy;
    
    public CatalogCard(){
        cardID = -1;
        bookTitle = "";
        bookAuthor = "";
        yearPublished = 0;
        dateAdded = new Date();
        dateUpdated = new Date();
        addedBy = "user02"; 
        updatedBy = "user02";
    }
    
    public CatalogCard(int id, String title, String author, 
            int year, Date added, Date updated){
        cardID = id;
        bookTitle = title;
        bookAuthor = author;
        yearPublished = year;
        dateAdded = added;
        dateUpdated = updated;
        addedBy = "user02"; 
        updatedBy = "user02";
    }
    
    //GETTERS
    public int getCardId(){
        return this.cardID;
    }
    
    public String getBookTitle(){
        return this.bookTitle;
    }
    
    public String getBookAuthor(){
        return this.bookAuthor;
    }
    
    public int getYearPublished(){
        return this.yearPublished;
    }
    
    public Date getDateAdded(){
        return this.dateAdded;
    }
    
    public Date getDateUpdated(){
        return this.dateUpdated;
    }
    
    public String getAddedBy(){
        return this.addedBy;
    }
    
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    
    
    //SETTERS
    public void setBookTitle(String newTitle){
        this.bookTitle = newTitle;
    }
    
    public void setBookAuthor(String newAuthor){
        this.bookAuthor = newAuthor;
    }
    
    public void setYearPublished(int newYear){
        this.yearPublished = newYear;
    }
    
    public void setDateUpdated(Date dateUpdated){
        this.dateUpdated = dateUpdated;
    }
    
    public void setUpdatedBy(String userUpdating){
        this.updatedBy = userUpdating;
    }
    
}
