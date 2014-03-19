/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no.ntnu.fp.gui;

import no.ntnu.fp.model.Employee;
import no.ntnu.fp.storage.DatabaseHandler;

import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author Ingrid
 */
public class HomeUI extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form FellProUI
     */

    private static int userID;
    private Employee user;
    private DatabaseHandler data;

    public HomeUI(int userID) throws SQLException {
        data = new DatabaseHandler();
        this.userID = userID;
        user = data.getEmployee(userID);
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

        homePanel = new javax.swing.JPanel();
        UkeNrTittel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        otherCalendarsButton = new javax.swing.JButton();
        makeAppointmentButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        LastWeek = new javax.swing.JButton();
        NextWeek = new javax.swing.JButton();
        calendarPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CalendarView = new javax.swing.JTable();
        weekNumberTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("WookieCookie"); // NOI18N
        setResizable(false);

        homePanel.setName("homePanel"); // NOI18N

        UkeNrTittel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UkeNrTittel.setText("Uke nr:");
        UkeNrTittel.setName("UkeNrTittel"); // NOI18N

        logoutButton.setText("Logg ut");
        logoutButton.setName("logoutButton"); // NOI18N
        logoutButton.addActionListener(this);

        otherCalendarsButton.setText("Andre kalendere");
        otherCalendarsButton.setName("otherCalendarsButton"); // NOI18N
        otherCalendarsButton.addActionListener(this);

        makeAppointmentButton.setBackground(new java.awt.Color(255, 0, 51));
        makeAppointmentButton.setText("Opprett avtale");
        makeAppointmentButton.setName("makeAppointmentButton"); // NOI18N
        makeAppointmentButton.addActionListener(this);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oppdateringer", " " }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        LastWeek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LastWeek.setText("<");
        LastWeek.setName("LastWeek"); // NOI18N
        LastWeek.addActionListener(this);

        NextWeek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NextWeek.setText(">");
        NextWeek.setName("NextWeek"); // NOI18N

        calendarPanel.setName("calendarPanel"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        CalendarView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01:00", null, null, null, null, null, null, null},
                {"02:00", null, null, null, null, null, null, null},
                {"03:00", null, null, null, null, null, null, null},
                {"04:00", null, null, null, null, null, null, null},
                {"05:00", null, null, null, null, null, null, null},
                {"06:00", null, null, null, null, null, null, null},
                {"07:00", null, null, null, null, null, null, null},
                {"08:00", null, null, null, null, null, null, null},
                {"09:00", null, null, null, null, null, null, null},
                {"10:00", null, null, null, null, null, null, null},
                {"11:00", null, null, null, null, null, null, null},
                {"12:00", null, null, null, null, null, null, null},
                {"13:00", null, null, null, null, null, null, null},
                {"14:00", null, null, null, null, null, null, null},
                {"15:00", null, null, null, null, null, null, null},
                {"16:00", null, null, null, null, null, null, null},
                {"17:00", null, null, null, null, null, null, null},
                {"18:00", null, null, null, null, null, null, null},
                {"19:00", null, null, null, null, null, null, null},
                {"20:00", null, null, null, null, null, null, null},
                {"21:00", null, null, null, null, null, null, null},
                {"22:00", null, null, null, null, null, null, null},
                {"23:00", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CalendarView.setName("CalendarView"); // NOI18N
        jScrollPane1.setViewportView(CalendarView);
        if (CalendarView.getColumnModel().getColumnCount() > 0) {
            CalendarView.getColumnModel().getColumn(0).setResizable(false);
            CalendarView.getColumnModel().getColumn(1).setResizable(false);
            CalendarView.getColumnModel().getColumn(2).setResizable(false);
            CalendarView.getColumnModel().getColumn(3).setResizable(false);
            CalendarView.getColumnModel().getColumn(4).setResizable(false);
            CalendarView.getColumnModel().getColumn(5).setResizable(false);
            CalendarView.getColumnModel().getColumn(6).setResizable(false);
            CalendarView.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout calendarPanelLayout = new javax.swing.GroupLayout(calendarPanel);
        calendarPanel.setLayout(calendarPanelLayout);
        calendarPanelLayout.setHorizontalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calendarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        calendarPanelLayout.setVerticalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calendarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        weekNumberTextField.setEditable(false);
        weekNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        weekNumberTextField.setText("00");
        weekNumberTextField.setName("weekNumberTextField"); // NOI18N

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(UkeNrTittel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LastWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(NextWeek)
                        .addGap(32, 32, 32)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(otherCalendarsButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(makeAppointmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UkeNrTittel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(logoutButton)
                                .addGap(18, 18, 18)
                                .addComponent(makeAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(otherCalendarsButton)
                                .addGap(18, 18, 18)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NextWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1)))
                            .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(LastWeek)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == makeAppointmentButton) {
            HomeUI.this.makeAppointmentButtonActionPerformed(evt);
        }
        else if (evt.getSource() == LastWeek) {
            HomeUI.this.LastWeekActionPerformed(evt);
        }
        else if (evt.getSource() == logoutButton) {
            HomeUI.this.logoutButtonActionPerformed(evt);
        }
        else if (evt.getSource() == otherCalendarsButton) {
            HomeUI.this.otherCalendarsButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void LastWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastWeekActionPerformed

    private void makeAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeAppointmentButtonActionPerformed
        this.removeAll();
        this.add(new MakeAppointmentPanelUI());
        
        //new MakeAppointmentUI().setVisible(true);
        //dispose();
        
    }//GEN-LAST:event_makeAppointmentButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        MakeAppointmentUI makeApp = new MakeAppointmentUI();
        this.getContentPane().add(makeApp);
        makeApp.setVisible(true);
        setVisible(false);
        //dispose();
        
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void otherCalendarsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherCalendarsButtonActionPerformed
        new AddEmployeeDialogUI(this, false).setVisible(true);
    }//GEN-LAST:event_otherCalendarsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomeUI(userID).setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CalendarView;
    private javax.swing.JButton LastWeek;
    private javax.swing.JButton NextWeek;
    private javax.swing.JLabel UkeNrTittel;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton makeAppointmentButton;
    private javax.swing.JButton otherCalendarsButton;
    private javax.swing.JTextField weekNumberTextField;
    // End of variables declaration//GEN-END:variables
}
