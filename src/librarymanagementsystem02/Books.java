/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem02;

/**
 *
 * @author User
 */
public class Books {
    private int bookid;
    private String booktitle;
    private String bookauthor;
    private String publisher;
    private String publishing_date;
    private String availability;
    
    public Books(int Bookid, String Booktitle, String Bookauthor, String Publisher, String Pubdate, String Availability){
        this.bookid = Bookid;
        this.booktitle = Booktitle;
        this.bookauthor = Bookauthor;
        this.publisher = Publisher;
        this.publishing_date = Pubdate;
        this.availability = Availability;   
    }
    
    public int getBookid(){
        return bookid;
    }
    
    public String getBooktitle(){
        return booktitle;
    }
    
    public String getBookauthor(){
        return bookauthor;
    }
     public String getPublisher(){
        return publisher;
    }
    
      public String getPubdate(){
        return publishing_date;
    }
    
    public String getAvailability(){
        return availability;
    }
}
