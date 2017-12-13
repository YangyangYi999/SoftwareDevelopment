/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Distributor;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Insurance;
import Business.Enterprise.Police;
import Business.Enterprise.Provider;
import Business.Enterprise.Secure;
import Business.Enterprise.Supplier;
import Business.Organization.AlertHandleOrganization;
import Business.Organization.AlertManageOrganization;
import Business.Organization.Employee.Employee;
import Business.Organization.EquipmentManageOrganization;
import Business.Organization.OrderManageOrganization;
import Business.Organization.Organization;
import Business.Organization.UserAccount.Role.DistributorEquipmentManagerRole;
import Business.Organization.UserAccount.Role.InsuranceEmployeeRole;
import Business.Organization.UserAccount.Role.InsuranceEventManagerRole;
import Business.Organization.UserAccount.Role.OrderManagerRole;
import Business.Organization.UserAccount.Role.PoliceOfficerRole;
import Business.Organization.UserAccount.Role.PolicemanRole;
import Business.Organization.UserAccount.Role.ProviderEquipmentManagerRole;
import Business.Organization.UserAccount.Role.ProviderOrderManagerRole;
import Business.Organization.UserAccount.Role.Role;
import Business.Organization.UserAccount.Role.SecureGuardRole;
import Business.Organization.UserAccount.Role.SecureOfficerRole;
import Business.Organization.UserAccount.Role.SupplierEquipmentManagerRole;
import Business.Organization.UserAccount.Role.SupplierOrderConfirmRole;
import Business.Organization.UserAccount.UserAccount;
import Business.Organization.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BoyangWei
 */
public class ManageEnterpriseAccounts extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAccounts
     */
    private Enterprise enterprise;
    private JPanel container;
    private EcoSystem system;
    public ManageEnterpriseAccounts(Enterprise enterprise,JPanel container, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.system = system;
        populateTable();
        populateorgCom();
    }
    void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)accountTable.getModel();
        dtm.setRowCount(0);
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount acc: org.getUserAccountDirectory().getUserAccountList()){
                Object[] row = new Object[4];
                row[0] = acc;
                row[1] = acc.getEmployee();
                row[2] = org;
                row[3] = acc.getRole();
                dtm.addRow(row);
            }
        }
    }
    
    void populateorgCom(){
        orgCom.removeAllItems();
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            orgCom.addItem(org);
        }
        if(enterprise.getOrganizationDirectory().getOrganizationList().size()>0){
            orgCom.setSelectedIndex(0);
        populateRoleCom((Organization)orgCom.getSelectedItem());
        populateEmpCom((Organization)orgCom.getSelectedItem());
        }
    }
    
    void populateRoleCom(Organization org){
        roleCom.removeAllItems();
        if(org instanceof EquipmentManageOrganization && enterprise instanceof Distributor){
                roleCom.addItem(new DistributorEquipmentManagerRole());
            }
        else if(org instanceof EquipmentManageOrganization && enterprise instanceof Supplier){
                roleCom.addItem(new SupplierEquipmentManagerRole());
            }
        else if(org instanceof OrderManageOrganization && enterprise instanceof Supplier){
                roleCom.addItem(new SupplierOrderConfirmRole());
        }
        else if(org instanceof OrderManageOrganization && enterprise instanceof Distributor){
                roleCom.addItem(new OrderManagerRole());
        }
        else if(org instanceof EquipmentManageOrganization && enterprise instanceof Provider){
            roleCom.addItem(new ProviderEquipmentManagerRole());
        }
        else if(org instanceof OrderManageOrganization && enterprise instanceof Provider){
            roleCom.addItem(new ProviderOrderManagerRole());
        }
        else if(org instanceof AlertManageOrganization && enterprise instanceof Insurance){
            roleCom.addItem(new InsuranceEventManagerRole());
        }
        else if(org instanceof AlertHandleOrganization && enterprise instanceof Insurance){
            roleCom.addItem(new InsuranceEmployeeRole());
        }
        else if(org instanceof AlertManageOrganization && enterprise instanceof Police){
            roleCom.addItem(new PoliceOfficerRole());
        }
        else if(org instanceof AlertHandleOrganization && enterprise instanceof Police){
            roleCom.addItem(new PolicemanRole());
        }
        else if(org instanceof AlertManageOrganization && enterprise instanceof Secure){
            roleCom.addItem(new SecureOfficerRole());
        }
        else if(org instanceof AlertHandleOrganization && enterprise instanceof Secure){
            roleCom.addItem(new SecureGuardRole());
        }
        else{
            for(Role role: org.getSupportedRole()){
                roleCom.addItem(role);
            }
        }
        roleCom.setSelectedIndex(0);
    }
    
    void populateEmpCom(Organization org){
        empCom.removeAllItems();
        if(org.getEmployeeDirectory().getEmployeeList().size()>0){
        for(Employee emp :org.getEmployeeDirectory().getEmployeeList()){
            empCom.addItem(emp);
        }
        empCom.setSelectedIndex(0);
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
        accountTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orgCom = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        roleCom = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        empCom = new javax.swing.JComboBox();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usernameTxt = new javax.swing.JTextField();

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Employee", "Organization", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accountTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Organization:");

        orgCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Role:");

        roleCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Password:");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton3.setText("<< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Employee:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage User Accounts");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create User Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(roleCom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(orgCom, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(usernameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(empCom, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jButton1)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roleCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(orgCom.getSelectedItem()==null || roleCom.getSelectedItem()==null || usernameTxt.getText().isEmpty()||passwordTxt.getText().isEmpty()||empCom.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Invalid");
        }else{
         if(!UserAccountDirectory.isValid(usernameTxt.getText(), system)){
             JOptionPane.showMessageDialog(this, "This username has been taken");
             usernameTxt.setText("");
         }else{
             Employee emp = (Employee)empCom.getSelectedItem();
             Organization org = (Organization)orgCom.getSelectedItem();
             Role role = (Role) roleCom.getSelectedItem();
             org.getUserAccountDirectory().createUserAccount(usernameTxt.getText(), passwordTxt.getText(), emp, role);
             populateTable();
         }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int select = accountTable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(this, "Please select any row first");
        }else{
            Organization org = (Organization)accountTable.getValueAt(select, 2);
            UserAccount acc = (UserAccount)accountTable.getValueAt(select, 0);
            org.getUserAccountDirectory().getUserAccountList().remove(acc);
            populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout layout =(CardLayout)container.getLayout();
        container.remove(this);
        layout.previous(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void orgComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComActionPerformed
        if(orgCom.getSelectedItem() == null){
            roleCom.removeAllItems();
            empCom.removeAllItems();
        }else{
            Organization org = (Organization)orgCom.getSelectedItem();
            populateRoleCom(org);
            populateEmpCom(org);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_orgComActionPerformed

    private void roleComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JComboBox empCom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox orgCom;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JComboBox roleCom;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
