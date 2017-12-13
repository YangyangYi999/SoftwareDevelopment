/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Policeman;

import Business.Alert.Alert;
import Business.Enterprise.Police;
import Business.Organization.AlertHandleOrganization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import Interface.SecureGuard.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shinychenw
 */
public class PolicemanHandleAlertJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAlertJPanel
     */
  
    JPanel userProcessContainer;
    UserAccount account;
    AlertHandleOrganization alertHandleOrganization;
    Police police;
    State state;
    PolicemanHandleAlertJPanel(JPanel userProcessContainer, AlertHandleOrganization alertHandleOrganization, Police police, State state, UserAccount account) {
        initComponents();
        this.account = account;
        this.alertHandleOrganization = alertHandleOrganization;
        this.userProcessContainer = userProcessContainer;
        this.police = police;
        this.state = state;
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

        jLabel1 = new javax.swing.JLabel();
        backJButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlert = new javax.swing.JTable();
        handleBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Handle Alert");

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        jTableAlert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Alert ID", "Date", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTableAlert);

        handleBtn.setText("Start to handle");
        handleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backJButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(handleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(142, 142, 142)))
                    .addContainerGap(115, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backJButton2)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(0, 485, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(handleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTableAlert.getModel();
        model.setRowCount(0);
        
        for (Alert a : police.getAlertDirectory().getAlertList()){
            if("waiting for handling".equals(a.getPolStatus())&& a.getPolice().equals(account.getUsername())){
            Object[] row = new Object[4];
            row[0] = a;
            row[1] = a.getAlertID();
            row[2] = a.getDate();
            row[3] = a.getCustomer().getLocation();          
            model.addRow(row);
            }
        }
    }
    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void handleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleBtnActionPerformed
        // TODO add your handling code here:
        int row = jTableAlert.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Alert a = (Alert)jTableAlert.getValueAt(row, 0);
            PoliceAlertProcessJPanel papjp = new PoliceAlertProcessJPanel(userProcessContainer, a, state);
            userProcessContainer.add("PoliceAlertProcessJPanel", papjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_handleBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton handleBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlert;
    // End of variables declaration//GEN-END:variables
}
