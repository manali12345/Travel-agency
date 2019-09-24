
package com.travel;

import com.model.dbaseAccount;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class flightBooking extends javax.swing.JFrame {
    ResultSet rs,rsreturn; 
    int option; //to determine if the operation is one-way or return
  
   
//NOTE: for adding a date picker we need to first download jcalendar.jar
    // i have copied jdatechooser (version 1.4) in my netbeans folder
    //then include this file in your palette manager from tools on top of your netbeans screen.
    
    //we have also downloaded rs2xml file and added to libraries, will need that for table operations
    /**
     * Creates new form flightBooking
     */
    public flightBooking() throws ClassNotFoundException, SQLException {
        initComponents();
          Color backgroundcolor = new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor); 
       
        departtablejPanel.setVisible(false); //we are placing the tables in side panels 
         returntablejpanel.setVisible(false);  
         buttonconfirm.setVisible(false);
        fillcombobox();
        
        setVisible(true);
        setResizable(false);
        
        
        
    
    }
            
    public void fillcombobox() throws ClassNotFoundException, SQLException
    {
       //first we will empty all comboboxes
        cmborigin.removeAllItems();
       cmbdestination.removeAllItems();
        //Code for AUto populating the cities Combo boxes
        //for this we have written a getcities() method in dbaseaccount.java file
        
        dbaseAccount dba = new dbaseAccount(); //this is our class in com.model
        rs = dba.getSourceCity();
        
        while (rs.next()== true)
        {
           
            cmborigin.addItem(rs.getString("source"));
           
        }
        
       
        rs = dba.getDestinationCity();
        
        while (rs.next()== true)
        {
           
            
            cmbdestination.addItem(rs.getString("destination"));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jCalModel1 = new com.jcalendar.model.JCalModel();
        jCalModel2 = new com.jcalendar.model.JCalModel();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil3 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil4 = new org.jdatepicker.util.JDatePickerUtil();
        jCalModel3 = new com.jcalendar.model.JCalModel();
        jCalModel4 = new com.jcalendar.model.JCalModel();
        jDatePickerUtil5 = new org.jdatepicker.util.JDatePickerUtil();
        jLabel1 = new javax.swing.JLabel();
        radiooneway = new javax.swing.JRadioButton();
        radioreturn = new javax.swing.JRadioButton();
        lblorigin = new javax.swing.JLabel();
        cmborigin = new javax.swing.JComboBox<>();
        lbldestination = new javax.swing.JLabel();
        cmbdestination = new javax.swing.JComboBox<>();
        lbldeparture = new javax.swing.JLabel();
        lblreturn = new javax.swing.JLabel();
        buttonsearch = new javax.swing.JButton();
        buttoncancel = new javax.swing.JButton();
        departurejDateChooser = new com.toedter.calendar.JDateChooser();
        returnjDateChooser = new com.toedter.calendar.JDateChooser();
        departtablejPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        departuretable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbselectdepartflight = new javax.swing.JComboBox<>();
        returntablejpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        returntable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cmbreturnflight = new javax.swing.JComboBox<>();
        buttonconfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Help us choose the best flight for you...");

        radiooneway.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        radiooneway.setForeground(new java.awt.Color(0, 0, 102));
        radiooneway.setText("One Way");
        radiooneway.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioonewayMouseClicked(evt);
            }
        });
        radiooneway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioonewayActionPerformed(evt);
            }
        });

        radioreturn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        radioreturn.setForeground(new java.awt.Color(0, 0, 102));
        radioreturn.setText("Return");
        radioreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioreturnMouseClicked(evt);
            }
        });
        radioreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioreturnActionPerformed(evt);
            }
        });

        lblorigin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblorigin.setForeground(new java.awt.Color(0, 0, 102));
        lblorigin.setText("City of Origin");

        cmborigin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmborigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmborigin.setEnabled(false);
        cmborigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboriginActionPerformed(evt);
            }
        });

        lbldestination.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbldestination.setForeground(new java.awt.Color(0, 0, 102));
        lbldestination.setText("Destination");

        cmbdestination.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbdestination.setEnabled(false);
        cmbdestination.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdestinationItemStateChanged(evt);
            }
        });
        cmbdestination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbdestinationMouseClicked(evt);
            }
        });

        lbldeparture.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbldeparture.setForeground(new java.awt.Color(0, 0, 102));
        lbldeparture.setText("Depature Date");

        lblreturn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblreturn.setForeground(new java.awt.Color(0, 0, 102));
        lblreturn.setText("Return Date");

        buttonsearch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonsearch.setText("Search");
        buttonsearch.setEnabled(false);
        buttonsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsearchMouseClicked(evt);
            }
        });
        buttonsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonsearchKeyPressed(evt);
            }
        });

        buttoncancel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttoncancel.setText("Cancel");
        buttoncancel.setEnabled(false);
        buttoncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncancelMouseClicked(evt);
            }
        });

        departurejDateChooser.setEnabled(false);

        returnjDateChooser.setEnabled(false);

        departtablejPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        departuretable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        departuretable.setForeground(new java.awt.Color(51, 0, 153));
        departuretable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(departuretable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Departure Flight");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Select your flight");

        cmbselectdepartflight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbselectdepartflight.setForeground(new java.awt.Color(51, 0, 102));
        cmbselectdepartflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbselectdepartflightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout departtablejPanelLayout = new javax.swing.GroupLayout(departtablejPanel);
        departtablejPanel.setLayout(departtablejPanelLayout);
        departtablejPanelLayout.setHorizontalGroup(
            departtablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departtablejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(departtablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(departtablejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, departtablejPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbselectdepartflight, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        departtablejPanelLayout.setVerticalGroup(
            departtablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, departtablejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(departtablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(departtablejPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(departtablejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbselectdepartflight, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(departtablejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        returntablejpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Return Flight");

        returntable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        returntable.setForeground(new java.awt.Color(51, 0, 102));
        returntable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(returntable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Select your return flight");

        cmbreturnflight.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbreturnflight.setForeground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout returntablejpanelLayout = new javax.swing.GroupLayout(returntablejpanel);
        returntablejpanel.setLayout(returntablejpanelLayout);
        returntablejpanelLayout.setHorizontalGroup(
            returntablejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returntablejpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returntablejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(returntablejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(returntablejpanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbreturnflight, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        returntablejpanelLayout.setVerticalGroup(
            returntablejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returntablejpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(returntablejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbreturnflight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        buttonconfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonconfirm.setText("Confirm Booking");
        buttonconfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonconfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radiooneway, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblorigin)
                                .addComponent(lbldestination))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbdestination, 0, 135, Short.MAX_VALUE)
                                .addComponent(cmborigin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbldeparture)
                                .addComponent(lblreturn))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(departurejDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(returnjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(buttoncancel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(buttonconfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(departtablejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returntablejpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiooneway)
                            .addComponent(radioreturn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblorigin)
                                .addGap(18, 18, 18)
                                .addComponent(lbldestination))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmborigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldeparture)
                            .addComponent(departurejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblreturn)
                            .addComponent(returnjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(departtablejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonsearch)
                        .addGap(18, 18, 18)
                        .addComponent(buttoncancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonconfirm))
                    .addComponent(returntablejpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioonewayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioonewayActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_radioonewayActionPerformed

    private void radioreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioreturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioreturnActionPerformed

    private void cmboriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboriginActionPerformed

    private void radioonewayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioonewayMouseClicked
        // TODO add your handling code here:
       radioreturn.setEnabled(false);
       cmborigin.setEnabled(true);
       cmbdestination.setEnabled(true);
       departurejDateChooser.setEnabled(true);
       buttonsearch.setEnabled(true);
       buttoncancel.setEnabled(true);
       option = 1; //indicating that user has selected one way
       //Once the date chooser becomes active, we will set todays date as default -Junaid Khateeb
       Date d = new Date();
        departurejDateChooser.setDate((d));
       
    }//GEN-LAST:event_radioonewayMouseClicked

    private void cmbdestinationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdestinationItemStateChanged
// THis will check if the origin and the destination cities are the same, if yes,generate error
        
       // if (  cmborigin.getSelectedItem()== cmbdestination.getSelectedItem()  )
         //  JOptionPane.showMessageDialog(null,    "Origin and destination cities cant be the same.","Inane warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_cmbdestinationItemStateChanged

    private void cmbdestinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbdestinationMouseClicked
         
    }//GEN-LAST:event_cmbdestinationMouseClicked

    private void radioreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioreturnMouseClicked
        // TODO add your handling code here:
        radiooneway.setEnabled(false);
       cmborigin.setEnabled(true);
       cmbdestination.setEnabled(true);
       departurejDateChooser.setEnabled(true);
      returnjDateChooser.setEnabled(true);
      buttonsearch.setEnabled(true);
       buttoncancel.setEnabled(true);
       option = 2; //indicating that user has selected return
        
      Date d = new Date();
        departurejDateChooser.setDate((d));
        returnjDateChooser.setDate((d));
       
    }//GEN-LAST:event_radioreturnMouseClicked

    private void buttonsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonsearchKeyPressed
        
            
    }//GEN-LAST:event_buttonsearchKeyPressed

    private void buttonsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsearchMouseClicked
                   String source ,dest;
                   ResultSet rs1 = null,rs2=null;
            if (option ==1)
            {
                
                source = cmborigin.getSelectedItem().toString();
                dest = cmbdestination.getSelectedItem().toString();
                dbaseAccount dba = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba.getDepartureFlight(source,dest); //calling function from database
                                        rs1=rs;
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
             
            departtablejPanel.setVisible(true);
            buttonconfirm.setVisible(true);
            //Define TableModel
            TableModel tmodel = new DefaultTableModel();
            departuretable.setModel(DbUtils.resultSetToTableModel(rs)); 
        try {
            //adding selected flight codes to combo box
            rs1.beforeFirst();
            while (rs1.next()== true)
            {           
                
                cmbselectdepartflight.addItem(rs1.getString("flightid"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else
            {
                if (option ==2)
                {
                      source = cmborigin.getSelectedItem().toString();
                dest = cmbdestination.getSelectedItem().toString();
                dbaseAccount dba = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba.getDepartureFlight(source,dest); //calling function from database
                     rsreturn = dba.getReturnFlight(source,dest);
                    rs1=rs;
                    rs2=rsreturn;
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
             
            departtablejPanel.setVisible(true);
            returntablejpanel.setVisible(true);
            buttonconfirm.setVisible(true);
            //Define TableModel
            TableModel tmodel = new DefaultTableModel();
            departuretable.setModel(DbUtils.resultSetToTableModel(rs)); 
            returntable.setModel(DbUtils.resultSetToTableModel(rsreturn)); 
        try {
            //adding selected flight codes to combo box
            rs1.beforeFirst();
            while (rs1.next()== true)
            {           
                
                cmbselectdepartflight.addItem(rs1.getString("flightid"));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        try {
            //adding selected return flight codes to combo box
            rs2.beforeFirst();
            while (rs2.next()== true)
            {           
                
                cmbreturnflight.addItem(rs2.getString("flightid"));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                }
                
            }
    }//GEN-LAST:event_buttonsearchMouseClicked

    private void cmbselectdepartflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbselectdepartflightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbselectdepartflightActionPerformed

    private void buttoncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncancelMouseClicked
        // TODO add your handling code here:
        MainMenuScreen m = new MainMenuScreen();
        this.dispose();
    }//GEN-LAST:event_buttoncancelMouseClicked

    private void buttonconfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonconfirmMouseClicked
        // on clicking this button we will collect ll data that user has selected and
        //send it to the next form in a vector
        Vector bookingdetails = new Vector ();
        bookingdetails.addElement(cmborigin.getSelectedItem()); //index 0 on vector
        bookingdetails.addElement(cmbdestination.getSelectedItem());//index 1 on vector
        bookingdetails.addElement(departurejDateChooser.getDate());//index 2 on vector
        bookingdetails.addElement(cmbselectdepartflight.getSelectedItem());//index 3 on vector
        
        if (option == 2)
        {
        bookingdetails.addElement(returnjDateChooser.getDate());//index 4 on vector
        bookingdetails.addElement(cmbreturnflight.getSelectedItem());//index 5 on vector
        
        }
        
        FinalBooking fb = new FinalBooking();
        try {
            
            fb.flightdetails(bookingdetails,option);
        } catch (SQLException ex) {
            Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonconfirmMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(flightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new flightBooking().setVisible(true);//type this statemnt first, it will automatically sorrounded by try-catch
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton buttoncancel;
    private javax.swing.JButton buttonconfirm;
    private javax.swing.JButton buttonsearch;
    private javax.swing.JComboBox<String> cmbdestination;
    private javax.swing.JComboBox<String> cmborigin;
    private javax.swing.JComboBox<String> cmbreturnflight;
    private javax.swing.JComboBox<String> cmbselectdepartflight;
    private javax.swing.JPanel departtablejPanel;
    private com.toedter.calendar.JDateChooser departurejDateChooser;
    private javax.swing.JTable departuretable;
    private com.jcalendar.model.JCalModel jCalModel1;
    private com.jcalendar.model.JCalModel jCalModel2;
    private com.jcalendar.model.JCalModel jCalModel3;
    private com.jcalendar.model.JCalModel jCalModel4;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil3;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil4;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldeparture;
    private javax.swing.JLabel lbldestination;
    private javax.swing.JLabel lblorigin;
    private javax.swing.JLabel lblreturn;
    private javax.swing.JRadioButton radiooneway;
    private javax.swing.JRadioButton radioreturn;
    private com.toedter.calendar.JDateChooser returnjDateChooser;
    private javax.swing.JTable returntable;
    private javax.swing.JPanel returntablejpanel;
    // End of variables declaration//GEN-END:variables
}
