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
public class ControllerMenuButton {
    
      public int id;
    public String name;
    public int mainMenuId;
    
    public ControllerMenuButton(int id , String n , int uid)
    {
        this.id=id;
        name = n;
        mainMenuId=uid;
    }
}
