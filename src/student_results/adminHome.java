/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_results;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author suraj
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public adminHome() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutBtn = new javax.swing.JButton();
        addStudentTab = new javax.swing.JButton();
        insertNewStudent = new javax.swing.JButton();
        allStudentsResults = new javax.swing.JButton();
        registeredStudents = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        selectBranch = new javax.swing.JComboBox<>();
        selectCourse = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        fatherNameField = new javax.swing.JTextField();
        rollNoField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        uploadBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(400, 100));
        setName("ADMIN_HOME"); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 200, 40));

        addStudentTab.setBackground(new java.awt.Color(221, 100, 10));
        addStudentTab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStudentTab.setForeground(new java.awt.Color(255, 255, 255));
        addStudentTab.setText("ADD NEW STUDENT");
        addStudentTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudentTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentTabActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, 50));

        insertNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertNewStudent.setForeground(new java.awt.Color(51, 51, 51));
        insertNewStudent.setText("INSERT NEW RESULT");
        insertNewStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewStudentActionPerformed(evt);
            }
        });
        getContentPane().add(insertNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 50));

        allStudentsResults.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allStudentsResults.setText("ALL STUDENTS RESULTS");
        allStudentsResults.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allStudentsResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentsResultsActionPerformed(evt);
            }
        });
        getContentPane().add(allStudentsResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 50));

        registeredStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registeredStudents.setText("REGISTERED STUDENTS");
        registeredStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registeredStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(registeredStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 50));

        jSeparator1.setBackground(new java.awt.Color(197, 195, 252));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jSeparator1.setDoubleBuffered(true);
        jSeparator1.setOpaque(true);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 550));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("FATHER NAME");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 120, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText(" COURSE");
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 80, 30));

        selectBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EEE", "CIVIL", "ECE", "MECH", "CSE" }));
        getContentPane().add(selectBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, 30));

        selectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.TECH", "B.E", "B.COM", "BSC" }));
        getContentPane().add(selectCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 90, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText(" BRANCH");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 80, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("ROLL NO.");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 140, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("NAME");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, 30));
        getContentPane().add(fatherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, 30));
        getContentPane().add(rollNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 160, 30));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 160, 30));

        uploadBtn.setBackground(new java.awt.Color(102, 153, 255));
        uploadBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadBtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadBtn.setText("UPLOAD");
        uploadBtn.setBorder(null);
        uploadBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });
        getContentPane().add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        new adminLogin().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addStudentTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStudentTabActionPerformed

    private void insertNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewStudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new insertNewStudent().setVisible(true);
    }//GEN-LAST:event_insertNewStudentActionPerformed

    private void allStudentsResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentsResultsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new allStudentsResults().setVisible(true);
    }//GEN-LAST:event_allStudentsResultsActionPerformed

    private void registeredStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_registeredStudentsActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:        
        try {
            connectSql();
        } catch (SQLException ex) {
            Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentTab;
    private javax.swing.JButton allStudentsResults;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JButton insertNewStudent;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton registeredStudents;
    private javax.swing.JTextField rollNoField;
    private javax.swing.JComboBox<String> selectBranch;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables

    private void connectSql() throws SQLException {
        String course = (String) selectCourse.getSelectedItem();
        String branch = (String) selectBranch.getSelectedItem();
        String rollNo = (String)rollNoField.getText();
        int rollnoParsed;
        String studentName = (String)nameField.getText();
        String fatherName = (String)fatherNameField.getText();
        
        if(rollNo.length()==0 || studentName.length()==0 || fatherName.length()==0) {
             JOptionPane.showMessageDialog(null,  "Please Enter All Values");
        }
        else {
            rollnoParsed = Integer.parseInt(rollNo); 
            //Insert data to SQL
            java.sql.Connection conn = null;
            ResultSet result = null;
            String databaseName = "StudentsResults";
            String url = "jdbc:mysql://localhost:3306/" + databaseName;
            String user = "root";
            String password = "database@MySql";
            String myDriver = "com.mysql.jdbc.Driver";
            try {
                  //Initialize Sqldriver instance 
                  Class.forName(myDriver);
                  
                  // Creating the connection providing URL and username password
                  conn =  DriverManager.getConnection(url, user, password);
                  
                  Statement st = conn.createStatement();
                  String insertData = "INSERT INTO Students"
                          + "( course, branch, rollNo, studentName, fatherName) "
                          + "VALUES ( " +course+ ',' +branch+ ','  +rollNo+ ',' +studentName+ ',' +fatherName +")";
                  st.executeUpdate(insertData);
                  JOptionPane.showMessageDialog(null,  "Successfully inserted to database");
                  this.setVisible(false);
                  new adminHome().setVisible(true);
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(adminHome.class.getName()).log(Level.SEVERE, null, ex);
            }          
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }        
    }
}
