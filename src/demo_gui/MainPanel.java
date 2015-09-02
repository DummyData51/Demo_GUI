/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_gui;


import DbModel.AccountModel;
import DbModel.MainMenuButton;
import DbModel.MainMenuButtonModel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mughees
 */
public class MainPanel extends javax.swing.JFrame  implements ActionListener{

    JButton clicked;
     ArrayList<JButton> buttons;
     int userId;
     int xMouse;
     int YMouse;
     JButton jb;

    /**
     * Creates new form MainPanel
     */     
    public MainPanel() throws SQLException 
    {
        initComponents();
       MainMenu.setLayout(new BoxLayout(MainMenu, BoxLayout.Y_AXIS));   
       
      
     
    }

     public void setUserId(int id) throws SQLException
     {
         userId=id;
          MainMenuButtonModel mm= new MainMenuButtonModel();
       ArrayList<MainMenuButton> initialList=mm.findChildren(userId);
       for(MainMenuButton s:initialList)
       {
           JButton b=new JButton(s.name);
           b.setName(String.valueOf(s.id));
            b.addActionListener(this);
           MainMenu.add(b);
       }
       MainMenu.repaint();
       MainMenu.revalidate();
       
     }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EditMenu = new javax.swing.JButton();
        AddMenu = new javax.swing.JButton();
        AddDelete = new javax.swing.JButton();
        MainMenuScroll = new javax.swing.JScrollPane();
        MainMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        editMainMenuButton = new javax.swing.JButton();
        EditMenu1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        EditMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/deletebutton.PNG"))); // NOI18N
        EditMenu.setName("delete"); // NOI18N
        EditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenuActionPerformed(evt);
            }
        });
        jPanel1.add(EditMenu);
        EditMenu.setBounds(670, 500, 60, 50);

        AddMenu.setText("+");
        AddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMenuActionPerformed(evt);
            }
        });
        jPanel1.add(AddMenu);
        AddMenu.setBounds(1283, 225, 41, 23);

        AddDelete.setText("#");
        AddDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(AddDelete);
        AddDelete.setBounds(781, 1096, 43, 23);

        MainMenuScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MainMenuScroll.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MainMenu.setBackground(new java.awt.Color(255, 255, 255));
        MainMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MainMenu.setLayout(null);
        MainMenuScroll.setViewportView(MainMenu);

        jPanel1.add(MainMenuScroll);
        MainMenuScroll.setBounds(20, 70, 180, 400);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Controller-crop.jpg"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 480, 100, 80);

        editMainMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/editbutton.PNG"))); // NOI18N
        editMainMenuButton.setName("editMainMenuButton"); // NOI18N
        editMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMainMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editMainMenuButton);
        editMainMenuButton.setBounds(730, 500, 70, 50);

        EditMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/button.PNG"))); // NOI18N
        EditMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(EditMenu1);
        EditMenu1.setBounds(800, 500, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/11873908_845220685574220_1650186313_n.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -10, 50, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/min.PNG"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(810, 10, 20, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/cross.PNG"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(840, 10, 20, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/Final_controller_back.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 880, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMenuActionPerformed
         try {            
             CreateButton();
         } catch (SQLException ex) {
             Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_AddMenuActionPerformed

    private void AddDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenuActionPerformed
           
        
        clicked= (JButton)evt.getSource();   
        
        
    }//GEN-LAST:event_EditMenuActionPerformed

    private void editMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMainMenuButtonActionPerformed

     clicked = (JButton) evt.getSource();       
        
    }//GEN-LAST:event_editMainMenuButtonActionPerformed

    private void EditMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenu1ActionPerformed
         try {
             
             CreateButton();
         } catch (SQLException ex) {
             Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_EditMenu1ActionPerformed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
       
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x -xMouse, y - YMouse);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        
        xMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        this.dispose();
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setExtendedState(this.getExtendedState() | this.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */


    public void CreateButton() throws SQLException
    {
        JButton b= new JButton();       
         
        b.setText("           ");
   
       
        
        b.addActionListener(this);
      
        MainMenuButtonModel bt = new MainMenuButtonModel();
        String s=bt.insertMainMenuButton(b.getText(),userId);
         b.setName(s);
           MainMenu.add(b);
         
               Component[] components =  MainMenu.getComponents(); 
           MainMenu.setPreferredSize(new Dimension(100,(components.length*30))); 
       
      
        MainMenu.revalidate();
        MainMenu.repaint();
        
        
        
        
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDelete;
    private javax.swing.JButton AddMenu;
    private javax.swing.JButton EditMenu;
    private javax.swing.JButton EditMenu1;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JScrollPane MainMenuScroll;
    private javax.swing.JButton editMainMenuButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(clicked !=null && clicked.getName().equals("delete"))
        {
            JButton b= (JButton)e.getSource();
        
        int id = Integer.parseInt(b.getName());
        MainMenuButtonModel m= new MainMenuButtonModel();
         try {
             m.deleteMainMenuButton(id);
             MainMenu.remove(b);
             MainMenu.revalidate();
             MainMenu.repaint();
             clicked=null;
         } catch (SQLException ex) {
             
         }
        }
        else if(clicked !=null && clicked.getName().equals("editMainMenuButton"))
        {
            JButton b= (JButton)e.getSource();        
            
            EditButtonFrame ef= new EditButtonFrame();
            ef.setVisible(true);
            ef.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                 try
                 {
                     
                      int id = Integer.parseInt(b.getName());
            
            
            MainMenuButtonModel m= new MainMenuButtonModel();
     
             m.updateMainMenuButton(id,ef.getName());
            b.setText(ef.getName());
             MainMenu.revalidate();
             MainMenu.repaint();
             clicked=null;
         } catch (SQLException ex) {
             
         }
                
                ef.dispose();
            }
        });
       
        }
        else
        {
            
       Controller c=new Controller();
       
     
        
       
       MainMenuButtonModel mm=new MainMenuButtonModel();
       MainMenuButton b=null;
       
       String s=((JButton)e.getSource()).getName();
      
       
       int id=Integer.parseInt(s);
         try {
             b = mm.findMainMenuButton(id);
              c.setMainMenuId(b.id);
             
              
         } catch (SQLException ex) {
            
         }
     
      c.setVisible(true);      
        
      
              
            
        }
     
        
    }
}
