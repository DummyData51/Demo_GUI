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
public class SubMenuButton {
    
        public int id;
    public String name;
    public int subMenuId;
    
    public SubMenuButton(int id , String n , int sid)
    {
        this.id=id;
        name = n;
        subMenuId=sid;
    }
    
    
}
