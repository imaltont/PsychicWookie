/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no.ntnu.fp.gui;

import no.ntnu.fp.storage.DatabaseHandler;

import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author Ingrid
 */
public class LoginUI extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form LoginUItest
     */
    private DatabaseHandler data= new DatabaseHandler();

    public LoginUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        loginWarning = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        UsernameTextField = new javax.swing.JTextField();
        loginTestButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logg inn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        loginPanel.setName("loginPanel"); // NOI18N

        UsernameLabel.setText("Brukernavn:");
        UsernameLabel.setName("UsernameLabel"); // NOI18N

        PasswordLabel.setText("Passord:");
        PasswordLabel.setName("PasswordLabel"); // NOI18N

        LoginButton.setText("Logg inn");
        LoginButton.setName("LoginButton"); // NOI18N
        LoginButton.addActionListener(this);

        RegisterButton.setText("Registrer");
        RegisterButton.setName("RegisterButton"); // NOI18N
        RegisterButton.addActionListener(this);

        loginWarning.setForeground(new java.awt.Color(255, 51, 0));
        loginWarning.setText("Brukernavn eller passord er feil");
        loginWarning.setName("loginWarning"); // NOI18N

        passwordTextField.setText("jPasswordField1");
        passwordTextField.setName("passwordTextField"); // NOI18N

        UsernameTextField.setName("UsernameTextField"); // NOI18N
        UsernameTextField.addActionListener(this);

        loginTestButton.setText("logintest");
        loginTestButton.setName("loginTestButton"); // NOI18N
        loginTestButton.addActionListener(this);

        loginWarning.setVisible(false);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(LoginButton)
                                .addGap(18, 18, 18)
                                .addComponent(RegisterButton))
                            .addComponent(UsernameTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginWarning)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginTestButton)
                        .addContainerGap())))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(loginTestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel))
                .addGap(20, 20, 20)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton)
                    .addComponent(LoginButton))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == LoginButton) {
            LoginUI.this.LoginButtonActionPerformed(evt);
        }
        else if (evt.getSource() == UsernameTextField) {
            LoginUI.this.UsernameTextFieldActionPerformed(evt);
        }
        else if (evt.getSource() == loginTestButton) {
            LoginUI.this.loginTestButtonActionPerformed(evt);
        }
        else if (evt.getSource() == RegisterButton) {
            LoginUI.this.RegisterButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_LoginButtonActionPerformed
        String user= UsernameTextField.getText();
        String pwd= new String (passwordTextField.getPassword());
        if (data.authenticate(user, pwd)!= (-1)){
            new HomeUI(data.authenticate(user, pwd), data).setVisible(true);
        }
        else{
            UsernameTextField.setText("Feil brukernavn og/eller passord");
            loginWarning.setVisible(true);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void loginTestButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_loginTestButtonActionPerformed
        new HomeUI(1, data).setVisible(true);
        dispose();
    }//GEN-LAST:event_loginTestButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        new registerUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton loginTestButton;
    private javax.swing.JLabel loginWarning;
    private javax.swing.JPasswordField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
