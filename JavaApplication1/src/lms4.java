/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khushboo
 */
public class lms4 extends javax.swing.JFrame {

    /**
     * Creates new form lms4
     */
    public lms4() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Self Assessment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 11, 96, -1));

        jLabel2.setText("Your Response:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 72, -1, -1));

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 72, 248, -1));

        jLabel3.setText("Evaluate for Criterion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 179, -1, -1));

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 176, 209, -1));

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 306, -1, -1));

        jButton2.setText("Prev");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 306, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rd1.setText("Option 1");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });
        jPanel1.add(rd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        rd2.setText("Option 2");
        jPanel1.add(rd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        rd3.setText("Option 3");
        jPanel1.add(rd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        rd4.setText("Option 4");
        rd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd4ActionPerformed(evt);
            }
        });
        jPanel1.add(rd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 23, -1, -1));

        rd5.setText("Option 5");
        rd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd5ActionPerformed(evt);
            }
        });
        jPanel1.add(rd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 49, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 207, 292, 92));

        jLabel4.setText("User:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 49, -1, -1));

        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 46, 248, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        lms3 frame=new lms3();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lms5 frame=new lms5();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd4ActionPerformed

    private void rd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        DataBase_Handler db=new DataBase_Handler();
        int r=db.count_no_of_students();
        for(int i=1;i<=r;i++)
            cb1.addItem(""+i);
        int c=Integer.parseInt((String)cb1.getSelectedItem());
        System.out.println(c);
        db.lms3_f(c,"course 1","sample prompt");
        db.lms3_f2(c,"course 1","sample prompt");
    }//GEN-LAST:event_formWindowOpened

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        DataBase_Handler db=new DataBase_Handler();
        db.lms3_f1(1,"course 1","sample prompt");
    }//GEN-LAST:event_cb2ActionPerformed

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
            java.util.logging.Logger.getLogger(lms4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lms4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lms4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lms4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lms4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cb1;
    public static javax.swing.JComboBox<String> cb2;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JRadioButton rd1;
    public static javax.swing.JRadioButton rd2;
    public static javax.swing.JRadioButton rd3;
    public static javax.swing.JRadioButton rd4;
    public static javax.swing.JRadioButton rd5;
    public static javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
