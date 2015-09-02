/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mughees
 */
public class MainMenuButtonModel {
    
     MyDbConnection db;
     Connection con;
     ArrayList<MainMenuButton> ac= new ArrayList<MainMenuButton>();
     
     
     
     public MainMenuButtonModel()
     {
          db= new MyDbConnection();
         con=db.getMyConnection();
     }
   
      
         
  public ArrayList<MainMenuButton> allButtons() throws SQLException 
  {
      
     
      
        Statement s=con.createStatement();
        ResultSet res = s.executeQuery("SELECT * FROM main_menu_button"); 
        

        while (res.next()) { 
            
             int id=res.getInt("Id");
            String name=res.getString("name");
           int  userId=res.getInt("userId");
           
            
   MainMenuButton tmp = new MainMenuButton(id,name,userId);    
    ac.add(tmp);
    
    
        }            
            
      
      return ac;
  }
  
   public ArrayList<MainMenuButton> findChildren(int id) throws SQLException
    {
        allButtons();
        ArrayList<MainMenuButton> children=new ArrayList<MainMenuButton>();
        
        for(MainMenuButton c :  ac)
        {            
            
          if(c.userId==id)
           {
               children.add(c);
               
           }
        }
        return children;
    }
  
  
      public MainMenuButton findMainMenuButton(int id) throws SQLException
    {
        allButtons();
        for(MainMenuButton c :  ac)
        {
            
            
           if(c.id==id)
           {
               return c;
           }
        }
        return null;
    }
    
      
        
    public String insertMainMenuButton( String name, int userId) throws SQLException
    {
         
        Statement s=con.createStatement();
       
        s.execute("insert into main_menu_button values( 0,'"+name+"',"+userId+")");
        
         ResultSet res = s.executeQuery("SELECT max(Id) FROM main_menu_button"); 
        int id=0;

        while (res.next()) { 
            
           id=res.getInt("max(Id)");
           
        }
            
              
        
            
        return String.valueOf(id);
          
    }
       public void deleteMainMenuButton( int Id) throws SQLException 
    {         
        Statement s=con.createStatement();
        
        s.execute("delete from main_menu_button where Id="+Id); 
        
         ControllerMenuButtonModel sub= new ControllerMenuButtonModel();
        
        ArrayList<ControllerMenuButton> myList= sub.findChildren(Id);
        
        
        for(ControllerMenuButton sb:myList)
        {
            sub.deleteControllerMenuButton(sb.id);            
         } 
    }
       
       public void updateMainMenuButton(int id , String name) throws SQLException
       {
           Statement s=con.createStatement();
        
        s.execute("update main_menu_button set name = '"+name+"' where Id="+id); 
       }
}
        
            
        
          
    
          
         
         
         

