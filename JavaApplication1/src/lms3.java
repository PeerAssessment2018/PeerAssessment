
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khushboo
 */
public class lms3 extends javax.swing.JFrame {

    /*
     * Creates new form lms3
    options
    options
    
     */
    
    ArrayList<String> options = new ArrayList<String>();
    ArrayList<String> options_description = new ArrayList<String>();
    ArrayList<Integer> options_points = new ArrayList<Integer>();
            
     private String data[] = new String[2];
     ArrayList<String> criterias_list = new ArrayList<String>();
     ArrayList<Integer> points_list = new ArrayList<Integer>();
     boolean check_if_submitted;
     //private int user_id;
    
    public lms3() 
    {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        n34 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Peer Assessment");

        jLabel2.setText("Assessing for:");

        jLabel3.setText("Peer's Response:");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel4.setText("Evaluate for Criterion:");

        cb3.setEditable(true);
        cb3.setToolTipText("jkfhsdkjfh");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rd1);
        rd1.setText("Option 1");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });
        jPanel1.add(rd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        buttonGroup1.add(rd2);
        rd2.setText("Option 2");
        jPanel1.add(rd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        buttonGroup1.add(rd3);
        rd3.setText("Option 3");
        jPanel1.add(rd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        buttonGroup1.add(rd4);
        rd4.setText("Option 4");
        rd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd4ActionPerformed(evt);
            }
        });
        jPanel1.add(rd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 23, -1, -1));

        buttonGroup1.add(rd5);
        rd5.setText("Option 5");
        rd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd5ActionPerformed(evt);
            }
        });
        jPanel1.add(rd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 49, -1, -1));

        n34.setText("Next");
        n34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n34ActionPerformed(evt);
            }
        });

        jButton2.setText("Prev");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Next will only be activated when you assess the min no. of responses.");

        jLabel6.setText("Peer 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n34))
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n34)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        lms2 frame=new lms2();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void n34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n34ActionPerformed
        // TODO add your handling code here:
        
        /*lms4 frame=new lms4();
        frame.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_n34ActionPerformed

    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd4ActionPerformed

    private void rd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd5ActionPerformed

    private void Initialize()
    {
         
        DataBase_Handler db=new DataBase_Handler();
        
        
        check_if_submitted = false;        
        if(db.check_PA(student_temp.user_id, student_temp.course_id, student_temp.question_id))
        {
            data = db.get_answer(student_temp.user_id, student_temp.course_id, student_temp.question_id);
            ta.setText(data[0]);
            ArrayList<String> criterias = db.r_lms3_f(student_temp.user_id,student_temp.course_id,student_temp.question_id);
            for(int i = 0 ; i< criterias.size() ; i++)
                cb3.addItem(criterias.get(i));
            //System.out.println(data[0]);
        }
        else
        {
            lms4 frame=new lms4();
            frame.setVisible(true);
            this.setVisible(false);
        }
     
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       
        n34.setEnabled(false);
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        
       Initialize();
     
    }//GEN-LAST:event_formWindowOpened

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        
        DataBase_Handler db=new DataBase_Handler();
        options = db.r_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id);
        options_description = db.r2_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id);
        options_points = db.r3_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id);
        
        if(options.size()==1)
        {
            //add options_description and points in each
            lms3.rd1.setVisible(true);
            lms3.rd1.setText(options.get(0));
        }
        else if(options.size()==2)
        {
            lms3.rd1.setVisible(true);
            lms3.rd1.setText(options.get(0));
            lms3.rd2.setVisible(true);
            lms3.rd2.setText(options.get(1));
        }
        else if(options.size()==3)
        {
            lms3.rd1.setVisible(true);
            lms3.rd1.setText(options.get(0));
            lms3.rd2.setVisible(true);
            lms3.rd2.setText(options.get(1));
            lms3.rd3.setVisible(true);
            lms3.rd3.setText(options.get(2));
        }
        else if(options.size()==4)
        {
            lms3.rd1.setVisible(true);
            lms3.rd1.setText(options.get(0));
            lms3.rd2.setVisible(true);
            lms3.rd2.setText(options.get(1));
            lms3.rd3.setVisible(true);
            lms3.rd3.setText(options.get(2));
            lms3.rd4.setVisible(true);
            lms3.rd4.setText(options.get(3));
        }
        else if(options.size()==5)
        {
            lms3.rd1.setVisible(true);
            lms3.rd1.setText(options.get(0));
            lms3.rd2.setVisible(true);
            lms3.rd2.setText(options.get(1));
            lms3.rd3.setVisible(true);
            lms3.rd3.setText(options.get(2));
            lms3.rd4.setVisible(true);
            lms3.rd4.setText(options.get(3));
            lms3.rd5.setVisible(true);
            lms3.rd5.setText(options.get(4));
        }
    }//GEN-LAST:event_cb3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int assessor_id=student_temp.user_id;
        //int user_id=Integer.parseInt((String)cb2.getSelectedItem());
        
        String q_id=student_temp.question_id;
        String course_id = student_temp.course_id;
        String cri=(String)cb3.getSelectedItem();
        StringTokenizer option=new StringTokenizer("");
        
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
        
        criterias_list.add(cri);
        points_list.add(points);
        cb3.removeItem(cri);
           
        if(cb3.getItemCount()==0)
        {   
            DataBase_Handler db=new DataBase_Handler();
            db.insert_pa_grade(Integer.parseInt(data[1]),db.user_to_anonymous(assessor_id),course_id,q_id,criterias_list,points_list);
            db.append_assessments_done(student_temp.user_id,  student_temp.course_id, student_temp.question_id);
            db.append_times_assessed(Integer.parseInt(data[1]), student_temp.course_id, student_temp.question_id);
            criterias_list.clear();
            points_list.clear();
            check_if_submitted = true;
        }
        
        cb3.removeItem(cri);
           
        if(check_if_submitted)
        {
            Initialize();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lms3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton n34;
    public static javax.swing.JRadioButton rd1;
    public static javax.swing.JRadioButton rd2;
    public static javax.swing.JRadioButton rd3;
    public static javax.swing.JRadioButton rd4;
    public static javax.swing.JRadioButton rd5;
    public static javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
