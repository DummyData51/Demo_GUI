/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mughees
 */

/*
Model for inserting and getting accounts from mysql database
*/
public class AccountModel  {

   ArrayList<User> ac= new ArrayList<User>();
    MyDbConnection db;
     Connection con;
     
     
    public AccountModel()
    {
        db= new MyDbConnection();
         con=db.getMyConnection();
      
    }
    //return all accounts  currently in database
    
    
  public ArrayList<User> allAccounts() throws SQLException 
  {
      
     
      
        Statement s=con.createStatement();
        ResultSet res = s.executeQuery("SELECT * FROM user"); 
        

        while (res.next()) { 
            
             int id=res.getInt("Id");
            String name=res.getString("username");
           String  pass=res.getString("password");
           
            
   User tmp = new User(id,name,pass);    
    ac.add(tmp);
        }        

      
            
      
      return ac;
  }
  
  // Inserts account in database
    public void insertAccount( String name, String pass) throws SQLException
    {
         con=db.getMyConnection();
        Statement s=con.createStatement();
       
        s.execute("insert into user values( 0,'"+name+"','"+pass+"')");
       
        
            }
    
    //updates amount of an account in database
     public void UpdateAccount(int n,double amount) throws SQLException
    {
        con=db.getMyConnection();
        Statement s=con.createStatement();
       
        s.executeUpdate("Update Account Set Amount="+amount+" where AccountNumber= "+n);       
        
            }
   
         
         //finds and returns account on base of account number
    public User findAccount(String name) throws SQLException
    {
        allAccounts();
        for(User c :  ac)
        {
            c.username=c.username.trim();
            
           if(c.username.equals(name))
           {
               return c;
           }
        }
        return null;
    }
    }
    

