package obscal;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLRMPdd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEDDdd = new javax.swing.JTextField();
        txtPOA = new javax.swing.JTextField();
        txtLRMPmm = new javax.swing.JTextField();
        txtLRMPyy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEDDmm = new javax.swing.JTextField();
        txtEDDyy = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Obstetrics Calculator");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(154, 11, 176, 21);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("MOH -Anamaduwa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(187, 38, 99, 15);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Enter the LRMP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(53, 101, 87, 15);

        txtLRMPdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLRMPdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLRMPddActionPerformed(evt);
            }
        });
        jPanel1.add(txtLRMPdd);
        txtLRMPdd.setBounds(189, 99, 31, 16);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("POA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(53, 192, 23, 15);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("EDD");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(56, 223, 20, 15);

        txtEDDdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEDDdd);
        txtEDDdd.setBounds(128, 221, 31, 16);

        txtPOA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPOA);
        txtPOA.setBounds(128, 190, 45, 16);

        txtLRMPmm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLRMPmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLRMPmmActionPerformed(evt);
            }
        });
        jPanel1.add(txtLRMPmm);
        txtLRMPmm.setBounds(238, 99, 42, 16);

        txtLRMPyy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLRMPyy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLRMPyyActionPerformed(evt);
            }
        });
        jPanel1.add(txtLRMPyy);
        txtLRMPyy.setBounds(298, 99, 109, 16);

        jLabel6.setText("DD");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(189, 125, 30, 14);

        jLabel7.setText("MM");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(238, 125, 40, 14);

        jLabel8.setText("YYYY");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(266, 247, 40, 14);

        txtEDDmm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEDDmm);
        txtEDDmm.setBounds(169, 221, 42, 16);

        txtEDDyy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEDDyy);
        txtEDDyy.setBounds(229, 221, 109, 16);

        jLabel9.setText("DD");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(132, 247, 30, 14);

        jLabel10.setText("MM");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(175, 247, 30, 14);

        jLabel11.setText("YYYY");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(339, 125, 40, 14);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("CALCULATE");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(349, 150, 69, 21);

        jLabel12.setText("Weeks");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(183, 193, 50, 14);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/obscal/things-to-never-say-to-pregnant-woman.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 500, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLRMPddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLRMPddActionPerformed

    }//GEN-LAST:event_txtLRMPddActionPerformed

    private void txtLRMPmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLRMPmmActionPerformed

    }//GEN-LAST:event_txtLRMPmmActionPerformed

    private void txtLRMPyyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLRMPyyActionPerformed

    }//GEN-LAST:event_txtLRMPyyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dd;
        int mm;
        int yyyy;

        try {
            dd = Integer.parseInt(txtLRMPdd.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter the date correctly");
            txtLRMPdd.requestFocus();
            return;
        }
        try {
            mm = Integer.parseInt(txtLRMPmm.getText().trim()) - 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter the month correctly");
            txtLRMPmm.requestFocus();
            return;
        }
        try {
            yyyy = Integer.parseInt(txtLRMPyy.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter the year correctly");
            txtLRMPyy.requestFocus();
            return;
        }

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, yyyy);
        c.set(Calendar.MONTH, mm);
        c.set(Calendar.DATE, dd);

        Date lrmp = c.getTime();
        Date today = new Date();

        c.add(Calendar.DATE, 280);
        txtEDDyy.setText(c.get(Calendar.YEAR) + "");
        txtEDDmm.setText(c.get(Calendar.MONTH) + 1 + "");
        txtEDDdd.setText(c.get(Calendar.DATE) + "");

        Long poaLong = (today.getTime() - lrmp.getTime()) / (1000 * 60 * 60 * 24 * 7);
        txtPOA.setText(poaLong + "");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEDDdd;
    private javax.swing.JTextField txtEDDmm;
    private javax.swing.JTextField txtEDDyy;
    private javax.swing.JTextField txtLRMPdd;
    private javax.swing.JTextField txtLRMPmm;
    private javax.swing.JTextField txtLRMPyy;
    private javax.swing.JTextField txtPOA;
    // End of variables declaration//GEN-END:variables
}
