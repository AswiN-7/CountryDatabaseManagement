/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Aswin
 */
public class analytics extends javax.swing.JFrame {

    /**
     * Creates new form annalytics
     */
    String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
    String userName = "SYSTEM";
    String password = "sys";
    String[] faaList =new String[8];
    
    public analytics() {
        initComponents();      
        faaList[0]="how many people are pesent in this country";
        faaList[1]="how states are present in this country";
        faaList[2]="how many males present";
        faaList[3]="how many females present";
        faaList[4]="until now how many presons lived in this country";
        faaList[5]="state with max population";
        faaList[6]="state with min population";
        faaList[7]="people died in this country";
        faacombo.setModel(new javax.swing.DefaultComboBoxModel<>(faaList));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JLabel();
        faacombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        result2 = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini_project/ds2.png"))); // NOI18N
        result.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faacombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        faacombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(faacombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 460, 35));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setText("ANALYSIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        result2.setText("jLabel2");
        getContentPane().add(result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 386, 100, 30));

        ans.setBackground(new java.awt.Color(153, 255, 255));
        ans.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        ans.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 476, 350, 40));

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        result2.setText(null);
        int faaIndex=faacombo.getSelectedIndex();
        System.out.println(faaIndex);
         try
         {
            Connection con = DriverManager.getConnection(url, userName, password);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String query;
            if(faaIndex==0)
            {
               query ="select count(*) from person where status=1";
            }
            else if(faaIndex==1)
            {
                query="select count(*) from state";
            }
            else if(faaIndex==2)
            {
                query="select count(*) from person where gender='m' and status=1";
            }
            else if(faaIndex==3)
            {
                query="select count(*) from person where gender='f' and status=1";
            }
            else if(faaIndex==4)
            {
                query ="select count(*) from person";
            }
            else if(faaIndex==5)
            {
                query="select population, state_id  from state where population=(select max(population) from state)";
            }
            else if(faaIndex==6)
            {
                query="select population, state_id  from state where population=(select min(population) from state)";
            }
            else
            {
                query ="select count(*) from person where status=3";
            }
            ResultSet rs;
            Statement stmt;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            //ans.setSize(5, faaList[faaIndex].length());
            result.setText(faaList[faaIndex]);
            result.setText(rs.getString(1));
            if(faaIndex==5||faaIndex==6)
                result2.setText(rs.getString(2));
            //System.out.println(count);
            con.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(analytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analytics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans;
    private javax.swing.JComboBox<String> faacombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel result;
    private javax.swing.JLabel result2;
    // End of variables declaration//GEN-END:variables
}
