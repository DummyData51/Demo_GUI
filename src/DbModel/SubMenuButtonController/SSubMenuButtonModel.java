/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel.SubMenuButtonController;

import DbModel.MyDbConnection;
import DbModel.SubMenuButton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mughees
 */
public class SSubMenuButtonModel {
    
     MyDbConnection db;
     Connection con;
      
     ArrayList<SSubMenuButton> ac= new ArrayList<SSubMenuButton>();
     
     
     
     public SSubMenuButtonModel()
     {
          db= new MyDbConnection();
         con=db.getMyConnection();
     }
   
      
         
  public ArrayList<SSubMenuButton> allButtons() throws SQLException 
  {
      
     
      
        Statement s=con.createStatement();
        ResultSet res = s.executeQuery("SELECT * FROM ssub_menu_button"); 
        

        while (res.next()) { 
            
             int id=res.getInt("Id");
            String name=res.getString("name");
           int  sId=res.getInt("sub_menu_Id");
           
            
   SSubMenuButton tmp = new SSubMenuButton(id,name,sId);    
    ac.add(tmp);
    
    
        }            
            
      
      return ac;
  }
  
      public SSubMenuButton findMainMenuButton(String name) throws SQLException
    {
        allButtons();
        for(SSubMenuButton c :  ac)
        {
            
            
           if(c.name.equals(name))
           {
               return c;
           }
        }
        return null;
    }
     
            public ArrayList<SSubMenuButton> findChildren(int id) throws SQLException
    {
        allButtons();
        ArrayList<SSubMenuButton> children=new ArrayList<SSubMenuButton>();
        
        for(SSubMenuButton c :  ac)
        {            
            
          if(c.subMenuId==id)
           {
               children.add(c);
               
           }
        }
        return children;
    }
      public String insertSubMenuButton( String name , int sid) throws SQLException        
         {
         con=db.getMyConnection();
        Statement s=con.createStatement();
       
        s.execute("insert into ssub_menu_button values( 0,'"+name+"',"+sid+")");   
        
           ResultSet res = s.executeQuery("SELECT max(Id) FROM ssub_menu_button"); 
        int id=0;

        while (res.next()) { 
            
           id=res.getInt("max(Id)");
           
        }
         return String.valueOf(id);
        
            }
      
     public void deleteSubMenuButton( int Id) throws SQLException 
    {         
        Statement s=con.createStatement();        
        s.execute("delete from ssub_menu_button where Id="+Id);  
        
    }  
           
        public void updateSubMenuButton(int id , String name) throws SQLException
       {
        
        Statement s=con.createStatement();        
        s.execute("update ssub_menu_button set name = '"+name+"' where Id="+id); 
        
       }
}
