/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Mughees
 */
//TO connect to Mysql db using jdbc 
public class MyDbConnection {
   
    private Connection myConnection;
    
    /** Creates a new instance of MyDBConnection */
    public MyDbConnection() {

          try{
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gui","root", "");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }

    public void init()
    {
    
     
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}
