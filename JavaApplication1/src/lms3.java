
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
     ArrayList<String> feedback=new ArrayList<String>();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fb = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STEP 3 OF 5");
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

        jButton2.setText("Prev");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Next will only be activated when you assess the min no. of responses.");

        p.setText("Peer 1");

        fb.setEditable(false);
        fb.setColumns(20);
        fb.setRows(5);
        fb.setEnabled(false);
        jScrollPane2.setViewportView(fb);

        jLabel6.setText("Feedback:");

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
                        .addComponent(jButton3))
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd4ActionPerformed

    private void rd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd5ActionPerformed

    private void Initialize()
    {
         
        DataBase_Handler db=new DataBase_Handler();
        //System.out.println("**************?*************");
        
        check_if_submitted = false;        
        if(db.check_PA(student_temp.user_id, student_temp.course_id, student_temp.question_id))
        {
            data = db.get_answer(student_temp.user_id, student_temp.course_id, student_temp.question_id);

            if(data[1] == null )
            {
                java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
                if(sqlDate.before(db.get_final_date_of_submission(student_temp.course_id, student_temp.question_id)))  
                {
                    lms4 frame=new lms4();
                    frame.setVisible(true);
                    this.setVisible(false);
                }
                p.setText("None");
                JOptionPane.showMessageDialog(null,"There are no Peers left too assess, come back later!");
                System.exit(0);
            }
            p.setText("Peer " + (db.assessments_done(student_temp.user_id, student_temp.course_id, student_temp.question_id)+1));
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
       
        DataBase_Handler db = new DataBase_Handler();
        db.learnt_to_assess_true(student_temp.user_id, student_temp.question_id, student_temp.course_id);
        System.err.println("DOEN DONE DONE");
        //n34.setEnabled(false);
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        if(author_temp.fb==0)
        {
            fb.setEnabled(false);
            fb.setEditable(false);
        }
        else if(author_temp.fb==1)
        {
            fb.setEnabled(true);
            fb.setEditable(true);
            fb.setToolTipText("This feedback is optional. Delete the text before you give feedback.");
        }
        else if(author_temp.fb==2)
        {
            fb.setEditable(true);
            fb.setEnabled(true);
            fb.setToolTipText("This feedback is mandatory. Delete the text before you give feedback.");
        }
       Initialize();
     
    }//GEN-LAST:event_formWindowOpened

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        String cri_id=(String)cb3.getSelectedItem();
        DataBase_Handler db=new DataBase_Handler();
        options = db.r_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id,cri_id);
        options_description = db.r2_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id,cri_id);
        options_points = db.r3_lms3_f1(student_temp.user_id,student_temp.course_id,student_temp.question_id,cri_id);
        
        if(options.size()==1)
        {
            //add options_description and points in each
            rd1.setVisible(true);
            rd1.setText(options.get(0));
        }
        else if(options.size()==2)
        {
            rd1.setVisible(true);
            rd1.setText(options.get(0));
            rd2.setVisible(true);
            rd2.setText(options.get(1));
        }
        else if(options.size()==3)
        {
            rd1.setVisible(true);
            rd1.setText(options.get(0));
            rd2.setVisible(true);
            rd2.setText(options.get(1));
            rd3.setVisible(true);
            rd3.setText(options.get(2));
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
        String fback=fb.getText();
        if(fback.equals(""))
            fback="None";
        feedback.add(fback);
        criterias_list.add(cri);
        points_list.add(points);
        
        cb3.removeItem(cri); 
        
        if(cb3.getItemCount()==0)
        {   
            DataBase_Handler db=new DataBase_Handler();
            db.insert_pa_grade(Integer.parseInt(data[1]),db.user_to_anonymous(assessor_id),course_id,q_id,criterias_list,points_list,feedback);
            JOptionPane.showMessageDialog(null,"Assessment done for Peer " + (db.assessments_done(student_temp.user_id, student_temp.course_id, student_temp.question_id)+1));
            db.append_assessments_done(student_temp.user_id,  student_temp.course_id, student_temp.question_id);
            db.append_times_assessed(Integer.parseInt(data[1]), student_temp.course_id, student_temp.question_id);
            criterias_list.clear();
            points_list.clear();
            check_if_submitted = true;
         }

        if(check_if_submitted)
            Initialize();
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
    private javax.swing.JTextArea fb;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel p;
    public static javax.swing.JRadioButton rd1;
    public static javax.swing.JRadioButton rd2;
    public static javax.swing.JRadioButton rd3;
    public static javax.swing.JRadioButton rd4;
    public static javax.swing.JRadioButton rd5;
    public static javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
