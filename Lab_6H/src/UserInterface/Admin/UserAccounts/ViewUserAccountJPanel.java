/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin.UserAccounts;

import Business.Business;
import Business.Person.Person;
import Business.Person.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Configuration.MD5Util;


/**
 *
 * @author shinychenw
 */
public class ViewUserAccountJPanel extends javax.swing.JPanel {

    private JPanel cardSequenceJPanel;
    private Business business;
    private UserAccount userAccount;
    /**
     * Creates new form UpdateUserAccountJPanel
     */
    public ViewUserAccountJPanel(JPanel cardSequenceJPanel,Business business,UserAccount userAccount) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.business = business;
        this.userAccount = userAccount;
        jcbPerson.removeAll();
        jcbRole.removeAll();
        jcbRole.addItem("System Admin");
        jcbRole.addItem("Supplier");
        jcbRole.addItem("Market Manager");
        jcbRole.addItem("Sales Person");
        for(Person p: business.getPersonDirectory().getPersonList()){
            jcbPerson.addItem(p);
        }
        populate();
    }

    public void populate(){
       
        txtUsername.setText(userAccount.getUsername());
        txtPassword.setText("********");
        jcbPerson.setSelectedItem(userAccount.getPerson());
        jcbRole.setSelectedItem(userAccount.getRole());
        
        if(userAccount.isAccountStatus() == true)
            jrbtnActive.setSelected(true);
        else{
            jrbtnDisabled.setSelected(true);
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

        btnGAccountStatus = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jcbPerson = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbRole = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jrbtnActive = new javax.swing.JRadioButton();
        jrbtnDisabled = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        txtUsername.setEnabled(false);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jcbPerson.setEnabled(false);

        jLabel3.setText("Select a person:");

        jLabel4.setText("Select a role:");

        jcbRole.setEnabled(false);

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Account Status");

        btnGAccountStatus.add(jrbtnActive);
        jrbtnActive.setText("Active");
        jrbtnActive.setEnabled(false);

        btnGAccountStatus.add(jrbtnDisabled);
        jrbtnDisabled.setText("Disabled");
        jrbtnDisabled.setEnabled(false);

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtPassword.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbPerson, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbtnActive)
                    .addComponent(jrbtnDisabled))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnUpdate)
                .addGap(59, 59, 59)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jrbtnActive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbtnDisabled)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int flag = 0;
        
        //判断当前账户是否是唯一的管理员账户
        if(userAccount.getRole().equals("System Admin")){
            for(UserAccount ua: business.getUserAccountDirectory().getUserAccountList()){
                if(ua.getRole().equals("System Admin"))
                    flag++;
            }
        }
        
        //如果该账户是唯一的管理员账户，该账户不能被停用或取消管理员资格
        if(flag == 1 && String.valueOf(jcbRole.getSelectedItem())!="System Admin"){
            JOptionPane.showMessageDialog(null,"There should be at least one System Admin!");
            return;
        }
        if(flag == 1 && jrbtnDisabled.isSelected() == true){
            JOptionPane.showMessageDialog(null,"The only System Admin cannot be disabled!");
            return;
        }
        
        //更新账户
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"The username cannot be empty!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        for(UserAccount ua: business.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(username)==true&&userAccount.getUsername().equals(username)==false){
                JOptionPane.showMessageDialog(null,"The username has been created before!","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        userAccount.setUsername(username);
        if(userAccount.getPassWord().equals(password)==false)
            userAccount.setPassWord(MD5Util.md5(password));
        userAccount.setPerson((Person)jcbPerson.getSelectedItem());
        userAccount.setRole(String.valueOf(jcbRole.getSelectedItem()));
        userAccount.setAccountStatus(jrbtnActive.isSelected());
        
        JOptionPane.showMessageDialog(null,"The user account successfully updated!");
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        jcbPerson.setEnabled(false);
        jcbRole.setEnabled(false);
        jrbtnActive.setEnabled(false);
        jrbtnDisabled.setEnabled(false);
        txtPassword.setEnabled(false);
        txtUsername.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        Component[] componentArray = cardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageUserAccountJPanel manageUserAccountJPanel = (ManageUserAccountJPanel) component;
        manageUserAccountJPanel.populateTable();
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        txtPassword.setEnabled(true);
        txtPassword.setText(userAccount.getPassWord());
        txtUsername.setEnabled(true);
        jcbPerson.setEnabled(true);
        jcbRole.setEnabled(true);
        jrbtnActive.setEnabled(true);
        jrbtnDisabled.setEnabled(true);
       
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup btnGAccountStatus;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox jcbPerson;
    private javax.swing.JComboBox<String> jcbRole;
    private javax.swing.JRadioButton jrbtnActive;
    private javax.swing.JRadioButton jrbtnDisabled;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
