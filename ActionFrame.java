/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amoah
 */
public class ActionFrame extends javax.swing.JFrame {

    /**
     * Creates new form ActionFrame
     */
    public ActionFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonProcessRental = new javax.swing.JButton();
        buttonManageUsers = new javax.swing.JButton();
        buttonProcessSaleReturn = new javax.swing.JButton();
        buttonProcessRentalReturn = new javax.swing.JButton();
        buttonProcessSale = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonProcessRental.setText("ProcessRental");
        buttonProcessRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessRentalActionPerformed(evt);
            }
        });

        buttonManageUsers.setText("ManageUsers");

        buttonProcessSaleReturn.setText("ProcessSaleReturn");

        buttonProcessRentalReturn.setText("ProcessRentalReturn");

        buttonProcessSale.setText("ProcessSale");

        buttonLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonManageUsers)
                            .addComponent(buttonProcessRentalReturn)
                            .addComponent(buttonProcessRental)
                            .addComponent(buttonProcessSale)
                            .addComponent(buttonProcessSaleReturn))
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonLogout)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(buttonProcessRental)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProcessRentalReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProcessSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProcessSaleReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonManageUsers)
                .addGap(18, 18, 18)
                .addComponent(buttonLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProcessRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessRentalActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessRentalFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_buttonProcessRentalActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
     /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    /*  try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(ActionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form *//*
     java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     new ActionFrame().setVisible(true);
     }
     });
     }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonManageUsers;
    private javax.swing.JButton buttonProcessRental;
    private javax.swing.JButton buttonProcessRentalReturn;
    private javax.swing.JButton buttonProcessSale;
    private javax.swing.JButton buttonProcessSaleReturn;
    // End of variables declaration//GEN-END:variables
}
