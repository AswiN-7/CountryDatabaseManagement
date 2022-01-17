/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ELCOT
 */
public class reg_birth extends javax.swing.JFrame {

    /**
     * Creates new form reg_birth
     */
    public reg_birth() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        MID = new javax.swing.JTextField();
        FID = new javax.swing.JTextField();
        MA = new javax.swing.JRadioButton();
        FE = new javax.swing.JRadioButton();
        DOB = new com.toedter.calendar.JDateChooser();
        STATE = new javax.swing.JTextField();
        DONE = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CHILD ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("MOTHER ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("FATHER ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("GENDER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("STATE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 30));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 140, 40));
        getContentPane().add(MID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 130, 30));
        getContentPane().add(FID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 130, 30));

        MA.setText("MALE");
        getContentPane().add(MA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        FE.setText("FEMALE");
        getContentPane().add(FE, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));
        getContentPane().add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 130, 30));
        getContentPane().add(STATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 130, 30));

        DONE.setBackground(new java.awt.Color(255, 51, 102));
        DONE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DONE.setText("DONE");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });
        getContentPane().add(DONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 130, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("NAME");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, 30));
        getContentPane().add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 140, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 130, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/pla.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
        // TODO add your handling code here:
        String gender=null;
         if(MA.isSelected())
            gender="m";
        else if(FE.isSelected())
            gender="f";
         if(ID.getText().isEmpty()||NAME.getText().isEmpty()||((JTextField)DOB.getDateEditor().getUiComponent()).getText().isEmpty()||STATE.getText().isEmpty()||gender==null)
        {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
         else{
                 String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String userName = "SYSTEM";
            String password = "system";
            String query="insert into person (id, name, gender, dob,father,mother, state) values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt;
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection(url, userName, password);
                 stmt=con.prepareStatement(query);
                stmt.setString(1, ID.getText().trim());
                stmt.setString(2, NAME.getText().trim());
                stmt.setString(3, gender);
                stmt.setString(5, FID.getText().trim());
                stmt.setString(6, MID.getText().trim());
                stmt.setString(7, STATE.getText().trim());
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = formatter.parse((((JTextField)DOB.getDateEditor().getUiComponent()).getText().trim()));
                long mss =date.getTime();
                java.sql.Date sdate=new java.sql.Date(mss);
                stmt.setDate(4, sdate);
                stmt.executeUpdate();
            }
            catch(ClassNotFoundException | SQLException | ParseException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
         
         
         }
    }//GEN-LAST:event_DONEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(reg_birth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg_birth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg_birth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg_birth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reg_birth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JButton DONE;
    private javax.swing.JRadioButton FE;
    private javax.swing.JTextField FID;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton MA;
    private javax.swing.JTextField MID;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField STATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}