/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package in.impetusits.menudemo;

import java.awt.MenuItem;

/**
 *
 * @author Hrishi
 */
public class MenuDemo extends java.awt.Frame {

    /**
     * Creates new form MenuDemo
     */
    public MenuDemo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        menuBar2 = new java.awt.MenuBar();
        menu4 = new java.awt.Menu();
        menu5 = new java.awt.Menu();
        popupMenu2 = new java.awt.PopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menuItem1 = new java.awt.MenuItem();
        menuItem2 = new java.awt.MenuItem();
        menuItem3 = new java.awt.MenuItem();
        menu2 = new java.awt.Menu();
        menuItem4 = new java.awt.MenuItem();
        menu3 = new java.awt.Menu();

        popupMenu1.setLabel("popupMenu1");

        menu4.setLabel("File");
        menuBar2.add(menu4);

        menu5.setLabel("Edit");
        menuBar2.add(menu5);

        popupMenu2.setLabel("popupMenu2");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        menu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menu1.setLabel("File");
        menu1.setName("File");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menuItem1.setLabel("Open");
        menu1.add(menuItem1);

        menuItem2.setLabel("Close");
        menu1.add(menuItem2);

        menuItem3.setLabel("Exit");
        menu1.add(menuItem3);

        menuBar1.add(menu1);

        menu2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menu2.setLabel("Edit");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menuItem4.setLabel("Cut");
        menu2.add(menuItem4);

        menuBar1.add(menu2);

        menu3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menu3.setLabel("Debug");
        menuBar1.add(menu3);

        setMenuBar(menuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        System.out.println("File Selected");
    }//GEN-LAST:event_menu1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDemo().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuItem menuItem1;
    private java.awt.MenuItem menuItem2;
    private java.awt.MenuItem menuItem3;
    private java.awt.MenuItem menuItem4;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
