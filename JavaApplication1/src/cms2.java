/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khushboo
 */
public class cms2 extends javax.swing.JFrame {

	
	
    public cms2() {
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
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        tf4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        p21 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        n23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 725));
        setPreferredSize(new java.awt.Dimension(430, 725));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Rubrics");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setText("Enter number of criteria for evaluation:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 90, -1));

        jLabel3.setText("Set details for Criterion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 90, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterion Details"));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 625));

        jLabel4.setText("Criterion Name:");

        jLabel5.setText("Criterion Prompt:");

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        jLabel6.setText("Number of options:");

        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Set details for Option:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Option Details"));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(254, 220));
        jPanel2.setPreferredSize(new java.awt.Dimension(254, 220));

        jLabel10.setText("Scale:");

        jLabel8.setText("Option Name:");

        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        jLabel9.setText("Description:");

        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf5)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tf2))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf3)
                                .addGap(69, 69, 69))
                            .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, 490));

        p21.setText("Prev");
        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });
        getContentPane().add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, -1, -1));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, -1, -1));

        n23.setText("Next");
        n23.setEnabled(false);
        n23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n23ActionPerformed(evt);
            }
        });
        getContentPane().add(n23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    	
    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
        int ic=cb2.getItemCount();
        for(int i=0;i<ic;i++)
        {
            cb2.removeItemAt(i);
        }
        int noc=Integer.parseInt(tf3.getText());
        for(int i=0;i<noc;i++)
        {
            cb2.addItem("Option "+(i+1));
        }
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void n23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n23ActionPerformed
        // TODO add your handling code here:
        cms3 frame=new cms3();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_n23ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
        // TODO add your handling code here:
        cms1 frame=new cms1();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_p21ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String q=cms1.prompt.getText()+" ";
        int nc=Integer.parseInt(tf1.getText())+0;
        String cname=tf2.getText()+" ";
        String cprompt=ta1.getText()+" ";
        int con=Integer.parseInt(tf3.getText())+0;
        String oname=tf4.getText()+" ";
        String od=ta2.getText()+" ";
        int oscale=Integer.parseInt(tf5.getText())+0;
        DataBase_Handler app = new DataBase_Handler();
        
        app.insert_question_details_2(cname,cprompt,con);
        if(cb1.getItemCount()==0)
        {
            
            n23.setEnabled(true);
            //cb1.removeItemAt(cb1.getSelectedIndex());
            //tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            ta1.setText("");
            ta2.setText("");
        }
        
            if(cb2.getItemCount()==1)
            {
                app.insert_options_details_1(q,"course1",cname,oname,od,oscale);
                cb2.removeItemAt(cb2.getSelectedIndex());
                cb1.removeItemAt(cb1.getSelectedIndex());
                //tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                ta1.setText("");
                ta2.setText("");
            }
            else   
            {
                app.insert_options_details_1(q,"course1",cname,oname,od,oscale);
                cb2.removeItemAt(cb2.getSelectedIndex());
                tf4.setText("");
                tf5.setText("");
                ta2.setText("");
            }
        
        /*if(cb1.getItemCount()==0)
        {
            n23.setEnabled(true);
        }
        else
        {
            int nc=Integer.parseInt(tf1.getText());
            String cname[]=new String[nc];
            String cprompt[]=new String[nc];
            int con[]=new int[nc];
            String oname[][]=new String[nc][];
            String odesc[][]=new String[nc][];
            int oscale[][]=new int[nc][];
            while(cb1.getItemCount()!=0)
            {
                int i=cb2.getSelectedIndex();
                cname[i]=tf2.getText();
                cprompt[i]=ta1.getText();
                con[i]=Integer.parseInt(tf3.getText());
                oname[i]=new String[con[i]];
                odesc[i]=new String[con[i]];
                oscale[i]=new int[con[i]];
                if(cb2.getItemCount()==0)
                {
                    tf2.setText("");
                    ta1.setText("");
                    tf3.setText("");
                    cb1.removeItemAt(i);
                }
                else
                {
                    while(cb2.getItemCount()!=0)
                    {
                        System.out.println(cb2.getItemCount());
                        int j=cb2.getSelectedIndex();
                        oname[i][j]=tf4.getText();
                        odesc[i][j]=ta2.getText();
                        oscale[i][j]=Integer.parseInt(tf5.getText());
                        tf4.setText("");
                        ta2.setText("");
                        tf5.setText("");
                        cb2.removeItemAt(j);
                    }
                }
            }
            String q=cms1.prompt.getText();
            //Fetch criterion name,prompt and number of options
            for(int i=0;i<nc;i++)
            {
                DBHandler_cms2 app = new DBHandler_cms2();
                app.insert_question_details_1(cname[i],cprompt[i],con[i]);
                for(int j=0;j<con[i];j++)
                {
                   // DBHandler_cms2 app1 = new DBHandler_cms2();
                    //app1.insert_options_details_1(q,"course 1",cname[i],oname[i][j],odesc[i][j],oscale[i][j]);
                }
            }
            //Now store the above details into database
            //After storing details clear text fields
        }*/
    }//GEN-LAST:event_saveActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
        int ic=cb1.getItemCount();
        for(int i=0;i<ic;i++)
        {
            cb1.removeItemAt(i);
        }
        int noc=Integer.parseInt(tf1.getText());
        for(int i=0;i<noc;i++)
        {
            cb1.addItem("Criterion "+(i+1));
        }
    }//GEN-LAST:event_tf1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       // DBDemo app = new DBDemo();
	//	app.run();
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
            java.util.logging.Logger.getLogger(cms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cms2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cb1;
    public static javax.swing.JComboBox<String> cb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton n23;
    private javax.swing.JButton p21;
    private javax.swing.JButton save;
    public static javax.swing.JTextArea ta1;
    public static javax.swing.JTextArea ta2;
    public static javax.swing.JTextField tf1;
    public static javax.swing.JTextField tf2;
    public static javax.swing.JTextField tf3;
    public static javax.swing.JTextField tf4;
    public static javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
