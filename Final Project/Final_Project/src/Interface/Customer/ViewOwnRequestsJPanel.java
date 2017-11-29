/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Customer.Customer;
import Business.Organization.WorkQueue.WorkRequest;
import HelperClasses.DatetoString;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BoyangWei
 */
public class ViewOwnRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOwnRequestsJPanel
     */
    private JPanel container;
    private Customer customer;
    public ViewOwnRequestsJPanel(JPanel container,Customer customer) {
        initComponents();
        this.container=container;
        this.customer = customer;
        populateTable();
        populateCom();
    }

    void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)requestTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest req : customer.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = DatetoString.DatetoString(req.getRequestDate());
            row[1] = req;
            row[2] = req.getStatus();
            row[3] = req.getFeedBack();
            dtm.addRow(row);
        }
    }
    
    void populateFinished(){
         DefaultTableModel dtm = (DefaultTableModel)requestTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest req : customer.getWorkQueue().getWorkRequestList()){
            if(req.getStatus().equals("Finished")){
            Object[] row = new Object[4];
            row[0] = DatetoString.DatetoString(req.getRequestDate());
            row[1] = req;
            row[2] = req.getStatus();
            row[3] = req.getFeedBack();
            dtm.addRow(row);
            }
        }
    }
    
    void populateUnfinished(){
         DefaultTableModel dtm = (DefaultTableModel)requestTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest req : customer.getWorkQueue().getWorkRequestList()){
            if(req.getStatus().equals("Unhandled")){
            Object[] row = new Object[4];
            row[0] = DatetoString.DatetoString(req.getRequestDate());
            row[1] = req;
            row[2] = req.getStatus();
            row[3] = req.getFeedBack();
            dtm.addRow(row);
            }
        }
    }
    
    void populateCom(){
        fliterCom.removeAllItems();;
        fliterCom.addItem("Show Finished Only");
        fliterCom.addItem("Show Unfinished Only");
        fliterCom.setSelectedItem(null);
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
        requestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fliterCom = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Message", "Status", "Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Select the fliter:");

        fliterCom.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        fliterCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fliterComActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("Urge a selected request:");

        jButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButton1.setText("Urge");
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
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)
                                .addComponent(fliterCom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fliterCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout layout = (CardLayout) container.getLayout();
        container.remove(this);
        layout.previous(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int select = requestTable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(this, "Please select any row first");
        }else{
            WorkRequest req = (WorkRequest)requestTable.getValueAt(select,1);
            req.setStatus("Urgent");
            populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fliterComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fliterComActionPerformed
        if(fliterCom.getSelectedItem()==null){
            populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fliterComActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fliterCom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}