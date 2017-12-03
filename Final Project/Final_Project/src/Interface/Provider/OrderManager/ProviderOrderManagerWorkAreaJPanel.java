/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Provider.OrderManager;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Provider;
import Business.Organization.OrderManageOrganization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author shinychenw
 */
public class ProviderOrderManagerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer; 
    UserAccount account;
    Enterprise enterprise;
    State state;
    OrderManageOrganization orderManageOrganization;
    /**
     * Creates new form SecureOfficerWorkAreaJPanel
     */
    public ProviderOrderManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,State state,OrderManageOrganization orderManageOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.state = state;
        this.orderManageOrganization = orderManageOrganization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnOrderEquipment = new javax.swing.JButton();
        btnHandleOrder = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Provider Order Manager Work Area");

        btnOrderEquipment.setText("Order Equipment");
        btnOrderEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderEquipmentActionPerformed(evt);
            }
        });

        btnHandleOrder.setText("Handle order from customer");
        btnHandleOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHandleOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHandleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(btnOrderEquipment)
                .addGap(18, 18, 18)
                .addComponent(btnHandleOrder)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHandleOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHandleOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHandleOrderActionPerformed

    private void btnOrderEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderEquipmentActionPerformed
        // TODO add your handling code here:
        OrderEquipmentJPanel oej = new OrderEquipmentJPanel(userProcessContainer, state, (Provider)enterprise ,orderManageOrganization);
        userProcessContainer.add("OrderEquipmentJPanel", oej);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderEquipmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHandleOrder;
    private javax.swing.JButton btnOrderEquipment;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
