/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aswin
 */
public class displayPerson extends javax.swing.JFrame {

    /**
     * Creates new form displayPerson
     */
    String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
    String userName = "SYSTEM";
    String password = "sys";
    public displayPerson() {
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

        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ms = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        father = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mother = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        searchBotton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("MARTIAL STATUS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 250, 30));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("FATHER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 180, -1));
        getContentPane().add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("MOTHER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 150, -1));
        getContentPane().add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("QUALIFICATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 220, -1));
        getContentPane().add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("STATE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 200, -1));
        getContentPane().add(qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("STATUS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 190, -1));

        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 110, 30));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 110, 30));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 57, 110, 30));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 105, 110, 30));

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("PERSON ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("GENDER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("DOB");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("person id");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 150, 70));
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 131, 40));

        searchBotton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        searchBotton.setText("search");
        searchBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBottonActionPerformed(evt);
            }
        });
        getContentPane().add(searchBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/black.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void searchBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBottonActionPerformed
        // TODO add your handling code here:
         if(search.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "enter state id");
        }
        else
        {
            try {
                Connection con = DriverManager.getConnection(url, userName, password);
                Class.forName("oracle.jdbc.driver.OracleDriver");
                //String query="select * from person where id= '"+search.getText().trim()+"' ";
                String query="select * from person";
                ResultSet rs;
                Statement stmt;
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.next())
                {
                    pid.setText(rs.getString(1));
                    pname.setText(rs.getString(2));
                    gender.setText(rs.getString(3));
                    java.util.Date date =rs.getObject(4, Date.class);
                    dob.setText(date.toString());
                    ms.setText(rs.getString(5));
                    father.setText(rs.getString(6));
                    mother.setText(rs.getString(7));
                    qualification.setText(rs.getString(8));
                    state.setText(rs.getString(9));
                    status.setText(rs.getString(10));
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "person id is not present");
                }
                con.close();
                
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_searchBottonActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

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
            java.util.logging.Logger.getLogger(displayPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dob;
    private javax.swing.JTextField father;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mother;
    private javax.swing.JTextField ms;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField qualification;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchBotton;
    private javax.swing.JTextField state;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
