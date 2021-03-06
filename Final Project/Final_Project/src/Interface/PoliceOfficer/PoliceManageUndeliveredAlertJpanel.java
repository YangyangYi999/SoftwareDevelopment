/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PoliceOfficer;

import Business.Alert.Alert;
import Business.Enterprise.Police;
import Business.Equipment.Order;
import Business.Equipment.OrderItem;
import Business.Organization.AlertHandleOrganization;
import Business.Organization.AlertManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.SecureOfficer.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shinychenw
 */
public class PoliceManageUndeliveredAlertJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAlertJpanel
     */
    
   JPanel userProcessContainer;
   AlertManageOrganization alertManageOrganization;
   Police police;
   State state;
    PoliceManageUndeliveredAlertJpanel(JPanel userProcessContainer, AlertManageOrganization alertManageOrganization, Police police, State state) {
        initComponents();
        this.alertManageOrganization = alertManageOrganization;
        this.police = police;
        this.state= state;
        this.userProcessContainer = userProcessContainer;
        for(Organization o : police.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof AlertHandleOrganization){
                jComboBoxOrg.addItem(o);
//                for(UserAccount ua:o.getUserAccountDirectory().getUserAccountList())
//                    jComboBoxGuard.addItem(ua);
//            }
            }
        }
        populateTable();
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
        jTableAlert = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPolice = new javax.swing.JComboBox();
        btnDeliver = new javax.swing.JButton();
        jComboBoxOrg = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        backJButton2 = new javax.swing.JButton();

        jTableAlert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name ", "Date", "Address", "Equipment ID"
            }
        ));
        jScrollPane1.setViewportView(jTableAlert);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Manage Undelivered Alert");

        jLabel2.setText("Choose a policeman to handle:");

        btnDeliver.setText("Deliver");
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });

        jComboBoxOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrgActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose Organization to handle:");

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBoxPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(backJButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backJButton2)
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnDeliver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTableAlert.getModel();
        model.setRowCount(0);
        
        for (Alert a : police.getAlertDirectory().getAlertList()){
            if("unhandled".equals(a.getPolStatus())){
            Object[] row = new Object[4];
            row[0] = a;
            row[1] = a.getDate();
            row[2] = a.getCustomer().getLocation(); 
            for(Order o:a.getCustomer().getOutmoc().getOrderCatalog()){
                for(OrderItem oi:o.getOrderItemList()){
                    row[3] = oi.getEquipment().getName();
                }
            }
            model.addRow(row);
            }
        }
    }
    private void jComboBoxOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrgActionPerformed
        // TODO add your handling code here:
        Organization o = (Organization)jComboBoxOrg.getSelectedItem();
        for(UserAccount ua:o.getUserAccountDirectory().getUserAccountList())
        jComboBoxPolice.addItem(ua);
    }//GEN-LAST:event_jComboBoxOrgActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed
        // TODO add your handling code here:
        int row = jTableAlert.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(jComboBoxPolice.getSelectedItem()!=null&&row>=0){
            UserAccount ua = (UserAccount)jComboBoxPolice.getSelectedItem();
            Alert a = (Alert)jTableAlert.getValueAt(row, 0);
            a.setPolice(ua.getUsername());
            a.setPolStatus("waiting for handling");
            populateTable();
        }
    }//GEN-LAST:event_btnDeliverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnDeliver;
    private javax.swing.JComboBox jComboBoxOrg;
    private javax.swing.JComboBox jComboBoxPolice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlert;
    // End of variables declaration//GEN-END:variables
}
