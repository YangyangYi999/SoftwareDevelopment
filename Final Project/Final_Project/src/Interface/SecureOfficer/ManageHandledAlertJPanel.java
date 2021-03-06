/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SecureOfficer;

import Business.Alert.Alert;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.Type.Police;
import Business.Enterprise.Insurance;
import Business.Enterprise.Police;
import Business.Enterprise.Secure;
import Business.Equipment.Order;
import Business.Equipment.OrderItem;
import Business.Organization.AlertManageOrganization;
import Business.State.State;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shinychenw
 */
public class ManageHandledAlertJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHandledAlertJPanel
     */
   
    JPanel userProcessContainer;
    AlertManageOrganization alertManageOrganization;
    Secure secure;
    State state;
    ManageHandledAlertJPanel(JPanel userProcessContainer, AlertManageOrganization alertManageOrganization, Secure secure, State state) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.alertManageOrganization=alertManageOrganization;
        this.secure=secure;
        this.state=state;
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTableAlert.getModel();
        model.setRowCount(0);
        
        for (Alert a : secure.getAlertDirectory().getAlertList()){
            if("handled".equals(a.getStatus())){
            Object[] row = new Object[3];
            row[0] = a;
            row[1] = a.getDate();
            row[2] = a.getCustomer().getLocation();          
            model.addRow(row);
            }
        }
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backJButton2 = new javax.swing.JButton();
        btnSend1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTableAlert.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Date", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTableAlert);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Manage Handled Alert");

        jButton1.setText("View Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Send to Police ?");

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        btnSend1.setText("Send");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Send to Insurance ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backJButton2)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnSend))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSend1)
                    .addComponent(jLabel8))
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int row = jTableAlert.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
             Alert a = (Alert)jTableAlert.getValueAt(row, 0);
             jTextArea1.setText(a.getMessage());
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        int row = jTableAlert.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Alert a = (Alert)jTableAlert.getValueAt(row, 0);
            if(a.getPolStatus()==""){
                for(Enterprise p:state.getEnterpriseDirectory().getEnterpriseList()){
                    if(p instanceof Police){
                        Police po;
                        po = (Police) p;
                        a.setPolStatus("unhandled");
                        po.getAlertDirectory().getAlertList().add(a);
                JOptionPane.showMessageDialog(null, "Alert has been sent!!", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "This alert has been sent already!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
        // TODO add your handling code here:
        int row = jTableAlert.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            Alert a = (Alert)jTableAlert.getValueAt(row, 0);
            if(a.getInsStatus()==""){
                a.setInsStatus("unhandled");
                for(Order order:a.getCustomer().getOutmoc().getOrderCatalog()){
                    for(OrderItem oi: order.getOrderItemList()){    
                        oi.getEquipment().getInsurance().getAlertDirectory().getAlertList().add(a); 
                        JOptionPane.showMessageDialog(null, "Alert has been sent!!", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }

        }
            else{
                JOptionPane.showMessageDialog(null, "This alert has been sent already!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSend1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSend1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlert;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
