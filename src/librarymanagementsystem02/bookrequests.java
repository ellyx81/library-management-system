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
public class bookrequests {
     private int requestID;
     private int bookid2;
    private String booktitle2;
    private String availability2;
    private String dateborrowed;
    private String borrower;
    
    
     public bookrequests(int RequestID, int Bookid2, String Booktitle2, String Availability2, String DateBorrowed, String Borrower){
        this.requestID= RequestID;
        this.bookid2 = Bookid2;
        this.booktitle2 = Booktitle2;
        this.availability2 = Availability2;   
        this.dateborrowed = DateBorrowed;  
        this.borrower =  Borrower;  
    }
    
    public int getRequestID(){
        return requestID;
    }
    public int getBookid2(){
        return bookid2;
    }
    
    public String getBooktitle2(){
        return booktitle2;
    }
   
    public String getAvailability2(){
        return availability2;
    }
     
    public String getDateBorrowed(){
        return dateborrowed;
    }
     public String getBorrower(){
        return borrower;
    }
    
}


