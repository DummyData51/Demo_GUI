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
public class MainMenuButton {
    
    public int id;
    public String name;
    public int userId;
    
    public MainMenuButton(int id , String n , int uid)
    {
        this.id=id;
        name = n;
        userId=uid;
    }
  
}
