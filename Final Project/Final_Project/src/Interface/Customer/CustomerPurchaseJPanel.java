/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Customer.Customer;
import Business.Enterprise.AfterSale;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Provider;
import Business.Equipment.Equipment;
import Business.Equipment.Order;
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
 * @author BoyangWei
 */
public class CustomerPurchaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPurchaseJPanel
     */
    private JPanel container;
    private Customer customer;
    private State state;
    public CustomerPurchaseJPanel(State state,JPanel container,Customer customer) {
        initComponents();
        this.container = container;
        this.customer = customer;
        this.state = state;
        populateCom();
    }
    void populateCom(){
        providerCom.removeAllItems();
        if(state.getEnterpriseDirectory().getEnterpriseList().size()>0){
            for(Enterprise en : state.getEnterpriseDirectory().getEnterpriseList()){
                if(en instanceof Provider)
                    providerCom.addItem(en);
            } 
        }
    }
         
    void populateTable(Provider p){
        DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
        dtm.setRowCount(0);
        for(Organization o: p.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof EquipmentManageOrganization){
                EquipmentManageOrganization eo = (EquipmentManageOrganization)o;
                for(Equipment e :eo.getEquipmentDirectory().getEquipmentList()){
                    Object[] row = new Object[3];
                    row[0] = e;
                    row[1] = e.getPrice();
                    row[2] = e.getStock();
                    
                    dtm.addRow(row);
                }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        providerCom = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Amount = new javax.swing.JSpinner();
        btnOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Select your Provider:");

        providerCom.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        providerCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerComActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Equipment", "Price", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Select to purchase:");

        Amount.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        btnOrder.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(providerCom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(providerCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout)container.getLayout();
        container.remove(this);
        layout.previous(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void providerComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerComActionPerformed
        if(providerCom.getSelectedItem()==null){
             DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
            dtm.setRowCount(0);
        }else{
            Provider p = (Provider)providerCom.getSelectedItem();
            populateTable(p);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_providerComActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        int select = Table.getSelectedRow();
        int amount = (Integer)Amount.getValue();
        if(select<0){
            JOptionPane.showMessageDialog(this, "Please select an offer first!");
        }
        else if(amount==0){
            JOptionPane.showMessageDialog(this, "The amount should not be Zero!");
        }else{
            Equipment e = (Equipment)Table.getValueAt(select, 0);
            e.setLocation(customer.getLocation());
            e.setStatus("normal");
            Provider p = (Provider)providerCom.getSelectedItem();
            Order order = new Order();
            order.setName(customer.getUsername());
            order.addOrderItem(e, amount, e.getPrice());
            order.setStatus("Waiting for confirm"); 
            customer.getOutmoc().addOrder(order);
            e.setStock(e.getStock()-amount);
            for(Organization o: state.getEnterpriseDirectory().getEnterpriseList()){
                if(o instanceof AfterSale)
                    ((AfterSale) o).getEquipmentDirectory().getEquipmentList().add(e);
            }
            for(Organization org:p.getOrganizationDirectory().getOrganizationList()){
                if(org instanceof OrderManageOrganization){
                    OrderManageOrganization omo = (OrderManageOrganization)org;
                    omo.getInmoc().addOrder(order);
                }
            }
            e.startTimer(customer);
            JOptionPane.showMessageDialog(this, "Successfully orderd !");
            populateTable(p);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Amount;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox providerCom;
    // End of variables declaration//GEN-END:variables
}
