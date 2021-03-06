/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Aswin
 */
public class addPerson extends javax.swing.JFrame {

    /**
     * Creates new form addPerson
     */
    
    public addPerson() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        father = new javax.swing.JTextField();
        mother = new javax.swing.JTextField();
        qualification = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        mrad = new javax.swing.JRadioButton();
        frad = new javax.swing.JRadioButton();
        trad = new javax.swing.JRadioButton();
        marriedrad = new javax.swing.JRadioButton();
        unmarriedrad = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PERSON ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 39, -1, -1));

        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 74, -1, -1));

        jLabel3.setText("GENDER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 113, -1, -1));

        jLabel4.setText("DOB");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 150, -1, -1));

        jLabel5.setText("MARTIAL STATUS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 191, -1, 16));

        jLabel6.setText("FATHER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 232, -1, -1));

        jLabel7.setText("MOTHER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 270, -1, -1));

        jLabel8.setText("QUALIFICATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 318, -1, -1));

        jLabel9.setText("STATE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 353, -1, -1));

        jLabel10.setText("STATUS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 388, -1, -1));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 33, 110, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 71, 110, -1));
        getContentPane().add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 229, 110, -1));
        getContentPane().add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 267, 110, -1));
        getContentPane().add(qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 315, 110, -1));

        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 347, 110, -1));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 385, 110, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 423, -1, -1));

        dob.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 180, -1));

        buttonGroup1.add(mrad);
        mrad.setText("Male");
        getContentPane().add(mrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 109, -1, -1));

        buttonGroup1.add(frad);
        frad.setText("Female");
        frad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fradActionPerformed(evt);
            }
        });
        getContentPane().add(frad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        buttonGroup1.add(trad);
        trad.setText("Trangender");
        trad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tradActionPerformed(evt);
            }
        });
        getContentPane().add(trad, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 109, -1, -1));

        buttonGroup2.add(marriedrad);
        marriedrad.setText("Married");
        getContentPane().add(marriedrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 188, -1, -1));

        buttonGroup2.add(unmarriedrad);
        unmarriedrad.setText("Unmarried");
        unmarriedrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unmarriedradActionPerformed(evt);
            }
        });
        getContentPane().add(unmarriedrad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/ds.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -90, 940, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String gender=null;
        if(mrad.isSelected())
            gender="m";
        else if(frad.isSelected())
            gender="f";
        else if(trad.isSelected())
            gender="t";
        String ms=null;
        if(marriedrad.isSelected())
            ms="m";
        else if(unmarriedrad.isSelected())
            ms="u";
        if(pid.getText().isEmpty()||pname.getText().isEmpty()||ms==null||((JTextField)dob.getDateEditor().getUiComponent()).getText().isEmpty()||qualification.getText().isEmpty()||state.getText().isEmpty()||status.getText().isEmpty()||gender==null)
        {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
        else
        {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
            String userName = "SYSTEM";
            String password = "sys";
            String query;
            PreparedStatement stmt;
            
            

            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection(url, userName, password);
                
                
                if(father.getText().isEmpty()&&mother.getText().isEmpty())
                {
                    query="insert into person (id, name, gender, dob, marital_status, qualification, state, status) values(?, ?, ?, ?, ?, ?, ?, ?)";
                    stmt=con.prepareStatement(query);
                    stmt.setString(6, qualification.getText().trim());
                    stmt.setString(7, state.getText().trim());
                    stmt.setInt(8, Integer.parseInt(status.getText().trim()));
                    
                }
                else if(father.getText().isEmpty())
                {
                    query="insert into person (id, name, gender, dob, martial_status, mother, qualification, state, status) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    stmt=con.prepareStatement(query);
                    stmt.setString(6, mother.getText().trim());
                    stmt.setString(7, qualification.getText().trim());
                    stmt.setString(8, state.getText().trim());
                    stmt.setInt(9, Integer.parseInt(status.getText().trim()));
                }
                else if(mother.getText().isEmpty())
                {
                    query="insert into person (id, name, gender, dob, martial_status, father, qualification, state, status) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    stmt=con.prepareStatement(query);
                    stmt.setString(6, father.getText().trim());
                    stmt.setString(7, qualification.getText().trim());
                    stmt.setString(8, state.getText().trim());
                    stmt.setInt(9, Integer.parseInt(status.getText().trim()));
                }
                else
                {
                    query="insert into person (id, name, gender, dob, martial_status, father, mother, qulaification, state, status) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    stmt=con.prepareStatement(query);
                    stmt.setString(6, father.getText().trim());
                    stmt.setString(7, mother.getText().trim());
                    stmt.setString(8, qualification.getText().trim());
                    stmt.setString(9, state.getText().trim());
                    stmt.setInt(10, Integer.parseInt(status.getText().trim()));
                
                }
                stmt.setString(1, pid.getText().trim());
                stmt.setString(2, pname.getText().trim());
                stmt.setString(3, gender);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = formatter.parse((((JTextField)dob.getDateEditor().getUiComponent()).getText().trim()));
                long mss =date.getTime();
                java.sql.Date sdate=new java.sql.Date(mss);
                stmt.setDate(4, sdate);
                stmt.setString(5, ms);
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "new person added");
                con.close();
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fradActionPerformed

    private void tradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tradActionPerformed

    private void unmarriedradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unmarriedradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unmarriedradActionPerformed

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
            java.util.logging.Logger.getLogger(addPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField father;
    private javax.swing.JRadioButton frad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton marriedrad;
    private javax.swing.JTextField mother;
    private javax.swing.JRadioButton mrad;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField qualification;
    private javax.swing.JTextField state;
    private javax.swing.JTextField status;
    private javax.swing.JRadioButton trad;
    private javax.swing.JRadioButton unmarriedrad;
    // End of variables declaration//GEN-END:variables
}
