/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel.SubMenuButtonController;

import DbModel.MyDbConnection;
import DbModel.SubMenu;
import DbModel.SubMenuButton;
import DbModel.SubMenuButtonModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mughees
 */
public class SSubMenuModel {
    
    MyDbConnection db;
     Connection con;
     ArrayList<SSubMenu> ac= new ArrayList<SSubMenu>();
     
     
     
     public SSubMenuModel()
     {
          db= new MyDbConnection();
         con=db.getMyConnection();
     }
   
      
         
  public ArrayList<SSubMenu> allButtons() throws SQLException 
  {
      
     
      
        Statement s=con.createStatement();
        ResultSet res = s.executeQuery("SELECT * FROM ssub_menu"); 
        

        while (res.next()) { 
            
             int id=res.getInt("Id");
         String name = res.getString("name");
           int  cId=res.getInt("controller_menu_button_Id");
           
            
   SSubMenu tmp = new SSubMenu(id,name,cId);    
    ac.add(tmp);
    
    
        }            
            
      
      return ac;
  }
  
      public SSubMenu findSubMenu(int id) throws SQLException
    {
        allButtons();
        for(SSubMenu c :  ac)
        {
            
            
           if(c.id== id)
           {
               return c;
           }
        }
        return null;
    }
     
         public ArrayList<SSubMenu> findChildren(int id) throws SQLException
    {
        allButtons();
        ArrayList<SSubMenu> children=new ArrayList<SSubMenu>();
        
        for(SSubMenu c :  ac)
        {            
            
          if(c.controllerId==id)
           {
               children.add(c);
               
           }
        }
        return children;
    }
     
        public String insertSubMenu(String name , int cid) throws SQLException        
         {
         con=db.getMyConnection();
        Statement s=con.createStatement();
       
        s.execute("insert into ssub_menu values( 0,'"+name+"',"+cid+")");           
        
           ResultSet res = s.executeQuery("SELECT max(Id) FROM ssub_menu"); 
        int id=0;

        while (res.next()) { 
            
           id=res.getInt("max(Id)");
           
        }
         return String.valueOf(id);
            }
        
    public void deleteSubMenu( int Id) throws SQLException 
    {         
        Statement s=con.createStatement();
        
        s.execute("delete from ssub_menu where Id="+Id); 
        
        SSubMenuButtonModel sub= new SSubMenuButtonModel();
        
        ArrayList<SSubMenuButton> myList= sub.findChildren(Id);       
        
        for(SSubMenuButton sb:myList)
        {
            sub.deleteSubMenuButton(sb.id);
        }
        
            
    }  
                public void updateSubMenu(int id , String name) throws SQLException
       {
        
        Statement s=con.createStatement();        
        s.execute("update ssub_menu set name = '"+name+"' where Id="+id); 
        
       }
}
