/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travel;

import com.model.dbaseAccount;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JAVA
 */
public class FinalBooking extends javax.swing.JFrame {
    ResultSet rs;
    double totalfare;
    int op;//will use it in insert function
    Vector v1;//will use it in insert function

    public FinalBooking() {
        initComponents();
        Color backgroundcolor = new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor); 
        
       returnjpanel.setVisible(false);
        setVisible(true);
        setResizable(false);
    }
    
    public  void flightdetails(Vector v,int option) throws SQLException
    {
        String code,code1,departtime = null,departfare = null,returntime = null,returnfare = null;
       
       op = option;
       v1 =v;
        code = String.valueOf(v.get(3));//we have passed flight code in index 3 of vector
        
        // now to get deart time and fare for selected flight
        dbaseAccount dba = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba.finaldepart(code); //calling function from database
                                                           
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            rs.beforeFirst();
            while (rs.next()== true)
            {           
                
                departtime = rs.getString("departtime");
                departfare = rs.getString("fare");
            }                            
               
       
       lbldepartureflight.setText(String.valueOf(v.get(0)) +" to  "+ String.valueOf(v.get(1)));
       
       lbldepartflightcode.setText(lbldepartflightcode.getText() +" " + String.valueOf(v.get(3)) );
      
       DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");//if we dont do this, system will display the current time also
       lbldepartflightdate.setText(lbldepartflightdate.getText() +" " + String.valueOf(df.format( v.get(2))) );
       
    
        
      lbldepartflighttime.setText(lbldepartflighttime.getText() +" " + departtime  );
      lbldepartfare.setText(lbldepartfare.getText() +" " + departfare  );
      totalfare = 1.18 * (Integer.parseInt(departfare));
      lbltotalfare.setText(lbltotalfare.getText() +" " + totalfare  );
      
    
     if (option ==2) //fetching additional data for return
    {
        returnjpanel.setVisible(true);
         code1 = String.valueOf(v.get(5));//we have passed flight code in index 3 of vector
        
        // now to get deart time and fare for selected flight
        dbaseAccount dba1 = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba1.finalreturn(code1); //calling function from database
                                                           
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            rs.beforeFirst();
            while (rs.next()== true)
            {           
                
                returntime = rs.getString("departtime");
                returnfare = rs.getString("fare");
            }     
            
            lblreturnflight.setText(String.valueOf(v.get(1)) +" to  "+ String.valueOf(v.get(0)));
       
       lblreturnflightcode.setText(lblreturnflightcode.getText() +" " + String.valueOf(v.get(5)) );
      
       DateFormat df1 = new  SimpleDateFormat("dd-MM-yyyy");//if we dont do this, system will display the current time also
       lblreturnflightdate.setText(lblreturnflightdate.getText() +" " + String.valueOf(df1.format( v.get(4))) );
       
    
        
      lblreturnflighttime.setText(lblreturnflighttime.getText() +" " + returntime  );
      lblreturnfare.setText(lblreturnfare.getText() +" " + returnfare  );
      lbltotalfare.setText("Total Fare (including 18% GST):");
      totalfare = 1.18 * ( totalfare + Integer.parseInt(returnfare));
      lbltotalfare.setText(lbltotalfare.getText() +" " + totalfare  );
    
    
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

        jLabel5 = new javax.swing.JLabel();
        lbldepartflighttime1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbsalutation = new javax.swing.JComboBox<>();
        txtlastname = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbldepartflightcode = new javax.swing.JLabel();
        lbldepartureflight = new javax.swing.JLabel();
        lbldepartflightdate = new javax.swing.JLabel();
        lbldepartflighttime = new javax.swing.JLabel();
        lbldepartfare = new javax.swing.JLabel();
        returnjpanel = new javax.swing.JPanel();
        lblreturnflightcode = new javax.swing.JLabel();
        lblreturnflight = new javax.swing.JLabel();
        lblreturnflightdate = new javax.swing.JLabel();
        lblreturnflighttime = new javax.swing.JLabel();
        lblreturnfare = new javax.swing.JLabel();
        buttoncomplete = new javax.swing.JButton();
        lbltotalfare = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("First Name:");

        lbldepartflighttime1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbldepartflighttime1.setForeground(new java.awt.Color(153, 0, 0));
        lbldepartflighttime1.setText("Departure Time :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(903, 652));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Complete Your Booking");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Contact number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Salutation");

        cmbsalutation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbsalutation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Ms", "Mrs." }));

        txtlastname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtfirstname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtcontact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        lbldepartflightcode.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbldepartflightcode.setForeground(new java.awt.Color(153, 0, 0));
        lbldepartflightcode.setText("FLIGHT CODE :");

        lbldepartureflight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldepartureflight.setForeground(new java.awt.Color(153, 0, 0));
        lbldepartureflight.setText("flight");

        lbldepartflightdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbldepartflightdate.setForeground(new java.awt.Color(153, 0, 0));
        lbldepartflightdate.setText("Departure Date :");

        lbldepartflighttime.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbldepartflighttime.setForeground(new java.awt.Color(153, 0, 0));
        lbldepartflighttime.setText("Departure Time :");

        lbldepartfare.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbldepartfare.setForeground(new java.awt.Color(153, 0, 0));
        lbldepartfare.setText("Fare:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldepartflightcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldepartflightdate, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldepartflighttime, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lbldepartfare, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(lbldepartureflight, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lbldepartflightcode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldepartflightdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldepartflighttime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldepartfare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lbldepartureflight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );

        returnjpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        lblreturnflightcode.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblreturnflightcode.setForeground(new java.awt.Color(153, 0, 0));
        lblreturnflightcode.setText("FLIGHT CODE :");

        lblreturnflight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblreturnflight.setForeground(new java.awt.Color(153, 0, 0));
        lblreturnflight.setText("flight");

        lblreturnflightdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblreturnflightdate.setForeground(new java.awt.Color(153, 0, 0));
        lblreturnflightdate.setText("Return Date :");

        lblreturnflighttime.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblreturnflighttime.setForeground(new java.awt.Color(153, 0, 0));
        lblreturnflighttime.setText("Departure Time :");

        lblreturnfare.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblreturnfare.setForeground(new java.awt.Color(153, 0, 0));
        lblreturnfare.setText("Fare:");

        javax.swing.GroupLayout returnjpanelLayout = new javax.swing.GroupLayout(returnjpanel);
        returnjpanel.setLayout(returnjpanelLayout);
        returnjpanelLayout.setHorizontalGroup(
            returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnjpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returnjpanelLayout.createSequentialGroup()
                        .addComponent(lblreturnflightcode, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(returnjpanelLayout.createSequentialGroup()
                        .addComponent(lblreturnflightdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnjpanelLayout.createSequentialGroup()
                        .addComponent(lblreturnflighttime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lblreturnfare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(returnjpanelLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(lblreturnflight, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        returnjpanelLayout.setVerticalGroup(
            returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnjpanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblreturnflightcode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblreturnflightdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblreturnflighttime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblreturnfare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(returnjpanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblreturnflight, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(164, Short.MAX_VALUE)))
        );

        buttoncomplete.setText("Complete booking");
        buttoncomplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncompleteMouseClicked(evt);
            }
        });

        lbltotalfare.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotalfare.setForeground(new java.awt.Color(102, 0, 0));
        lbltotalfare.setText("Total fare (including 18% GST) : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbsalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltotalfare, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttoncomplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addComponent(returnjpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addComponent(jLabel2)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbsalutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnjpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalfare, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttoncomplete)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel2)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, returnjpanel});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncompleteMouseClicked
        // TODO add your handling code here:
        int x=0;
       dbaseAccount dba2 = new dbaseAccount();
        try {
            //we need to pass all data as string
            x = dba2.insertdata(String.valueOf( v1.get(0)),String.valueOf(v1.get(1)),
                    String.valueOf(v1.get(3)),String.valueOf(v1.get(5)),totalfare, String.valueOf(cmbsalutation.getSelectedItem()), 
                    txtfirstname.getText(), txtlastname.getText(),txtcontact.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FinalBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FinalBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (x != 0 )
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        else
          JOptionPane.showMessageDialog(null, "Data not updated"); 
    }//GEN-LAST:event_buttoncompleteMouseClicked

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
            java.util.logging.Logger.getLogger(FinalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncomplete;
    private javax.swing.JComboBox<String> cmbsalutation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbldepartfare;
    private javax.swing.JLabel lbldepartflightcode;
    private javax.swing.JLabel lbldepartflightdate;
    private javax.swing.JLabel lbldepartflighttime;
    private javax.swing.JLabel lbldepartflighttime1;
    private javax.swing.JLabel lbldepartureflight;
    private javax.swing.JLabel lblreturnfare;
    private javax.swing.JLabel lblreturnflight;
    private javax.swing.JLabel lblreturnflightcode;
    private javax.swing.JLabel lblreturnflightdate;
    private javax.swing.JLabel lblreturnflighttime;
    private javax.swing.JLabel lbltotalfare;
    private javax.swing.JPanel returnjpanel;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    // End of variables declaration//GEN-END:variables
}
