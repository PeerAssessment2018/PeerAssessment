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
        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        tf4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        points = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        no_of_option = new javax.swing.JSpinner();
        p21 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        n23 = new javax.swing.JButton();
        noc = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 725));

        jLabel1.setText("Rubrics");

        jLabel2.setText("Enter number of criteria for evaluation:");

        jLabel3.setText("Set details for Criterion:");

        cb1.setToolTipText("Select the criterion for which you would like to set the details.");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterion Details"));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 625));

        jLabel4.setText("Criterion Name:");

        jLabel5.setText("Criterion Prompt:");

        tf2.setToolTipText("Set the criterion name.");

        ta1.setColumns(20);
        ta1.setRows(5);
        ta1.setTabSize(0);
        ta1.setToolTipText("Describe the criterion, give details about it. Like criterion logic would be used for evaluating the reasoning behind the given response.");
        jScrollPane1.setViewportView(ta1);

        jLabel6.setText("Number of options:");

        jLabel7.setText("Set details for Option:");

        cb2.setToolTipText("Select the option for which you would like to set the details.");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Option Details"));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(254, 220));
        jPanel2.setPreferredSize(new java.awt.Dimension(254, 220));

        jLabel10.setText("Point");

        jLabel8.setText("Option Name:");

        ta2.setColumns(20);
        ta2.setLineWrap(true);
        ta2.setRows(5);
        ta2.setTabSize(0);
        ta2.setToolTipText("Describe the option. For example- excellent means that the answer was to the point and poor means the reasoning could not explain the answer.");
        ta2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ta2);

        tf4.setToolTipText("Enter option name");

        jLabel9.setText("Description:");

        jButton1.setText("Remove Option");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf4)
                        .addGap(79, 79, 79))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        no_of_option.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                no_of_optionStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
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
                            .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(no_of_option, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                    .addComponent(no_of_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p21.setText("Prev");
        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        n23.setText("Next");
        n23.setEnabled(false);
        n23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n23ActionPerformed(evt);
            }
        });

        noc.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nocStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(noc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(p21)
                .addGap(5, 5, 5)
                .addComponent(save)
                .addGap(3, 3, 3)
                .addComponent(n23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(noc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p21)
                    .addComponent(save)
                    .addComponent(n23)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    	
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
        int nc=(int)noc.getValue();
        String cname=tf2.getText()+" ";
        String cprompt=ta1.getText()+" ";
        int con=(int)no_of_option.getValue();
        String oname=tf4.getText()+" ";
        String course=(String)cms1.cb.getSelectedItem();
        String od=ta2.getText()+" ";
        int oscale=(int)points.getValue();
        DataBase_Handler app = new DataBase_Handler();
        System.out.println(cb1.getItemCount());
            if(cb2.getItemCount()==1)
            {
                app.insert_options_details_1(q,course,cname,oname,od,oscale);
                app.insert_question_details_2(cname,cprompt,con);
                cb2.removeItemAt(cb2.getSelectedIndex());
                cb1.removeItemAt(cb1.getSelectedIndex());
                //tf1.setText("");
                tf2.setText("");
                no_of_option.setValue(0);
                tf4.setText("");
                points.setValue(0);
                ta1.setText("");
                ta2.setText("");
            }
            else   
            {
                app.insert_options_details_1(q,course,cname,oname,od,oscale);
                cb2.removeItemAt(cb2.getSelectedIndex());
                tf4.setText("");
                points.setValue(0);
                ta2.setText("");
            }
            if(cb1.getItemCount()==0)
            {
                //app.insert_question_details_2(cname,cprompt,con);
                n23.setEnabled(true);
                //cb1.removeItemAt(cb1.getSelectedIndex());
                //tf1.setText("");
                tf2.setText("");
                no_of_option.setValue(0);
                tf4.setText("");
                points.setValue(0);
                ta1.setText("");
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

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void nocStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nocStateChanged
        // TODO add your handling code here
         int ic=cb1.getItemCount();
        for(int i=0;i<ic;i++)
        {
            cb1.removeItemAt(i);
        }
        int noc1=(int)noc.getValue();
        for(int i=0;i<noc1;i++)
        {
            cb1.addItem("Criterion "+(i+1));
        }
    }//GEN-LAST:event_nocStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tf4.setText("");
        ta2.setText("");
        points.setValue(0);
        int i=cb2.getSelectedIndex();
        cb2.removeItemAt(i);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void no_of_optionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_no_of_optionStateChanged
        // TODO add your handling code here:
         int ic=cb2.getItemCount();
        for(int i=0;i<ic;i++)
        {
            cb2.removeItemAt(i);
        }
        int noc1=(int)noc.getValue();
        for(int i=0;i<noc1;i++)
        {
            cb2.addItem("Option "+(i+1));
        }
    }//GEN-LAST:event_no_of_optionStateChanged

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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JSpinner no_of_option;
    private javax.swing.JSpinner noc;
    private javax.swing.JButton p21;
    private javax.swing.JSpinner points;
    private javax.swing.JButton save;
    public static javax.swing.JTextArea ta1;
    public static javax.swing.JTextArea ta2;
    public static javax.swing.JTextField tf2;
    public static javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
