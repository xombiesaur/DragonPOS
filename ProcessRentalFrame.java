import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amoah
 */
public class ProcessRentalFrame extends javax.swing.JFrame {
		RentalTransaction rentalT;
    /**
     * Creates new form ProcessRentalFrame
     */
    public ProcessRentalFrame() {
        initComponents();
        setTitle("Process Rental");
        this.setLocationRelativeTo(null);
        rentalT = new RentalTransaction();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        textFieldItemID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textFieldQuantity = new javax.swing.JTextField();
        textFieldDuration = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        buttonProcess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPaneReceipt = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();
        buttonGoBack = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFieldItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldItemIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Item ID");

        jLabel2.setText("Quantity");

        jLabel3.setText("Duration");

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonRemove.setText("Remove");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        buttonProcess.setText("Process");
        buttonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(textPaneReceipt);

        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ItemID", "Quantity", "Duration", "TotalCost"
            }
        ));
        jScrollPane1.setViewportView(tableItems);

        buttonGoBack.setText("Go Back");
        buttonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(textFieldItemID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldQuantity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19)
                                .addComponent(textFieldDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonRemove)
                            .addComponent(buttonAdd)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(buttonProcess)
                        .addContainerGap(232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonGoBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonProcess)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(textFieldItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(textFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(textFieldDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAdd)
                        .addGap(1, 1, 1)
                        .addComponent(buttonRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(buttonGoBack))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
     private void buttonManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageUsersActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageUsersFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProcessRentalFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ProcessRentalFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ProcessRentalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_buttonManageUsersActionPerformed
    
    private void buttonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActionFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_buttonGoBackActionPerformed


    private void textFieldItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldItemIDActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
       	rentalT.addItemByID(textFieldItemID.getText(),Integer.parseInt(textFieldDuration.getText()), Integer.parseInt(textFieldQuantity.getText()));
        updateLineItemDisplay();
    }//GEN-LAST:event_buttonAddActionPerformed
    
    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt){
    		rentalT.removeItem();
    		updateLineItemDisplay();
    }

    private void buttonProcessActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
                int numOfRows = tableItems.getRowCount();
        TableModel tableModel = tableItems.getModel();
        float totalCost = 0.0f;
        textPaneReceipt.setText("");
        StyledDocument doc = textPaneReceipt.getStyledDocument();
        try {
            doc.insertString(doc.getLength(),
                    String.format("%-20s%20s\n\n", "Item:", "TotalCost:"),
                    null);
        } catch (BadLocationException ex) {
            Logger.getLogger(ProcessSaleFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int index = 0; index < numOfRows; index++) {
            String itemName = (String) tableModel.getValueAt(index, 1);
            int quantity = (int) tableModel.getValueAt(index, 2);
            int duration = (int) tableModel.getValueAt(index, 3);
            float unitCost = (((Double) tableModel.getValueAt(index, 4))
                    .floatValue()) / quantity;
            try {
                doc.insertString(doc.getLength(),
                        String.format("%-20s%5s%5s%10.2f\n", itemName, "(" + quantity
                                + ")", " days:" + duration,
                                unitCost),
                        null);
            } catch (BadLocationException ex) {
                Logger.getLogger(ProcessSaleFrame.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
            totalCost += quantity * unitCost;
        }
        try {
            doc.insertString(doc.getLength(),
                    String.format("\n%20s%8.2f\n", "FinalPayment:", totalCost),
                    null);
            doc.insertString(doc.getLength(),
                    String.format("All Rentals are due back 24 hrs after the last day or the full price will be charged"),
                    null);
        } catch (BadLocationException ex) {
            Logger.getLogger(ProcessSaleFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        final float finalPayment = totalCost;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentGUI(finalPayment).setVisible(true);
            }
        });
    }//GEN-LAST:event_buttonProcessActionPerformed

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
            java.util.logging.Logger.getLogger(ProcessRentalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessRentalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessRentalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessRentalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessRentalFrame().setVisible(true);
            }
        });
    }

		private void updateLineItemDisplay(){
        Object lineItems[][] = new Object[rentalT.lines.size()][5];
        int i = 0;
        for(RentalLineItem item : rentalT.lines){
            lineItems[i][0] = item.getItemID();
            lineItems[i][1] = item.getItemDescription();
            lineItems[i][2] = item.getQuantity();
            lineItems[i][3] = item.getDuration();
            lineItems[i][4] = item.getSubtotal();
            i++;
        }
        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            lineItems,
            new String [] {
                "ItemID", "Name", "Quantity","Duration", "TotalCost"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonGoBack;
    private javax.swing.JButton buttonProcess;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableItems;
    private javax.swing.JTextField textFieldDuration;
    private javax.swing.JTextField textFieldItemID;
    private javax.swing.JTextField textFieldQuantity;
    private javax.swing.JTextPane textPaneReceipt;
    // End of variables declaration//GEN-END:variables
}


