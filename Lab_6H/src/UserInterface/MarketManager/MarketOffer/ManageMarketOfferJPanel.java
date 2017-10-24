/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MarketManager.MarketOffer;

import Business.Business;
import Business.Market.Market;
import Business.Market.MarketOffer;
import Business.Supplier.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BoyangWei
 */
public class ManageMarketOfferJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMarketOfferJPanel
     */
    private JPanel cardSequenceJPanel;
    private Business business;
    public ManageMarketOfferJPanel(JPanel cardSequenceJPanel,Business business) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.business = business;
        populateTable();
    }
    void populateTable(){
    DefaultTableModel dtm = (DefaultTableModel) marketOfferTable.getModel();
        dtm.setRowCount(0);
        for(MarketOffer mf: business.getMarketOfferCatalog().getMarketOfferCatalog()){
                Object[] row = new Object[3];
                row[0]= mf.getMarket().getName(); 
                row[1] = mf.getProduct().getProductName();
                row[2] = mf.getPriceSet();
                dtm.addRow(row);
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
        marketOfferTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        marketOfferTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Market", "Product", "PriceSet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(marketOfferTable);
        if (marketOfferTable.getColumnModel().getColumnCount() > 0) {
            marketOfferTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            marketOfferTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            marketOfferTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jButton1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton4.setText("<< Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton2)
                        .addGap(136, 136, 136)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    cardSequenceJPanel.remove(this);
    CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
    layout.previous(cardSequenceJPanel); 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int select = marketOfferTable.getSelectedRow();
        if(select<0){
        JOptionPane.showMessageDialog(this, "Please select any marketoffer from the table!");
        }else{
        business.getMarketOfferCatalog().getMarketOfferCatalog().remove(select);
        populateTable();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AddMarketOfferJPanel amojp = new AddMarketOfferJPanel(cardSequenceJPanel, business);
    cardSequenceJPanel.add("AddMarketOfferJPanel",amojp);
    CardLayout layout  = (CardLayout)cardSequenceJPanel.getLayout();
    layout.next(cardSequenceJPanel);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int row = marketOfferTable.getSelectedRow();
    if(row<0){
    
    JOptionPane.showMessageDialog(this,"Please slect any marketoffer from the table!");
    }else{
//         Product p = business.getMarketOfferCatalog().getMarketOfferCatalog().get(row).getProduct();
//         Market m = business.getMarketOfferCatalog().getMarketOfferCatalog().get(row).getMarket();
    MarketOffer mf= business.getMarketOfferCatalog().getMarketOfferCatalog().get(row);
    UpdateMarketOfferJPanel umojp = new UpdateMarketOfferJPanel(cardSequenceJPanel, business,row,mf);
    cardSequenceJPanel.add("UpdateMarketOfferJPanel",umojp);
    CardLayout layout  = (CardLayout)cardSequenceJPanel.getLayout();
    layout.next(cardSequenceJPanel);
    }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable marketOfferTable;
    // End of variables declaration//GEN-END:variables
}
