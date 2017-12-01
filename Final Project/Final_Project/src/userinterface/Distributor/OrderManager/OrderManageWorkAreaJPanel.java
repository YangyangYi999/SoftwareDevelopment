/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Distributor.OrderManager;

import userinterface.Distributor.*;
import Business.EcoSystem;
import Business.Enterprise.Distributor;
import Business.Enterprise.Enterprise;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.OrderManageOrganization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yiyangyang
 */
public class OrderManageWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributorEquipmentManageWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    OrderManageOrganization orderManageOrganization;
    State state;
    private Distributor distributor;
   

   

    public OrderManageWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OrderManageOrganization orderManageOrganization, Distributor distributor,State state) {
        initComponents();
        this.orderManageOrganization = orderManageOrganization;
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.state = state;
        this.distributor = distributor;
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
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnBuyEquip = new javax.swing.JButton();

        jLabel1.setText("Distributor Equipment Manage Work Area");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        btnBuyEquip.setText("Order Equipments");
        btnBuyEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyEquipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuyEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(valueLabel)))
                .addGap(71, 71, 71)
                .addComponent(btnBuyEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyEquipActionPerformed
        // TODO add your handling code here:
        OrderEquipmentJPanel oejp = new OrderEquipmentJPanel(userProcessContainer,state,distributor,orderManageOrganization );
        userProcessContainer.add("OrderEquipmentJPanel", oejp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyEquipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyEquip;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
