/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel;

import DbModel.SubMenuButtonController.SControllerMenuButton;
import DbModel.SubMenuButtonController.SControllerMenuButtonModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mughees
 */
public class SubMenuButtonModel {
    
     MyDbConnection db;
     Connection con;
      
     ArrayList<SubMenuButton> ac= new ArrayList<SubMenuButton>();
     
     
     
     public SubMenuButtonModel()
     {
          db= new MyDbConnection();
         con=db.getMyConnection();
     }
   
      
         
  public ArrayList<SubMenuButton> allButtons() throws SQLException 
  {
      
     
      
        Statement s=con.createStatement();
        ResultSet res = s.executeQuery("SELECT * FROM sub_menu_button"); 
        

        while (res.next()) { 
            
             int id=res.getInt("Id");
            String name=res.getString("name");
           int  sId=res.getInt("sub_menu_Id");
           
            
   SubMenuButton tmp = new SubMenuButton(id,name,sId);    
    ac.add(tmp);
    
    
        }            
            
      
      return ac;
  }
  
      public SubMenuButton findMainMenuButton(String name) throws SQLException
    {
        allButtons();
        for(SubMenuButton c :  ac)
        {
            
            
           if(c.name.equals(name))
           {
               return c;
           }
        }
        return null;
    }
     
            public ArrayList<SubMenuButton> findChildren(int id) throws SQLException
    {
        allButtons();
        ArrayList<SubMenuButton> children=new ArrayList<SubMenuButton>();
        
        for(SubMenuButton c :  ac)
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
       
        s.execute("insert into sub_menu_button values( 0,'"+name+"',"+sid+")");   
        
           ResultSet res = s.executeQuery("SELECT max(Id) FROM sub_menu_button"); 
        int id=0;

        while (res.next()) { 
            
           id=res.getInt("max(Id)");
           
        }
         return String.valueOf(id);
        
            }
      
     public void deleteSubMenuButton( int Id) throws SQLException 
    {         
        Statement s=con.createStatement();        
        s.execute("delete from sub_menu_button where Id="+Id);   
        
        
          SControllerMenuButtonModel sub= new SControllerMenuButtonModel();
        
        ArrayList<SControllerMenuButton> myList= sub.findChildren(Id);
        
        
        for(SControllerMenuButton sb:myList)
        {
            sub.deleteControllerMenuButton(sb.id);
        }
    }  
           
        public void updateSubMenuButton(int id , String name) throws SQLException
       {
        
        Statement s=con.createStatement();        
        s.execute("update sub_menu_button set name = '"+name+"' where Id="+id); 
        
       }
}
