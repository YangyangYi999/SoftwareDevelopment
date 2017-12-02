/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Distributor.OrderManager;

import Business.Enterprise.Distributor;
import Business.Equipment.Order;
import Business.Equipment.OrderItem;
import Business.Organization.OrderManageOrganization;
import Business.State.State;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yiyangyang
 */
public class ViewOrderStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderStatusJPanel
     */
    JPanel userProcessContainer;
    State state;
    Distributor distributor;
    OrderManageOrganization orderManageOrganization;
    
    ViewOrderStatusJPanel(JPanel userProcessContainer, State state, Distributor distributor, OrderManageOrganization orderManageOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.distributor = distributor;
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

        orderComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Order:");

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

        jLabel2.setText("Status:");

        lbStatus.setText("<status>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(lbStatus)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbStatus))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JComboBox orderComboBox;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
