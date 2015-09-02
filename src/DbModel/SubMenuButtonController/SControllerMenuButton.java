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
public class SControllerMenuButton {
    
      public int id;
    public String name;
    public int mainMenuId;
    
    public SControllerMenuButton(int id , String n , int uid)
    {
        this.id=id;
        name = n;
        mainMenuId=uid;
    }
}
