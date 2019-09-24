
package com.travel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenuScreen extends javax.swing.JFrame {

    public MainMenuScreen() {
        initComponents();
       
        
         Color backgroundcolor = new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor);
         
         
        setVisible(true);
        setResizable(false);
         clockDisplay();
        
    }    
    void clockDisplay()
    {
      Calendar cal = new GregorianCalendar();
      int month = cal.get(Calendar.MONTH);
      int date = cal.get(Calendar.DATE);
      int year = cal.get(Calendar.YEAR);
      lbldate.setText("DATE :"+ date + "-" + (month+1) + "-" + year);
        /*we are creating a thread as we want the time to refresh after every second.
              if refreshing is  not needed then this thread is not required*/
        Thread clocktime = new Thread()
      {
        public void run()
        {         
      
      try
      {
       
      while (true)
      {
      Calendar c = new GregorianCalendar();
          int hour = c.get(Calendar.HOUR);
      int min = c.get(Calendar.MINUTE);
      int sec = c.get(Calendar.SECOND);
      lbltime.setText("TIME :"+ hour + ":" + min + ":" + sec);
        
            
                sleep(1000);
      }   
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }; //end of thread
        clocktime.start();
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblflightbooking = new javax.swing.JLabel();
        lblhotelbooking = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAVA\\Desktop\\globe-trotters\\hotel.jpg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAVA\\Desktop\\globe-trotters\\flight.jpg")); // NOI18N

        lblflightbooking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblflightbooking.setForeground(new java.awt.Color(102, 0, 0));
        lblflightbooking.setText("Click here for flight booking");
        lblflightbooking.setName("lblflightbooking"); // NOI18N
        lblflightbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblflightbookingMouseClicked(evt);
            }
        });

        lblhotelbooking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblhotelbooking.setForeground(new java.awt.Color(102, 0, 0));
        lblhotelbooking.setText("Click here for Hotel booking");
        lblhotelbooking.setName("lblhotelbooking"); // NOI18N

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldate.setText("lbldate");
        lbldate.setName("lbldate"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setName("lbltime"); // NOI18N

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setText("lbltime");
        lbltime.setName("lbltime"); // NOI18N

        jMenuBar1.setMaximumSize(new java.awt.Dimension(27, 200));
        jMenuBar1.setName("adminMenu"); // NOI18N

        jMenu1.setText("Admin Login");

        jMenuItem1.setText("Login to Admin Account");
        jMenuItem1.setName("menuLogin"); // NOI18N
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblflightbooking)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblhotelbooking)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblflightbooking)
                    .addComponent(lblhotelbooking))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel5)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblflightbookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblflightbookingMouseClicked
        try {
            // TODO add your handling code here:
            flightBooking fb = new flightBooking(); //try-catch is needed here as,Flight booking class is reporting exception
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_lblflightbookingMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblflightbooking;
    private javax.swing.JLabel lblhotelbooking;
    private javax.swing.JLabel lbltime;
    // End of variables declaration//GEN-END:variables
}
