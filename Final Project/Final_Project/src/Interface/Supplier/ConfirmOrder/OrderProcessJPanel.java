/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Supplier.ConfirmOrder;

import Business.Enterprise.Distributor;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Supplier;
import Business.Equipment.Order;
import Business.Equipment.OrderItem;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.OrderManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.UserAccount;
import Business.State.State;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yiyangyang
 */
public class OrderProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderProcessJPanel
     */
    JPanel userProcessContainer;
    OrderManageOrganization orderManageOrganization;
    Supplier supplier;
    State state;
    


    OrderProcessJPanel(JPanel userProcessContainer, OrderManageOrganization orderManageOrganization, Supplier supplier, State state) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.orderManageOrganization = orderManageOrganization;
        this.state = state;
        this.supplier = supplier;
        
        orderComboBox.removeAllItems();
        
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        confirmBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rejectBtn = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        lbStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboBoxActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Equipment Name", "Quantity", "Sales Price"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        confirmBtn.setText("Confirm Order");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Order:");

        rejectBtn.setText("Reject Order");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        lbStatus.setText("<status>");

        jLabel2.setText("Order Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backJButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbStatus)))))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton2)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatus)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateTable(Order order){
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        
        for (OrderItem oi : order.getOrderItemList()){
            Object[] row = new Object[3];
            row[0] = oi.getEquipment().getName();
            row[1] = oi.getQuatity();
            row[2] = oi.getSalesPrice();
          
            model.addRow(row);
        }
    }
    
    private void orderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderComboBoxActionPerformed
        // TODO add your handling code here:
        for(Order o : orderManageOrganization.getMoc().getOrderCatalog()){
           orderComboBox.addItem(o);
        }
        orderComboBox.setSelectedIndex(0);
        Order order = (Order)orderComboBox.getSelectedItem();
        lbStatus.setText(order.getStatus());
        populateTable(order);
    }//GEN-LAST:event_orderComboBoxActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        Order order = (Order)orderComboBox.getSelectedItem();
        order.setStatus("Confirmed");
        lbStatus.setText(order.getStatus());
        for(Enterprise dis:state.getEnterpriseDirectory().getEnterpriseList()){
            if(dis.getName().equals(order.getName())&& dis instanceof Distributor){
                for(Organization org:((Distributor)dis).getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof EquipmentManageOrganization){
                        for(OrderItem oi:order.getOrderItemList()){
                            if(((EquipmentManageOrganization) org).getEquipmentDirectory().getEquipmentList().contains(oi.getEquipment())){
                                oi.getEquipment().setStock(oi.getEquipment().getStock()-oi.getQuatity());
                            }
                            else{
                                ((EquipmentManageOrganization) org).getEquipmentDirectory().createEquipment(oi.getEquipment().getName(), oi.getQuatity(), oi.getEquipment().getPrice());
                            }
                        }
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        Order order = (Order)orderComboBox.getSelectedItem();
        order.setStatus("Reject");
        lbStatus.setText(order.getStatus());
        for(OrderItem oi: order.getOrderItemList()){
            for(Organization o:supplier.getOrganizationDirectory().getOrganizationList()){
                if(o instanceof EquipmentManageOrganization){
                    if(((EquipmentManageOrganization)o).getEquipmentDirectory().getEquipmentList().contains(oi.getEquipment())){
                        oi.getEquipment().setStock(oi.getQuatity()+oi.getEquipment().getStock());
                    }
                }
            }
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JComboBox orderComboBox;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton rejectBtn;
    // End of variables declaration//GEN-END:variables
}
