/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armaan
 */
 import java.awt.*;
 import javax.swing.table.*;
 import javax.swing.*;
 import java.util.*;
 import java.sql.*;
 import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ManageUsersFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageUsersFrame
     */
    
    private EmployeeManagement mg;
     
    public ManageUsersFrame() throws SQLException, IOException, ClassNotFoundException
    {
        initComponents();
        mg = new EmployeeManagement();
        setTitle("Manage Users View");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCashiers = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonGoBack = new javax.swing.JButton();
        buttonInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableCashiers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CashierID", "CashierName"
            }
        ));
        jScrollPane1.setViewportView(tableCashiers);

        buttonDelete.setText("Delete");

        buttonUpdate.setText("Update");

        buttonGoBack.setText("Go Back");

        buttonInsert.setText("Insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonGoBack))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(buttonDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGoBack))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    public DefaultTableModel buildTableModel(ResultSet rs)
   {

        try {
            ResultSetMetaData metaData = rs.getMetaData();
            
            // names of columns
            Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++)
            {
                columnNames.add(metaData.getColumnName(column));
            }
            
            // data of the table
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            
            while (rs.next())
            {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++)
                {
                    vector.add(rs.getObject(columnIndex));
                }
                
                data.add(vector);
            }
            
            return new DefaultTableModel(data, columnNames);
        } //end of buildTableModel()
        catch (SQLException ex) {
            Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(ManageUsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                try
                {
                  new ManageUsersFrame().setVisible(true);
                }
                
                catch(Exception e)
                {
                  e.printStackTrace();
                }
            }
        });
    }
    
    
    private void buttonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBackActionPerformed
        // TODO add your handling code here:
        System.out.println("!");
        
        this.setVisible(false);
        //this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActionFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_buttonGoBackActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonInsertActionPerformed
    

 private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt)
 {
     //tableCashiers
     DefaultTableModel model = (DefaultTableModel) tableCashiers.getModel();
        int[] rows = tableCashiers.getSelectedRows();
        int length = rows.length;
        String message = "You are about affect " + length + " entries.";
       JOptionPane.showMessageDialog(null,  message, "Warning", JOptionPane.WARNING_MESSAGE);

        for (int i = 0; i < rows.length; i++) {
         try {
             model.removeRow(rows[i] - i);
             String username2Delete = (String) tableCashiers.getModel().getValueAt(rows[i], 0);
             mg.removeEmployee(username2Delete);
         } catch (SQLException ex) {
             Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        
 }//end of buttonDeleteAction
    

private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) 
 {
     //tableCashiers
     DefaultTableModel model = (DefaultTableModel) tableCashiers.getModel();
        int[] rows = tableCashiers.getSelectedRows();
        //int length = rows.length;
        //String message = "You are about affect " + length + " entries.";
       //JOptionPane.showMessageDialog(null,  message, "Warning", JOptionPane.WARNING_MESSAGE);

        for (int i = 0; i < rows.length; i++) {
         try {
             // model.removeRow(rows[i] - i);
             String username = (String) tableCashiers.getModel().getValueAt(rows[i], 0);
             String name = (String) tableCashiers.getModel().getValueAt(rows[i], 1);
             String role = (String) tableCashiers.getModel().getValueAt(rows[i], 2);
             String pass = (String) tableCashiers.getModel().getValueAt(rows[i], 3);
             
             int r = mg.editEmployee(username, name, role, pass);
             
             switch(r)
             {
                 case 2:
                     JOptionPane.showMessageDialog(null,  "Improper name entry!", "ERROR", JOptionPane.ERROR_MESSAGE);
                     break;
                     
                 case 3:
                     JOptionPane.showMessageDialog(null,  "Invalid role entry!", "ERROR", JOptionPane.ERROR_MESSAGE);
                     break;
                     
                 case 1:
                     JOptionPane.showMessageDialog(null,  "User not found!", "ERROR", JOptionPane.ERROR_MESSAGE);
                     break;
                     
                 case 4:
                     JOptionPane.showMessageDialog(null,  "Improper password entry!", "ERROR", JOptionPane.ERROR_MESSAGE);
                     break;
             }
             
             System.out.println("Update complete.");
         } catch (SQLException ex) {
             Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ManageUsersFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        
        
 }//end of buttonUpdateAction







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonGoBack;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCashiers;
    // End of variables declaration//GEN-END:variables
}
