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
public class User {
    
    
    public int id;
    public String username;
    public String password;

    User(int id ,String name, String pass) {
      this.id=id;
       username = name;
       password=pass;
    }
    
    
    
}
