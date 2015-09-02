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
public class SubMenuModel {
    
    MyDbConnection db;
     Connection con;
     ArrayList<SubMenu> ac= new ArrayList<SubMenu>();
     
     
     
     public SubMenuModel()
     {
          db= new MyDbConnection();
         con=db.getMyConnection();
     }
   
      
         
  public ArrayList<SubMenu> allButtons() throws SQLException 
  {
      
     
      
        Statement s=con.createStatement();
        ResultSet res = s.executeQuery("SELECT * FROM sub_menu"); 
        

        while (res.next()) { 
            
             int id=res.getInt("Id");
         String name = res.getString("name");         
           int  cId=res.getInt("controller_menu_button_Id");
           
            
   SubMenu tmp = new SubMenu(id,name,cId);    
    ac.add(tmp);
    
    
        }            
            
      
      return ac;
  }
  
    public SubMenu findSubMenu(int id) throws SQLException
    {
        allButtons();
        for(SubMenu c :  ac)
        {
            
            
           if(c.id== id)
           {
               return c;
           }
        }
        return null;
    }
     
         public ArrayList<SubMenu> findChildren(int id) throws SQLException
    {
        allButtons();
        ArrayList<SubMenu> children=new ArrayList<SubMenu>();
        
        for(SubMenu c :  ac)
        {            
            
          if(c.controllerId==id)
           {
               children.add(c);
               
           }
        }
        return children;
    }
     
        public String insertSubMenu(String name ,int cid) throws SQLException        
         {
         con=db.getMyConnection();
        Statement s=con.createStatement();
       
        s.execute("insert into sub_menu values( 0,'"+name+"',"+cid+")");          
        
           ResultSet res = s.executeQuery("SELECT max(Id) FROM sub_menu"); 
        int id=0;

        while (res.next()) { 
            
           id=res.getInt("max(Id)");
           
        }
         return String.valueOf(id);
            }
        
             public void deleteSubMenu( int Id) throws SQLException 
    {         
        Statement s=con.createStatement();
        
        s.execute("delete from sub_menu where Id="+Id); 
        
        SubMenuButtonModel sub= new SubMenuButtonModel();
        
        ArrayList<SubMenuButton> myList= sub.findChildren(Id);
        
        
        for(SubMenuButton sb:myList)
        {
            sub.deleteSubMenuButton(sb.id);
        }
        
            
    }  
             
               public void updateSubMenu(int id , String name) throws SQLException
       {
        
        Statement s=con.createStatement();        
        s.execute("update sub_menu set name = '"+name+"' where Id="+id); 
        
       }
}
