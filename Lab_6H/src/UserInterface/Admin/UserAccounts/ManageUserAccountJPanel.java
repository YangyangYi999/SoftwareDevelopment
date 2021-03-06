/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin.UserAccounts;

import Business.Business;
import Business.Person.UserAccount;
import UserInterface.Admin.AdminWorkAreaJPanel;
import UserInterface.LoginScreenJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shinychenw
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private Business business;
    private UserAccount ua;
    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel cardSequenceJPanel,Business business,UserAccount userAccount) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.business = business;
        ua = userAccount;
        populateTable();
        
    }
    
    public void populateTable(){
        int rc = jTableUserAccount.getModel().getRowCount()-1;
        while(rc>=0) {
            ((DefaultTableModel) jTableUserAccount.getModel()).removeRow(rc);
            rc = rc - 1;
        }
        DefaultTableModel dtm = (DefaultTableModel) jTableUserAccount.getModel();
        dtm.setRowCount(0);
        for(UserAccount userAccount: business.getUserAccountDirectory().getUserAccountList()){
                Object[] row = new Object[3];
                row[0]=userAccount;
                row[1]="********";    
                row[2]=userAccount.getRole();   
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

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUserAccount = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnFindUserAccount = new javax.swing.JButton();
        btnNewUserAccount = new javax.swing.JButton();
        btnViewUserAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTableUserAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "username", "password", "role"
            }
        ));
        jScrollPane1.setViewportView(jTableUserAccount);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("User Account");

        btnFindUserAccount.setText("Find User Account >>");
        btnFindUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindUserAccountActionPerformed(evt);
            }
        });

        btnNewUserAccount.setText("Create New User Account >>");
        btnNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserAccountActionPerformed(evt);
            }
        });

        btnViewUserAccount.setText("View User Account >>");
        btnViewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserAccountActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete User Account >>");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addComponent(btnViewUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername)
                                .addComponent(btnFindUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)))
                        .addComponent(btnNewUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnNewUserAccount)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewUserAccount)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnFindUserAccount))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserAccountActionPerformed
        // TODO add your handling code here:
        CreateNewUserAccountJPanel nuaj = new CreateNewUserAccountJPanel(cardSequenceJPanel,business);
        cardSequenceJPanel.add("NewUserAccountJPanel",nuaj);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnNewUserAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserAccountActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableUserAccount.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null,"Please select a user account from the table to update!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            UserAccount userAccount = (UserAccount)jTableUserAccount.getValueAt(selectedRow,0);
            ViewUserAccountJPanel uuaj = new ViewUserAccountJPanel(cardSequenceJPanel,business,userAccount);
            cardSequenceJPanel.add("UpdateUserAccountJPanel",uuaj);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnViewUserAccountActionPerformed

    private void btnFindUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindUserAccountActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        UserAccount userAccount = business.getUserAccountDirectory().findUserAccount(username);
        if(userAccount == null){
            JOptionPane.showMessageDialog(null,"The username you want to find is not exist!","Warning",JOptionPane.WARNING_MESSAGE);            
        }
        else{
          
            
            ViewUserAccountJPanel uuaj = new ViewUserAccountJPanel(cardSequenceJPanel,business,userAccount);
            cardSequenceJPanel.add("UpdateUserAccountJPanel",uuaj);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnFindUserAccountActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableUserAccount.getSelectedRow();
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the person?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_NO_OPTION){
                UserAccount userAccount = (UserAccount)jTableUserAccount.getValueAt(selectedRow,0);
                
                //判断该账户是否是唯一的系统管理员
                if(userAccount.getRole().equals("System Admin")){
                    int flag = 0;
                    for(UserAccount ua: business.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getRole().equals("System Admin"))
                            flag++;
                    }
                    if(flag == 1){
                        JOptionPane.showMessageDialog(null,"There should be at least one System Admin!");
                        return;
                    }
                }
                
                //删除该账户并刷新当前页面表格
                business.getUserAccountDirectory().removeUserAccount(userAccount);
                populateTable();
                
                //如果删除当前账户，退回登陆界面
                if(ua==userAccount){
                    cardSequenceJPanel.remove(this);
                    Component[] componentArray = cardSequenceJPanel.getComponents();
                    Component component = componentArray[componentArray.length - 1];
                    AdminWorkAreaJPanel AdminWorkAreaJPanel = (AdminWorkAreaJPanel) component;
                    component = componentArray[0];
                    LoginScreenJPanel loginScreenJPanel = (LoginScreenJPanel) component;
                    loginScreenJPanel.populate();
                    cardSequenceJPanel.remove(AdminWorkAreaJPanel);
                    CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
                    layout.previous(cardSequenceJPanel);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row from the table first!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindUserAccount;
    private javax.swing.JButton btnNewUserAccount;
    private javax.swing.JButton btnViewUserAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUserAccount;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
