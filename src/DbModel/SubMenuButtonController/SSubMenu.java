/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel.SubMenuButtonController;

/**
 *
 * @author Mughees
 */
public class SSubMenu {
    
      public int id;
      public String name ;
    public int controllerId;
    
    public SSubMenu(int id ,String name , int cid)
    {
        this.id=id;
   this.name=name ;
        controllerId=cid;
    }
    
    
}
