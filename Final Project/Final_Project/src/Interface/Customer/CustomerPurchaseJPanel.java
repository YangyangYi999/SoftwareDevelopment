/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Customer.Customer;
import Business.CustomerOrder.CustomerOrder;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Provider;
import Business.Equipment.Equipment;
import Business.Organization.WorkQueue.WorkRequest;
import Business.State.State;
import HelperClasses.DatetoString;
import java.awt.CardLayout;
import java.util.Date;
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
        if(p.getEqupmentDirectory().getEquipmentList().size()>0){
            for(Equipment equ: p.getEqupmentDirectory().getEquipmentList()){
                Object[] row = new Object[3];
                row[0] = equ;
                row[1] = equ.getPrice();
                row[2] = equ.getStock();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("Select to purchase:");

        Amount.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39)
                                        .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37)
                                        .addComponent(providerCom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(providerCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout layout = (CardLayout)container.getLayout();
        container.remove(this);
        layout.previous(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int select = Table.getSelectedRow();
        int amount = (Integer)Amount.getValue();
        if(select<0){
            JOptionPane.showMessageDialog(this, "Please select an offer first!");
        }
        else if(amount==0){
            JOptionPane.showMessageDialog(this, "The amount should not be Zero!");
        }else{
            Equipment e = (Equipment)Table.getValueAt(select, 0);
            Provider p = (Provider)providerCom.getSelectedItem();
//            CustomerOrder co =new CustomerOrder(e,p);
//            customer.getCustomerOrderDirectory().getCustomerOrderList().add(co);
            WorkRequest wr = new WorkRequest();
            wr.setCustomer(customer);
            wr.setMessage(customer.toString()+" ordered "+e.toString());
            wr.setRequestDate(new Date());
            p.getInboundworkQueue().getWorkRequestList().add(wr);
            customer.getWorkQueue().getWorkRequestList().add(wr);
             CustomerOrder co = new CustomerOrder(e,customer);
            p.getCustomerOrderDirectory().getCustomerOrderList().add(co);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Amount;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox providerCom;
    // End of variables declaration//GEN-END:variables
}
