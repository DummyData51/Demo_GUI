/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mateen
 */
public class EditButtonWithPic extends javax.swing.JFrame {

    
    int id ;
    String name;
     int xMouse;
     int YMouse;
     
    JFileChooser chooser = new JFileChooser();;
    BufferedImage img;
    JButton button,button2;
    JFrame comp;
    String filename;
    File file ; 
    JLabel label;
    /**
     * 
     * Creates new form EditButtonWithPic
     */
    public EditButtonWithPic() {
        initComponents();
    }
    
      
    public void setIdName(int id , String name )
    {
        this.id = id ;
        this.name = name ;
        
    }

    
    public String getName()
    {
        return newName.getText();
        
    }
    
      public void setName(String name )
    {
       newName.setText(name);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pic_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

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
        jLabel3.setBounds(0, -10, 50, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/min.PNG"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 10, 20, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/cancel.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 160, 60, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/Edit_menu_attach.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(120, 150, 70, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/cross.PNG"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 10, 20, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/saveme.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 160, 60, 50);

        pic_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/no pic.jpg"))); // NOI18N
        jPanel1.add(pic_label);
        pic_label.setBounds(20, 130, 90, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/Edit_menu_name.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 70, 80, 30);

        newName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newName.setName(""); // NOI18N
        jPanel1.add(newName);
        newName.setBounds(130, 80, 200, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_gui/Images/Edit_menu_back.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 410, 250);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\FREE LANCER\\Free Lancer GUI\\New folder\\Demo_GUI\\src\\demo_gui\\Images\\Edit_menu_back.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 410, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setExtendedState(this.getExtendedState() | this.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x -xMouse, y - YMouse);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

        xMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

     public File getFile()
     {
         return file;
     }
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           
         try {
                    chooser.showOpenDialog(new JLabel());
                    file = chooser.getSelectedFile();
                    
                    
                                 
                      BufferedImage img;
                      
                        img=ImageIO.read(file);
                        ImageIcon icon=new ImageIcon(img); // ADDED
                        

                           //-------Resiging th image 
                        Image i = icon.getImage(); 
                        Image newone = i.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
                        icon = new ImageIcon(newone);
                        //---------
                        
                        
                        pic_label.setIcon(icon); // ADDED
                        
                        pic_label.revalidate(); // ADDED
                        pic_label.repaint(); // ADDED
                        
                        
                    }
                    catch(Exception e1) {}

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditButtonWithPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditButtonWithPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditButtonWithPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditButtonWithPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditButtonWithPic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newName;
    private javax.swing.JLabel pic_label;
    // End of variables declaration//GEN-END:variables
}
