/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbModel;

/**
 *
 * @author Mughees
 */
public class SubMenu {
    
      public int id;

      public String name;
    public int controllerId;
    
    public SubMenu(int id ,String name, int cid)
    {
        this.id=id;
        this.name=name;
        controllerId=cid;
    }
    
    
}
