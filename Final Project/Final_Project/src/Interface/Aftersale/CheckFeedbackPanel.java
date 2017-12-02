/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Aftersale;

import Business.EcoSystem;
import Interface.Customer.ContactAftersalePanel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BoyangWei
 */
public class CheckFeedbackPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckFeedbackPanel
     */
    private EcoSystem system;
    private JPanel container;
    public CheckFeedbackPanel(EcoSystem system,JPanel container) {
        initComponents();
        this.system=system;
        this.container=container;
        PopulateTable();
    }
    void PopulateTable(){
//        DefaultTableModel dtm = (DefaultTableModel)messageTable.getModel();
//        dtm.setRowCount(0);
//        for(String str: ContactAftersalePanel.messageList){
//            Object[] row = new Object[2];
//            row[0]="Mr.Jones";
//            row[1] = str;
//            dtm.addRow(row);
//        }
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
        messageTable = new javax.swing.JTable();

        messageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Customer", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(messageTable);
        if (messageTable.getColumnModel().getColumnCount() > 0) {
            messageTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable messageTable;
    // End of variables declaration//GEN-END:variables
}
