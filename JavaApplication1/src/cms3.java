
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khushboo
 */
public class cms3 extends javax.swing.JFrame {

    ArrayList<String> options = new ArrayList<String>();
    ArrayList<String> options_description = new ArrayList<String>();
    ArrayList<Integer> options_points = new ArrayList<Integer>();
   
    /**
     * Creates new form cms3
     */
    public cms3() {
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
        cb1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        ans_of = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        no_of_ans = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STEP 3 OF 3");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Set Details for Sample Answer");

        jLabel2.setText("How many answers would you like to set?");

        jLabel3.setText("Set Sample:");

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Answer Details"));

        jLabel4.setText("Set Answer");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel5.setText("Set Answers for Criterion:");

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        buttonGroup1.add(rd1);
        rd1.setText("Option 1");

        buttonGroup1.add(rd2);
        rd2.setText("Option 2");

        buttonGroup1.add(rd3);
        rd3.setText("Option 3");

        buttonGroup1.add(rd4);
        rd4.setText("Option 4");

        buttonGroup1.add(rd5);
        rd5.setText("Option 5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rd3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rd2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rd5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rd4)))
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd1)
                    .addComponent(rd4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd2)
                    .addComponent(rd5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd3))
        );

        jButton1.setText("Remove Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ans_of)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ans_of))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        no_of_ans.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                no_of_ansStateChanged(evt);
            }
        });

        jLabel6.setText("Please press submit button after filling details for each sample answer.");

        jLabel7.setText("Once submit is pressed no more changes will be allowed.");

        jLabel8.setText("So please carefully fill in the details.");

        jButton2.setText("Prev");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit option for a particular criteria");

        jButton5.setText("Edit criteria");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(40, 40, 40))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb1, 0, 84, Short.MAX_VALUE)
                                    .addComponent(no_of_ans)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(no_of_ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       // end.setEnabled(false);
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        
        String course_id = author_temp.course_id;
        String question=author_temp.question_id;
        
        DataBase_Handler db=new DataBase_Handler();
        ArrayList<String> criterias = db.r_lms3_f(author_temp.author_id,course_id, question);
        for(int i=0;i<criterias.size();i++)
        {
            cb2.addItem(criterias.get(i));
        }
       // System.out.println("**********" + criterias);
    }//GEN-LAST:event_formWindowOpened

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
       // DataBase_Handler db=new DataBase_Handler();\
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        String cri_id=(String)cb2.getSelectedItem();
        String course_id=(String) cms1.cb.getSelectedItem();
        String question_id=cms1.prompt.getText();
        DataBase_Handler db=new DataBase_Handler();
        options = db.r_lms3_f1(author_temp.author_id,author_temp.course_id,author_temp.question_id,cri_id);
        options_description = db.r2_lms3_f1(author_temp.author_id,author_temp.course_id,author_temp.question_id,cri_id);
        options_points = db.r3_lms3_f1(author_temp.author_id,author_temp.course_id,author_temp.question_id,cri_id);
        
         switch (options.size()) {
             case 1:
                 //add options_description and points in each
                 rd1.setVisible(true);
                 rd1.setText(options.get(0));
                 break;
             case 2:
                 rd1.setVisible(true);
                 rd1.setText(options.get(0));
                 rd2.setVisible(true);
                 rd2.setText(options.get(1));
                 break;
             case 3:
                 rd1.setVisible(true);
                 rd1.setText(options.get(0));
                 rd2.setVisible(true);
                 rd2.setText(options.get(1));
                 rd3.setVisible(true);
                 rd3.setText(options.get(2));
                 break;
             case 4:
                 rd1.setVisible(true);
                 rd1.setText(options.get(0));
                 rd2.setVisible(true);
                 rd2.setText(options.get(1));
                 rd3.setVisible(true);
                 rd3.setText(options.get(2));
                 rd4.setVisible(true);
                 rd4.setText(options.get(3));
                 break;
             case 5:
                 rd1.setVisible(true);
                 rd1.setText(options.get(0));
                 rd2.setVisible(true);
                 rd2.setText(options.get(1));
                 rd3.setVisible(true);
                 rd3.setText(options.get(2));
                 rd4.setVisible(true);
                 rd4.setText(options.get(3));
                 rd5.setVisible(true);
                 rd5.setText(options.get(4));
                 break;
             default:
                 break;
         }
    }//GEN-LAST:event_cb2ActionPerformed

    private void no_of_ansStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_no_of_ansStateChanged
        // TODO add your handling code here:
        cb1.removeAllItems();
        int nosa = (int)(no_of_ans.getValue());
        for(int i = 1; i <= nosa ; i++)
           cb1.addItem("Answer " + i);
        String q_id=author_temp.question_id;
        String course_id = author_temp.course_id;
      //  int noa=(int)no_of_ans.getValue();
        ans_of.setText("Sample Answer 1 of "+nosa);
        DataBase_Handler db=new DataBase_Handler();
        db.set_no_of_sample_answers(nosa, course_id, q_id);
    }//GEN-LAST:event_no_of_ansStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int assessor_id=author_temp.author_id;
        String sample_ans=ta.getText();
        int nosa=(int)no_of_ans.getValue();
        String q_id=author_temp.question_id;
        String course_id = author_temp.course_id;
        StringTokenizer option=new StringTokenizer(""); 
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        if(rd1.isSelected()==true)
            option=new StringTokenizer(rd1.getText()+" " + options_description.get(0)+" " + options_points.get(0));
        else if(rd2.isSelected()==true)
            option=new StringTokenizer(rd2.getText()+" " + options_description.get(1)+" " + options_points.get(1));
        else if(rd3.isSelected()==true)
            option=new StringTokenizer(rd3.getText()+" " + options_description.get(2)+" " + options_points.get(2));
        else if(rd4.isSelected()==true)
            option=new StringTokenizer(rd4.getText()+" " + options_description.get(3)+" " + options_points.get(3));
        else if(rd5.isSelected()==true)
            option=new StringTokenizer(rd5.getText()+" " + options_description.get(3)+" " + options_points.get(4));
        String s1=option.nextToken();
        String s2=option.nextToken();
        int points=Integer.parseInt(option.nextToken());
        DataBase_Handler db=new DataBase_Handler();
        if(cb1.getItemCount()==0)
        {
            JOptionPane.showMessageDialog(null,"Your responses have been submitted successfully! You won't be able to make any further changes.");
            System.exit(0);
        }
        if(cb2.getItemCount()==0)
        {
            cb1.removeItemAt(cb1.getSelectedIndex());
            ans_of.setText("Sample Answer "+(nosa-cb1.getItemCount()+1)+" of "+nosa);
        }
        else
        {
            String cri=(String)cb2.getSelectedItem();
            db.set_sample_answer_details(assessor_id, course_id, q_id, sample_ans, cri,s1);
            JOptionPane.showMessageDialog(null,"Your sample answer has been submitted successfully.");
            ta.setText("");
            cb2.removeItemAt(cb2.getSelectedIndex());
            rd1.setVisible(false);
            rd2.setVisible(false);
            rd3.setVisible(false);
            rd4.setVisible(false);
            rd5.setVisible(false);
        }
        if(cb1.getItemCount()==0)
        {
            jButton3.setText("Submit");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        cb2.removeAllItems();
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        
        String course_id = author_temp.course_id;
        String question=author_temp.question_id;
        
        DataBase_Handler db=new DataBase_Handler();
        ArrayList<String> criterias = db.r_lms3_f(author_temp.author_id,course_id, question);
        for(int i=0;i<criterias.size();i++)
        {
            cb2.addItem(criterias.get(i));
            //System.out.println(criterias);
        }
      //  System.out.println("**********" + criterias);
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ta.setText("");
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        cb2.removeAllItems();
        cb1.removeItemAt(cb1.getSelectedIndex());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO ahdd your handling code;
        DataBase_Handler db=new DataBase_Handler();
        int res = JOptionPane.showConfirmDialog(null, "Are you want to reset all your rubrics data? ", "", JOptionPane.YES_NO_OPTION);
        switch (res) {
            case JOptionPane.YES_OPTION:
            db.prev_called_from_cms3(author_temp.course_id,author_temp.question_id);
            JOptionPane.showMessageDialog(null,"Data reset! Now you can re-enter your data.");
            author_temp.flag=1;
            author_temp.cms2.setVisible(true);
            author_temp.cms3.setVisible(false);
            break;
            case JOptionPane.NO_OPTION:
            JOptionPane.showMessageDialog(null, "Data reset canceled!");
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cms_edit_criteria f=new cms_edit_criteria();
        f.setVisible(true);
        author_temp.cms3.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        cb2.removeAllItems();
        String course_id = author_temp.course_id;
        String question=author_temp.question_id;
        
        DataBase_Handler db=new DataBase_Handler();
        ArrayList<String> criterias = db.r_lms3_f(author_temp.author_id,course_id, question);
        for(int i=0;i<criterias.size();i++)
        {
            cb2.addItem(criterias.get(i));
        }
    
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(cms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cms3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans_of;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JComboBox<String> cb1;
    public static javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JSpinner no_of_ans;
    public static javax.swing.JRadioButton rd1;
    public static javax.swing.JRadioButton rd2;
    public static javax.swing.JRadioButton rd3;
    public static javax.swing.JRadioButton rd4;
    public static javax.swing.JRadioButton rd5;
    public static javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
