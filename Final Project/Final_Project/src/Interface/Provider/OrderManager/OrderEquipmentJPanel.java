/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Provider.OrderManager;

import Business.Enterprise.Distributor;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Provider;
import Business.Enterprise.Supplier;
import Business.Equipment.Equipment;
import Business.Equipment.Order;
import Business.Equipment.OrderItem;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.OrderManageOrganization;
import Business.Organization.Organization;
import Business.State.State;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuchenwang
 */
public class OrderEquipmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderEquipmentJPanel
     */
   JPanel userProcessContainer;
   State state;
   Provider provider;
   OrderManageOrganization orderManageOrganization;
   private boolean isCheckOut=false;
   private Order order;
    

    OrderEquipmentJPanel(JPanel userProcessContainer, State state, Provider provider, OrderManageOrganization orderManageOrganization) {
        initComponents();    
        this.provider = provider;
        this.state = state;
        this.userProcessContainer= userProcessContainer; 
        this.orderManageOrganization = orderManageOrganization;
        populateDistributorCombo();
         if(!isCheckOut){
          order = new Order();
          order.setName(provider.getName());
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

        jLabel1 = new javax.swing.JLabel();
        jComDistributor = new javax.swing.JComboBox();
        txtSearchKeyWord = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnViewProduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnViewOrderItem = new javax.swing.JButton();
        txtNewQuantity = new javax.swing.JTextField();
        btnModifyQuantity = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Distributor");

        jComDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComDistributorActionPerformed(evt);
            }
        });

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Distributor Product Catalog");

        btnViewProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewProduct.setText("View Product Detail");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAddToCart.setText("ADD TO CART");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        jLabel7.setText(" Item in cart");

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnModifyQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCheckOut)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoveOrderItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewOrderItem)
                            .addGap(18, 18, 18)
                            .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearchProduct))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnViewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAddToCart))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchProduct))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewProduct)
                    .addComponent(jLabel5)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut)
                    .addComponent(btnModifyQuantity)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrderItem))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     public void populateDistributorCombo(){
       jComDistributor.removeAllItems();
       for(Enterprise d : state.getEnterpriseDirectory().getEnterpriseList()){
           if(d instanceof Distributor){
            Distributor dd = (Distributor)d;
            jComDistributor.addItem(dd);
           }
       }
       populateTable();
   }
   public void populateTable(){
        int rowCount =productTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        Distributor distributor =(Distributor)jComDistributor.getSelectedItem();
        for(Organization eq: distributor.getOrganizationDirectory().getOrganizationList()){
            if(eq instanceof EquipmentManageOrganization){
                EquipmentManageOrganization ep = (EquipmentManageOrganization)eq;
                for(Equipment p : ep.getEquipmentDirectory().getEquipmentList()) {
                    Object row[] = new Object[4];
                    row[0] = p;
                    row[1] = p.getPrice();
                    row[2] = p.getStock();
                    model.addRow(row);
                }
            }
        }
   }
   public void refreshProductTable(String keyword){
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        for(Enterprise d :state.getEnterpriseDirectory().getEnterpriseList()){
            if(d instanceof Distributor){
                for(Organization eq: d.getOrganizationDirectory().getOrganizationList()){
                    if(eq instanceof EquipmentManageOrganization){
                        EquipmentManageOrganization ep = (EquipmentManageOrganization)eq;
                        for(Equipment p : ep.getEquipmentDirectory().getEquipmentList()) {
                            if(p.getName().equalsIgnoreCase(keyword)){
                                Object row[]= new Object[4];
                                row[0] = p;
                                row[1] = p.getPrice();
                                row[2] = p.getStock();
                       
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
   }
      public void refreshOrderTable(){
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.setRowCount(0);
        
            for(OrderItem oi:order.getOrderItemList()){
                    Object row[]= new Object[4];
                     row[0] = oi;
                     row[1] = oi.getSalesPrice();
                     row[2] = oi.getQuatity();
                     row[3] = oi.getQuatity()*oi.getSalesPrice();
                     model.addRow(row);
                }
       }
      
    private void jComDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComDistributorActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jComDistributorActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        String productName=txtSearchKeyWord.getText();
        refreshProductTable(productName);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        // TODO add your handling code here:
        int row =productTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Equipment p = (Equipment)productTable.getValueAt(row,0);
        ViewProductDetailJPanel vs = new ViewProductDetailJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanel", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewProductActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int slectedRow=productTable.getSelectedRow();
        if(slectedRow<0){
            JOptionPane.showMessageDialog(null, "Please Select a row");
            return;
        }
        Equipment selectedProduct=(Equipment)productTable.getValueAt(slectedRow, 0);
        int fetchQty=(Integer)quantitySpinner.getValue();

        if(fetchQty<=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than 0");
            return;
        }
        try{
            if(fetchQty<=selectedProduct.getStock()){
                boolean alreadyPresent=false;
                for(OrderItem oi :order.getOrderItemList()){  
                       if(oi.getEquipment()== selectedProduct){
                            int oldAvail = selectedProduct.getStock();
                            int newAvail = oldAvail-fetchQty;
                            selectedProduct.setStock(newAvail);
                            oi.setQuatity(fetchQty+oi.getQuatity());
                            alreadyPresent=true;
                            populateTable();
                            refreshOrderTable();
                            break;
                        }
                }
                if(!alreadyPresent){
                    int oldAvail = selectedProduct.getStock();
                    int newAvail = oldAvail-fetchQty;
                    selectedProduct.setStock(newAvail);
                    order.addOrderItem(selectedProduct, fetchQty,selectedProduct.getPrice() );
                    populateTable();
                    refreshOrderTable();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Quantity>Availibility","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unable to add to cart");
            return;
        }

    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int slectedRow=orderTable.getSelectedRow();
        if(slectedRow<0){
            JOptionPane.showMessageDialog(null, "Please Select a row");
            return;
        }
        
        else{
            OrderItem oi = (OrderItem)orderTable.getValueAt(slectedRow,0);
            int currentAvail =oi.getEquipment().getStock();
            int oldQty=oi.getQuatity();
            if(txtNewQuantity.getText() == "")
                {
                    JOptionPane.showMessageDialog(null, "Quantity should be integer");
                    return;
                }
            int newQty=Integer.parseInt(txtNewQuantity.getText());
            if(newQty>(currentAvail+oldQty)){
                JOptionPane.showMessageDialog(null, "Quantity is more than availibility");
                return;
            }
            else{
                if(newQty<=0){
                    JOptionPane.showMessageDialog(null, "Quantity should more than 0");

                }
                oi.setQuatity(newQty);
                oi.getEquipment().setStock(currentAvail+(oldQty-newQty));
                populateTable();
                refreshOrderTable();
            }

        }

    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if(order.getOrderItemList().size()>0){
            OrderManageOrganization org = null;
            Distributor distributor =(Distributor)jComDistributor.getSelectedItem();
            for(Organization organization: distributor.getOrganizationDirectory().getOrganizationList()){
                if(organization instanceof OrderManageOrganization && org == null){
                    org = (OrderManageOrganization)organization;
                    break;
                }
            }
 
            if (org!=null){
                order.setStatus("Waiting for confirm");
                org.getInmoc().addOrder(order);
                for(Organization o:distributor.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof OrderManageOrganization){
                        ((OrderManageOrganization) o).getOutmoc().addOrder(order);
                    }
                }
            }
            
            
            JOptionPane.showMessageDialog(null, "Order placed successful!");
            order = new Order();
            refreshOrderTable();
            populateTable();
            
            isCheckOut  = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "No order placed!");
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int slectedRow=orderTable.getSelectedRow();
        if(slectedRow<0){
            JOptionPane.showMessageDialog(null, "Please Select a row");
            return;
        }
        OrderItem oi = (OrderItem)orderTable.getValueAt(slectedRow,0);
        int oldAvail =oi.getEquipment().getStock();
        int oldQty=oi.getQuatity();
        int newQty=oldAvail+oldQty;
        oi.getEquipment().setStock(newQty);
        order.removeOrderItem(oi);
        JOptionPane.showMessageDialog(null, "Item has removed form cart!");
        refreshOrderTable();
        populateTable();

    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
        int row =orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem p = (OrderItem)orderTable.getValueAt(row,0);
        ViewProductDetailJPanel vs = new ViewProductDetailJPanel(userProcessContainer, p.getEquipment());        
        userProcessContainer.add("ViewProductDetailJPanel", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JComboBox jComDistributor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSearchKeyWord;
    // End of variables declaration//GEN-END:variables
}
