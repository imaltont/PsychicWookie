/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no.ntnu.fp.gui;

import no.ntnu.fp.storage.DatabaseHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author Ingrid
 */
public class AddEmployeeDialogUI extends javax.swing.JDialog implements ActionListener {


    private DefaultListModel employeeListModel = new DefaultListModel();
    private DefaultListModel invitedListModel = new DefaultListModel();
    private DefaultListModel personListModel;
    private static DatabaseHandler data;
    private static MakeAppointmentUI dialogUI;

    /**
     * Creates new form AddEmployeeDialogUI
     */
    public AddEmployeeDialogUI(java.awt.Frame parent, boolean modal, DatabaseHandler data, MakeAppointmentUI dialog, DefaultListModel personListModel) throws SQLException {
        super(parent, modal);
        this.data = data;
        this.dialogUI = dialog;
        this.personListModel = personListModel;
        initComponents();
    }
public AddEmployeeDialogUI(java.awt.Frame parent, boolean modal, DatabaseHandler data, MakeAppointmentUI dialog) throws SQLException {
        super(parent, modal);
        this.data = data;
        this.dialogUI = dialog;
        this.personListModel = personListModel;
        initComponents();
    }

    public AddEmployeeDialogUI(java.awt.Frame parent, boolean modal, DatabaseHandler data) throws SQLException {
        super(parent, modal);
        this.data = data;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws SQLException {

        employeeListModel = new DefaultListModel();
        invitedListModel = new DefaultListModel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList(employeeListModel);
        jScrollPane2 = new javax.swing.JScrollPane();
        invitedList = new javax.swing.JList(invitedListModel);
        inviteButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        employeeLabel = new javax.swing.JLabel();
        invitedLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        for (int i = 1; i < data.getNumberOfEmployees(); i++)
        {
            if (personListModel.contains(data.getEmployee(i).getUsername()))
            {
                invitedListModel.addElement(data.getEmployee(i).getUsername());
            }
            else
            {
                employeeListModel.addElement(data.getEmployee(i).getUsername());
            }
        }

        employeeList.setName("employeeList"); // NOI18N
        jScrollPane1.setViewportView(employeeList);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        invitedList.setName("invitedList"); // NOI18N
        jScrollPane2.setViewportView(invitedList);

        inviteButton.setText(">Inviter>");
        inviteButton.setName("inviteButton"); // NOI18N
        inviteButton.addActionListener(this);

        removeButton.setText("<Fjern<");
        removeButton.setName("removeButton"); // NOI18N
        removeButton.addActionListener(this);

        employeeLabel.setText("Ansatte:");
        employeeLabel.setName("employeeLabel"); // NOI18N

        invitedLabel.setText("Inviterte:");
        invitedLabel.setName("invitedLabel"); // NOI18N

        saveButton.setText("Lagre");
        saveButton.setName("saveButton"); // NOI18N
        saveButton.addActionListener(this);

        cancelButton.setText("Avbryt");
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inviteButton)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(employeeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invitedLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(inviteButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invitedLabel)
                            .addComponent(employeeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inviteButtonActionListener() {

    }

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
            java.util.logging.Logger.getLogger(AddEmployeeDialogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDialogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDialogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDialogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEmployeeDialogUI dialog = null;
                try {
                    dialog = new AddEmployeeDialogUI(new JFrame(), true, data, dialogUI);
                } catch (SQLException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JList employeeList;
    private javax.swing.JButton inviteButton;
    private javax.swing.JLabel invitedLabel;
    private javax.swing.JList invitedList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
        if (e.getSource() == inviteButton)
        {
            AddEmployeeDialogUI.this.inviteButtonActionPerformed(e);
        }
        else if (e.getSource() == removeButton)
        {
            AddEmployeeDialogUI.this.removeButtonActionPerformed(e);
        }
        else if (e.getSource() == cancelButton)
        {
            dispose();
        }
        else if (e.getSource() == saveButton)
        {
            try {
                AddEmployeeDialogUI.this.saveButtonActionPerformed(e);
            } catch (SQLException e1) {
                e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

    private void saveButtonActionPerformed(ActionEvent e) throws SQLException {

        DefaultListModel addParticipants = new DefaultListModel();
        for (int i = 1; i < data.getNumberOfEmployees(); i++)
        {
            if (invitedListModel.contains(data.getEmployee(i).getUsername()) && !personListModel.contains(data.getEmployee(i).getUsername()))
            {
                addParticipants.addElement(data.getEmployee(i).getUsername());
            }
            else if (personListModel.contains(data.getEmployee(i).getUsername()) && !invitedListModel.contains(data.getEmployee(i).getUsername()))
            {
                dialogUI.removeInvitedListElement (data.getEmployee(i).getUsername());
            }

        }
        dialogUI.setInvitedListModel(addParticipants);
        dispose();
        }


    private void removeButtonActionPerformed(ActionEvent e) {
        employeeListModel.addElement(invitedList.getSelectedValue());
        invitedListModel.removeElement(invitedList.getSelectedValue());
    }

    private void inviteButtonActionPerformed(ActionEvent e) {
        invitedListModel.addElement(employeeList.getSelectedValue());
        employeeListModel.removeElement(employeeList.getSelectedValue());
    }
    // End of variables declaration//GEN-END:variables
}
