/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogapp;

import java.util.Date;
import resources.CatalogCard;
import resources.Database;

/**
 *
 * @author My PC
 */
public class RemoveCatalogCard extends javax.swing.JFrame {

    /**
     * Creates new form AddCatalogCard
     */
    public RemoveCatalogCard() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cardIdField = new javax.swing.JTextField();
        removeCatalogCardBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        welcomeUserLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        alert = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 80, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Card ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 100, 50, -1));

        cardIdField.setBackground(new java.awt.Color(0, 80, 80));
        cardIdField.setForeground(new java.awt.Color(255, 255, 255));
        cardIdField.setBorder(null);
        cardIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardIdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(cardIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 129, 200, -1));

        removeCatalogCardBtn.setBackground(new java.awt.Color(0, 51, 51));
        removeCatalogCardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeCatalogCardBtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Remove Catalog Card");

        javax.swing.GroupLayout removeCatalogCardBtnLayout = new javax.swing.GroupLayout(removeCatalogCardBtn);
        removeCatalogCardBtn.setLayout(removeCatalogCardBtnLayout);
        removeCatalogCardBtnLayout.setHorizontalGroup(
            removeCatalogCardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeCatalogCardBtnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        removeCatalogCardBtnLayout.setVerticalGroup(
            removeCatalogCardBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeCatalogCardBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(removeCatalogCardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, -1));

        welcomeUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeUserLabel.setText("Hello, User02!");
        jPanel1.add(welcomeUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 23));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 147, 200, 10));

        alert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 440, 50));

        goBackBtn.setBackground(new java.awt.Color(0, 51, 51));
        goBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackBtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Go Back");

        javax.swing.GroupLayout goBackBtnLayout = new javax.swing.GroupLayout(goBackBtn);
        goBackBtn.setLayout(goBackBtnLayout);
        goBackBtnLayout.setHorizontalGroup(
            goBackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goBackBtnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        goBackBtnLayout.setVerticalGroup(
            goBackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goBackBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(goBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardIdFieldActionPerformed

    private void removeCatalogCardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeCatalogCardBtnMouseClicked
        int id = Integer.parseInt(cardIdField.getText());
        if(Database.removeFromActiveCardsWhereIdIs(id)){
            alert.setText("Catalog has been removed from the system");
        }else{
            alert.setText("Error.. The Catalog was not removed");
        }
    }//GEN-LAST:event_removeCatalogCardBtnMouseClicked

    private void goBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackBtnMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(RemoveCatalogCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveCatalogCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveCatalogCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveCatalogCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveCatalogCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JTextField cardIdField;
    private javax.swing.JPanel goBackBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel removeCatalogCardBtn;
    private javax.swing.JLabel welcomeUserLabel;
    // End of variables declaration//GEN-END:variables
}
