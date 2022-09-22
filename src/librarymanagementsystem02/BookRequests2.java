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
public class BookRequests2 {
     private int borrowID;
     private int bookid3;
    private String booktitle3;
    private String availability3;
    private String dateborrowed1;
    private String borrower1;
    private String librarian;    
    
     public BookRequests2(int BorrowID, int Bookid2, String Booktitle2, String Availability2, String DateBorrowed, String Borrower, String Librarian){
        this.borrowID= BorrowID;
        this.bookid3 = Bookid2;
        this.booktitle3 = Booktitle2;
        this.availability3 = Availability2;   
        this.dateborrowed1 = DateBorrowed;  
        this.borrower1 =  Borrower; 
        this.librarian =  Librarian; 
}
public int getBorrowID(){
        return borrowID;
    }
    public int getBookid3(){
        return bookid3;
    }
    
    public String getBooktitle3(){
        return booktitle3;
    }
   
    public String getAvailability3(){
        return availability3;
    }
     
    public String getDateBorrowed1(){
        return dateborrowed1;
    }
     public String getBorrower1(){
        return borrower1;
    }
     public String getLibrarian(){
        return librarian;
    }
}