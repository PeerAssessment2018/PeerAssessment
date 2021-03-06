
import java.util.ArrayList;
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
public class lms2 extends javax.swing.JFrame {
    public static int count = 0;
    ArrayList<String> sample_answers = new ArrayList<String>();
    ArrayList<String> options = new ArrayList<String>();
    ArrayList<String> correct_option = new ArrayList<String>();
    ArrayList<String> criteria = new ArrayList<String>();
    
    /**
     * Creates new form lms2
     */
    public lms2() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STEP 2 OF 5");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Learning to assess Response");

        jLabel2.setText("Prompt:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("This is the question.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jTextArea1.setNextFocusableComponent(jTextArea2);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("Write your answer here.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("Answer:");

        jLabel4.setText("Evaluate for Criterion:");

        jComboBox1.setToolTipText("Select criterion for which you would like to give the answer.");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        buttonGroup1.add(rd1);
        rd1.setText("Option 1");

        buttonGroup1.add(rd2);
        rd2.setText("Option 2");
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd3);
        rd3.setText("Option 3");

        buttonGroup1.add(rd4);
        rd4.setText("Option 4");

        buttonGroup1.add(rd5);
        rd5.setText("Option 5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd1)
                    .addComponent(rd2)
                    .addComponent(rd3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd5)
                    .addComponent(rd4))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd1)
                    .addComponent(rd4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rd2)
                    .addComponent(rd5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*lms3 frame=new lms3();
        
        frame.setVisible(true);
        this.setVisible(false);*/
        
        //System.out.println(correct_option);
        for(int i=0;i<criteria.size();i++)
        {
            if((String)jComboBox1.getSelectedItem()==criteria.get(i))
            {
                if((correct_option.get(i).trim().equals("1")&& rd1.isSelected())||(correct_option.get(i).trim().equals("2")&&rd2.isSelected())||(correct_option.get(i).trim().equals("3")&&rd3.isSelected())||(correct_option.get(i).trim().equals("4")&&rd4.isSelected())||(correct_option.get(i).trim().equals("5")&&rd5.isSelected()))
                {
                    if(jComboBox1.getItemCount()==1)
                    {
                        count++;
                        jComboBox1.removeAllItems();
                        initialize();
                        System.out.println(count + "    if Worked");
                        break;
                    }
                    else
                    {
                        System.out.println(count + "    else Worked");
                        jComboBox1.removeItem(criteria.get(i));
                        break;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Retry, the option selected is not correct.");
                }         
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       DataBase_Handler db = new DataBase_Handler();
        if(db.learnt_to_assess(student_temp.user_id,student_temp.question_id,student_temp.course_id))
        {
            lms3 frame=new lms3();
            frame.setVisible(true);
            this.setVisible(false);
        }
        else
        initialize();
        
    }//GEN-LAST:event_formWindowOpened

    public void initialize()
    {
         DataBase_Handler db = new DataBase_Handler();
        if(db.get_no_of_sample_answers(student_temp.course_id , student_temp.question_id)>count)
        {
            jTextArea1.setText(student_temp.question_id);
            sample_answers=db.get_sample_answers(student_temp.course_id, student_temp.question_id);
            //correct_option=db.get_correct_option(student_temp.course_id, student_temp.question_id);
            //criteria=db.get_sample_criteria(student_temp.course_id, student_temp.question_id);
            System.out.println("SIZE  " + sample_answers.size());
            jTextArea2.setText(sample_answers.get(count));
            criteria=db.get_sample_criteria(student_temp.course_id, student_temp.question_id,sample_answers.get(count));
            correct_option=db.get_correct_option(student_temp.course_id, student_temp.question_id,sample_answers.get(count));
            for(int i =0 ; i<criteria.size();i++)
            {
                jComboBox1.addItem(criteria.get(i));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Step 2 Completed!");
            lms3 frame=new lms3();
            frame.setVisible(true);
            this.setVisible(false);
        }
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getItemCount()==0)
        {
            System.out.println(jComboBox1.getItemCount());
            return;
        }
        
        DataBase_Handler db = new DataBase_Handler();
        options = db.r_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id,(String)jComboBox1.getSelectedItem());
 
        int x=jComboBox1.getSelectedIndex();
        System.out.println(correct_option.get(x));
        for(int i=0; i<options.size();i++)
        {
            System.out.println(options.get(i));
            if(options.get(i).trim().equals(correct_option.get(x).trim()))
            {
                correct_option.set(x++,(String.valueOf(i+1)));
            }
        }
        
            if(options.size()==1)
            {
                //add options_description and points in each
                rd1.setVisible(true);
                rd1.setText(options.get(0));
                rd2.setVisible(false);
                rd3.setVisible(false);
                rd4.setVisible(false);
                rd5.setVisible(false);
                
            }
            else if(options.size()==2)
            {
                rd1.setVisible(true);
                rd1.setText(options.get(0));
                rd2.setVisible(true);
                rd2.setText(options.get(1));
                rd3.setVisible(false);
                rd4.setVisible(false);
                rd5.setVisible(false);
            }
            else if(options.size()==3)
            {
                rd1.setVisible(true);
                rd1.setText(options.get(0));
                rd2.setVisible(true);
                rd2.setText(options.get(1));
                rd3.setVisible(true);
                rd3.setText(options.get(2));
                rd4.setVisible(false);
                rd5.setVisible(false);
            }
            else if(options.size()==4)
            {
                rd1.setVisible(true);
                rd1.setText(options.get(0));
                rd2.setVisible(true);
                rd2.setText(options.get(1));
                rd3.setVisible(true);
                rd3.setText(options.get(2));
                rd4.setVisible(true);
                rd4.setText(options.get(3));
                rd5.setVisible(false);
            }
            else if(options.size()==5)
            {
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
            }
            else
            {
                lms3 f = new lms3();
                f.setVisible(true);
                this.setVisible(false);
            }  
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(lms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lms2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lms2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd4;
    private javax.swing.JRadioButton rd5;
    // End of variables declaration//GEN-END:variables
}
