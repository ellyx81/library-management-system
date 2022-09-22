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
public class Users {
     private int id;
    private String username;
    private String password;
    private String fname;
    private String mname;
    private String lname;
    private String phone;
    private String email;
    private String gender;
    
     public Users(int Id, String Username, String Password, String Fname, String Mname, String Lname, String Phone, String Email, String Gender){
        this.id = Id;
        this.username = Username;
        this.password = Password;
        this.fname = Fname;  
        this.mname = Mname;
        this.lname =Lname;  
        this.phone = Phone;
        this.email = Email;  
         this.gender = Gender; 
    }
    
    public int getId(){
        return id;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getFname(){
        return fname;
    }
    public String getMname(){
        return mname;
    }
    
    public String getLname(){
        return lname;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
       return email;
    }
    public String getGender(){
       return gender;
    }
    
}
