/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_results;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author suraj
 */
public class allStudentsResults extends javax.swing.JFrame {

    /**
     * Creates new form allStudents
     */
    public allStudentsResults() {
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

        addStudentTab = new javax.swing.JButton();
        insertNewResult = new javax.swing.JButton();
        registeredStudents = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addStudentTab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStudentTab.setText("ADD NEW STUDENT");
        addStudentTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentTabActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, 50));

        insertNewResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertNewResult.setForeground(new java.awt.Color(51, 51, 51));
        insertNewResult.setText("INSERT NEW RESULT");
        insertNewResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertNewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewResultActionPerformed(evt);
            }
        });
        getContentPane().add(insertNewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 50));

        registeredStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registeredStudents.setText("REGISTERED STUDENTS");
        registeredStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registeredStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(registeredStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 50));

        jButton5.setBackground(new java.awt.Color(221, 100, 10));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("ALL STUDENTS RESULTS");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 50));

        logoutBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 200, 40));

        jSeparator1.setBackground(new java.awt.Color(197, 195, 252));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jSeparator1.setDoubleBuffered(true);
        jSeparator1.setOpaque(true);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 550));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 460, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentTabActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new adminHome().setVisible(true);
    }//GEN-LAST:event_addStudentTabActionPerformed

    private void insertNewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewResultActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new insertNewStudent().setVisible(true);
    }//GEN-LAST:event_insertNewResultActionPerformed

    private void registeredStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_registeredStudentsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        String databaseName = "StudentsResults";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        String user = "root";
        String password = "database@MySql";
        String myDriver = "com.mysql.jdbc.Driver";
        try {
             //Insert data to SQL
                    java.sql.Connection conn = null;
                    ResultSet result = null;
                   //Initialize Sqldriver instance 
                  Class.forName(myDriver);
                  
                  // Creating the connection providing URL and username password
                  conn =  DriverManager.getConnection(url, user, password);
                  Statement st = conn.createStatement();
                  result = st.executeQuery("SELECT * FROM StudentResults");
                  jTable1.setModel(DbUtils.resultSetToTableModel(result));
        }
        catch(Exception e) {
                        JOptionPane.showMessageDialog(null,  "Connection Issue");              
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        new adminLogin().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

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
            java.util.logging.Logger.getLogger(allStudentsResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allStudentsResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allStudentsResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allStudentsResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allStudentsResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentTab;
    private javax.swing.JButton insertNewResult;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton registeredStudents;
    // End of variables declaration//GEN-END:variables
}
