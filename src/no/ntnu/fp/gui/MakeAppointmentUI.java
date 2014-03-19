/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no.ntnu.fp.gui;

import java.awt.event.ActionListener;

/**
 *
 * @author Ingrid
 */
public class MakeAppointmentUI extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MakeAppointmentUI2
     */
    public MakeAppointmentUI() {
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

        jPanel1 = new javax.swing.JPanel();
        WhenPanel = new javax.swing.JPanel();
        dateChooserCombo = new datechooser.beans.DateChooserCombo();
        DateLabel = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        toTextField = new javax.swing.JTextField();
        durationTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        fromLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        slashLabel = new javax.swing.JLabel();
        WherePanel = new javax.swing.JPanel();
        writePlaceTextField = new javax.swing.JTextField();
        writePlaceLabel = new javax.swing.JLabel();
        choosePlaceScrollPane = new javax.swing.JScrollPane();
        choosePlaceList = new javax.swing.JList();
        choosePlaceLabel = new javax.swing.JLabel();
        WhomPanel = new javax.swing.JPanel();
        addPersonButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personList = new javax.swing.JList();
        WhatPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(795, 32767));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(795, 454));

        WhenPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Når:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WhenPanel.setName("WhenPanel"); // NOI18N

        DateLabel.setText("Dato:");
        DateLabel.setName("DateLabel"); // NOI18N

        fromTextField.setText("00:00");
        fromTextField.setName("fromTextField"); // NOI18N

        toTextField.setText("00:00");
        toTextField.setName("toTextField"); // NOI18N

        durationTextField.setText("00:00");
        durationTextField.setName("durationTextField"); // NOI18N

        okButton.setText("Se ledige rom");
        okButton.setName("okButton"); // NOI18N

        fromLabel.setText("Fra:");
        fromLabel.setName("fromLabel"); // NOI18N

        durationLabel.setText("Varighet:");
        durationLabel.setName("durationLabel"); // NOI18N

        toLabel.setText("Til:");
        toLabel.setName("toLabel"); // NOI18N

        lineLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lineLabel.setText("—");
        lineLabel.setName("lineLabel"); // NOI18N

        slashLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slashLabel.setText("/");
        slashLabel.setName("slashLabel"); // NOI18N

        javax.swing.GroupLayout WhenPanelLayout = new javax.swing.GroupLayout(WhenPanel);
        WhenPanel.setLayout(WhenPanelLayout);
        WhenPanelLayout.setHorizontalGroup(
            WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhenPanelLayout.createSequentialGroup()
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(DateLabel))
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(dateChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel)
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lineLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toLabel)
                    .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(slashLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durationLabel)
                    .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(okButton)
                .addGap(71, 71, 71))
        );
        WhenPanelLayout.setVerticalGroup(
            WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(DateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(okButton)
                            .addComponent(dateChooserCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toLabel)
                            .addComponent(fromLabel)
                            .addComponent(durationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lineLabel)
                            .addComponent(slashLabel)
                            .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        WherePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hvor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WherePanel.setName("WherePanel"); // NOI18N

        writePlaceTextField.setName("writePlaceTextField"); // NOI18N
        writePlaceTextField.addActionListener(this);

        writePlaceLabel.setText("Skriv inn møtested:");
        writePlaceLabel.setName("writePlaceLabel"); // NOI18N

        choosePlaceScrollPane.setName("choosePlaceScrollPane"); // NOI18N

        choosePlaceList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        choosePlaceList.setName("choosePlaceList"); // NOI18N
        choosePlaceScrollPane.setViewportView(choosePlaceList);

        choosePlaceLabel.setText("eller velg ledig møterom:");
        choosePlaceLabel.setName("choosePlaceLabel"); // NOI18N

        javax.swing.GroupLayout WherePanelLayout = new javax.swing.GroupLayout(WherePanel);
        WherePanel.setLayout(WherePanelLayout);
        WherePanelLayout.setHorizontalGroup(
            WherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WherePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(WherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choosePlaceLabel)
                    .addGroup(WherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(choosePlaceScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(writePlaceLabel)
                        .addComponent(writePlaceTextField)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        WherePanelLayout.setVerticalGroup(
            WherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WherePanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(writePlaceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(writePlaceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choosePlaceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choosePlaceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        WhomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hvem:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WhomPanel.setName("WhomPanel"); // NOI18N

        addPersonButton.setText("Legg til personer");
        addPersonButton.setName("addPersonButton"); // NOI18N
        addPersonButton.addActionListener(this);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        personList.setName("personList"); // NOI18N
        jScrollPane1.setViewportView(personList);

        javax.swing.GroupLayout WhomPanelLayout = new javax.swing.GroupLayout(WhomPanel);
        WhomPanel.setLayout(WhomPanelLayout);
        WhomPanelLayout.setHorizontalGroup(
            WhomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhomPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(WhomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhomPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhomPanelLayout.createSequentialGroup()
                        .addComponent(addPersonButton)
                        .addGap(59, 59, 59))))
        );
        WhomPanelLayout.setVerticalGroup(
            WhomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhomPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addPersonButton)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        WhatPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Beskrivelse:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WhatPanel.setName("WhatPanel"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout WhatPanelLayout = new javax.swing.GroupLayout(WhatPanel);
        WhatPanel.setLayout(WhatPanelLayout);
        WhatPanelLayout.setHorizontalGroup(
            WhatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhatPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        WhatPanelLayout.setVerticalGroup(
            WhatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhatPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        SaveButton.setText("Lagre");
        SaveButton.setName("SaveButton"); // NOI18N

        CancelButton.setText("Avbryt");
        CancelButton.setName("CancelButton"); // NOI18N
        CancelButton.addActionListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WhenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(WherePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WhomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WhatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WhatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WherePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WhomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == writePlaceTextField) {
            MakeAppointmentUI.this.writePlaceTextFieldActionPerformed(evt);
        }
        else if (evt.getSource() == addPersonButton) {
            MakeAppointmentUI.this.addPersonButtonActionPerformed(evt);
        }
        else if (evt.getSource() == CancelButton) {
            MakeAppointmentUI.this.CancelButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void writePlaceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writePlaceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_writePlaceTextFieldActionPerformed

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
        new AddEmployeeDialogUI(this, false).setVisible(true);
    }//GEN-LAST:event_addPersonButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        new HomeUI().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MakeAppointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeAppointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeAppointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeAppointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeAppointmentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel WhatPanel;
    private javax.swing.JPanel WhenPanel;
    private javax.swing.JPanel WherePanel;
    private javax.swing.JPanel WhomPanel;
    private javax.swing.JButton addPersonButton;
    private javax.swing.JLabel choosePlaceLabel;
    private javax.swing.JList choosePlaceList;
    private javax.swing.JScrollPane choosePlaceScrollPane;
    private datechooser.beans.DateChooserCombo dateChooserCombo;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JList personList;
    private javax.swing.JLabel slashLabel;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toTextField;
    private javax.swing.JLabel writePlaceLabel;
    private javax.swing.JTextField writePlaceTextField;
    // End of variables declaration//GEN-END:variables
}