/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no.ntnu.fp.gui;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import no.ntnu.fp.model.Appointment;

/**
 *
 * @author Ingrid
 */
public class AppointmentUI extends javax.swing.JPanel {

    
    private Appointment modelApp = null;
    /**
     * Creates new form MakeAppointment
     */
    public AppointmentUI() {
        initComponents();
    }
    
    public void setModelApp(Appointment app){
        modelApp = app;
        
        Date startdato = app.getStartTime();
        Date sluttdato = app.getEndTime();
        
        //setter datoen.
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        dateTextField.setText(dateFormat.format(startdato));
                
        //setter startTid
        DateFormat tidFormat = new SimpleDateFormat("HH:mm");
        toTextField.setText(tidFormat.format(startdato));
        fromTextField.setText(tidFormat.format(sluttdato));
        
        choosePlaceList.
        
      
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WhenPanel = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        toTextField = new javax.swing.JTextField();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        WherePanel = new javax.swing.JPanel();
        choosePlaceScrollPane = new javax.swing.JScrollPane();
        choosePlaceList = new javax.swing.JList();
        WhomPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personList = new javax.swing.JList();
        WhatPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        declineButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(795, 32767));
        setPreferredSize(new java.awt.Dimension(795, 454));

        WhenPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Når:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WhenPanel.setName("WhenPanel"); // NOI18N

        DateLabel.setText("Dato:");
        DateLabel.setName("DateLabel"); // NOI18N

        fromTextField.setEditable(false);
        fromTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fromTextField.setText("00:00");
        fromTextField.setName("fromTextField"); // NOI18N

        toTextField.setEditable(false);
        toTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toTextField.setText("00:00");
        toTextField.setName("toTextField"); // NOI18N

        fromLabel.setText("Fra:");
        fromLabel.setName("fromLabel"); // NOI18N

        toLabel.setText("Til:");
        toLabel.setName("toLabel"); // NOI18N

        lineLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lineLabel.setText("—");
        lineLabel.setName("lineLabel"); // NOI18N

        dateTextField.setEditable(false);
        dateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTextField.setText("dd/mm/yy");
        dateTextField.setName("dateTextField"); // NOI18N

        javax.swing.GroupLayout WhenPanelLayout = new javax.swing.GroupLayout(WhenPanel);
        WhenPanel.setLayout(WhenPanelLayout);
        WhenPanelLayout.setHorizontalGroup(
            WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhenPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateLabel)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lineLabel))
                    .addComponent(fromLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toLabel)
                    .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(356, 356, 356))
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
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WhenPanelLayout.createSequentialGroup()
                        .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toLabel)
                            .addComponent(fromLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WhenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lineLabel))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        WherePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hvor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WherePanel.setName("WherePanel"); // NOI18N

        choosePlaceScrollPane.setName("choosePlaceScrollPane"); // NOI18N

        choosePlaceList.setName("choosePlaceList"); // NOI18N
        choosePlaceScrollPane.setViewportView(choosePlaceList);

        javax.swing.GroupLayout WherePanelLayout = new javax.swing.GroupLayout(WherePanel);
        WherePanel.setLayout(WherePanelLayout);
        WherePanelLayout.setHorizontalGroup(
            WherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WherePanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(choosePlaceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        WherePanelLayout.setVerticalGroup(
            WherePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WherePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choosePlaceScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        WhomPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hvem:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WhomPanel.setName("WhomPanel"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        personList.setName("personList"); // NOI18N
        jScrollPane1.setViewportView(personList);

        javax.swing.GroupLayout WhomPanelLayout = new javax.swing.GroupLayout(WhomPanel);
        WhomPanel.setLayout(WhomPanelLayout);
        WhomPanelLayout.setHorizontalGroup(
            WhomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhomPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        WhomPanelLayout.setVerticalGroup(
            WhomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        WhatPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Beskrivelse:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        WhatPanel.setName("WhatPanel"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout WhatPanelLayout = new javax.swing.GroupLayout(WhatPanel);
        WhatPanel.setLayout(WhatPanelLayout);
        WhatPanelLayout.setHorizontalGroup(
            WhatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhatPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        WhatPanelLayout.setVerticalGroup(
            WhatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        declineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        declineButton.setText("Avslå");
        declineButton.setName("declineButton"); // NOI18N

        acceptButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptButton.setText("Godta");
        acceptButton.setName("acceptButton"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WhenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WherePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(declineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(WhomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(WhatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(WhomPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WherePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WhatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acceptButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(declineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private javax.swing.JPanel WhatPanel;
    private javax.swing.JPanel WhenPanel;
    private javax.swing.JPanel WherePanel;
    private javax.swing.JPanel WhomPanel;
    private javax.swing.JButton acceptButton;
    private javax.swing.JList choosePlaceList;
    private javax.swing.JScrollPane choosePlaceScrollPane;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton declineButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JList personList;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables
}
