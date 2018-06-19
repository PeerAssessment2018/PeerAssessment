import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Collections;
import java.util.Random;

public class DataBase_Handler 
{
    Connection conn;
    
    public DataBase_Handler()
    {   
        conn = null;
         try{
            Properties conn_prop=new Properties();
            conn_prop.put("user", "root");
            conn_prop.put("password", "");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peer_assessment",conn_prop);
            System.out.println("Connection established !!");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public boolean insert_student_data_handler(String username,String first_name,String last_name,String email,String password,String course_id)
    {
        boolean f=false;
        f=insert_student_data(username, first_name, last_name, email, password);
        
        try{
            String sql ="SELECT id FROM student_data WHERE username="+"'"+username+"';";//+ " AND "+"'"+first_name+"'"+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            
            int id=rs.getInt("id");
            
            sql ="INSERT INTO student_courseenrollment(user_id,course_id) VALUES ("+id+ ","+"'"+course_id+"');";//+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            stmt = conn.createStatement();
            f=stmt.execute(sql);   
        
            int n = 0;
            boolean i=false;
            while(!i)
            {
                Random rand=new Random();
                n=rand.nextInt(999999)+100;
                
                sql="SELECT anonymous_user_id FROM student_anonymoususerid";
                stmt = conn.createStatement();
                rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    if(rs.getInt("anonymous_user_id")==n)
                        i=true;
                }
                if(i==true)
                    i=false;
                else
                    i=true;
            }
            
            sql ="SELECT id FROM student_data WHERE username="+"'"+username+"';";
            stmt = conn.createStatement();
            rs=stmt.executeQuery(sql);
            rs.next();
            
            sql ="INSERT INTO student_anonymoususerid(user_id,anonymous_user_id,course_id) VALUES (" + id + "," + n + ",'"+course_id+"')";
            stmt = conn.createStatement();
            f=stmt.execute(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return f;
    }
    
    public boolean insert_student_data(String username,String first_name,String last_name,String email,String password)
    {
        boolean f=false;
        try{
            String sql ="INSERT INTO student_data(username,first_name,last_name,email,password) VALUES ("+"'"+username+"'"+ ","+"'"+first_name+"'"+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            Statement stmt = conn.createStatement();
            f=stmt.execute(sql);
            
            /*int n = 0;
            boolean i=false;
            while(!i)
            {
                Random rand=new Random();
                n=rand.nextInt(999999)+100;
                
                sql="SELECT anonymous_user_id FROM student_anonymoususerid";
                stmt = conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    if(rs.getInt("anonymous_user_id")==n)
                        i=true;
                }
                if(i==true)
                    i=false;
                else
                    i=true;
            }
            
            sql ="SELECT id FROM student_data WHERE username="+"'"+username+"';";
            stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            int id=rs.getInt("id");
            
            sql ="INSERT INTO student_anonymoususerid(user_id,anonymous_user_id,course_id) VALUES (" + id + "," + n + ",'"+course_id+"')";
            stmt = conn.createStatement();
            f=stmt.execute(sql);*/
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return f;
    }
    
    public boolean insert_faculty_data_handler(String username,String first_name,String last_name,String email,String password,String course_id)
    {
        boolean f=false;
       // f=insert_faculty_data(username, first_name, last_name, email, password);
        try{
            String sql ="SELECT id FROM author_data WHERE username="+"'"+username+"';";//+ " AND "+"'"+first_name+"'"+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            
            int id=rs.getInt("id");
            
            sql ="INSERT INTO author_coursecreated(author_id,course_id) VALUES ("+id+ ","+"'"+course_id+"');";//+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            stmt = conn.createStatement();
            f=stmt.execute(sql);   
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return f;
    }
    
    public boolean insert_faculty_data(String username,String first_name,String last_name,String email,String password)
    {
        boolean f=false;
        try{
            String sql ="INSERT INTO author_data(username,first_name,last_name,email,password) VALUES ("+"'"+username+"'"+ ","+"'"+first_name+"'"+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            Statement stmt = conn.createStatement();
            f=stmt.execute(sql);   
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return f;
    }
    
    public ArrayList get_Answers()
    {
            ArrayList arr=new ArrayList();
            String sql="SELECT (user_id,state) FROM courseware_studentmodule;";
            try 
            {
            Statement statem=conn.createStatement();
            ResultSet rs=statem.executeQuery(sql);
            while(rs.next())
            {
                ArrayList arr2=new ArrayList();
                arr2.add(rs.getString("user_id"));
                arr2.add(rs.getString("state"));
                arr.add(arr2);
            }
            } 
            catch (Exception ex) 
            {
            //System.out.println(ex.getMessage());
            }
            return arr;
    }
    
    public boolean insert_question_details_1(String course_id, String question_id,int x,int y)
    {
        boolean f=false;
        try 
        {
            String sql = "INSERT INTO question_details(course_id,question_id,no_assessors,no_assessment) VALUES ("+"'"+course_id+"'"+ ","+"'"+question_id+"'"+","+x+","+y+ ");";
            Statement stmt = conn.createStatement();
            f=stmt.execute(sql);
        } 
        catch (Exception ex)
        {
             System.out.println(ex.getMessage());
	}
        return f;
    }
    
    public int count_no_of_students()
    {
        try 
        {
            String sql = " SELECT COUNT(*) FROM student_data ";
            Statement stmt = conn.createStatement();
            //stmt.execute(sql);
            ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            int rc=rs.getInt(1);
            System.out.println(rc);
            return rc;
        } 
        catch (Exception ex)
        {
             System.out.println(ex.getMessage());
             return 0;
	}
    }
    
    public void insert_student_answer(int user_id,String course_id, String question_id,String prompt)
    {
        try 
        {
            String sql = "INSERT INTO courseware_studentmodule (user_id,course_id,question_id,prompt) VALUES ("+user_id+","+"'"+course_id+"'"+ ","+"'"+question_id+"'"+","+"'"+prompt+"'"+ ");";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } 
        catch (Exception ex)
        {
             System.out.println(ex.getMessage());
	}     
    }
    
    public void insert_question_details_2(String cri_name, String cri_prompt,int nop)
    {		
                try {String question=cms1.prompt.getText();
			String insertString =" UPDATE question_details "+ " SET criterion_id = ' "+ cri_name +" ', criterion_prompt = '"+
                                cri_prompt+" ' , no_of_options = "+nop + " WHERE question_id = '"+question+"'";
                Statement stmt = conn.createStatement();
                stmt.execute(insertString);
                } catch (Exception e) {
			System.out.println("ERROR: Could not insert record");
			return;
		}
    }
        public void insert_courseware_studentmodule(int user_id,String ans)
        {                
                try {
			String insertString = " INSERT INTO courseware_studentmodule ( user_id, course_id, question_id, state )" +" VALUES ( ' " 
                                +user_id+"' , ' course1 ' , ' "+ lms1.ta1.getText()+" ' , ' " +ans+" ' ) ";
			Statement stmt = conn.createStatement();
                stmt.execute(insertString);
               } catch (Exception e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}}
       
    public void insert_options_details_1(String ques_id, String course_id,String cri_id,String op_id,String op_desc,int scale)
    {		
                try {
			String insertString=" INSERT INTO option_details " + " ( " + " course_id, " + " question_id, " +
					" criterion_id, " + " option_id, " + " option_description, " + " option_points " + " ) " + " VALUES "  + " (" + "'" +course_id + "'" + ","
					+ "'" +ques_id + "'" + ","+ "'" +cri_id + "'" + ", '"+op_id + "' ," + "'" +op_desc + "'," +scale + ")";
		Statement stmt = conn.createStatement();
                stmt.execute(insertString);
                } catch (Exception e) {
			System.out.println("ERROR: Could not insert record");
			return;
		}
    }
    
     public void insert_pa_grade_postshuffle(int user_id, int arr[] , String question_id, String course_id )
    {
        /*Convert arr from user_id list to anonymous_user_id from the student_anonymoususerid table*/
        
        int arr2[] = new int[arr.length];
        ArrayList<String> criterias = new ArrayList<String>();
        
        for(int i=0; i<arr.length;i++)
        {
            try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT anonymous_user_id FROM student_anonymoususerid WHERE user_id = " + arr[i] ;
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                    arr2[i] = rs.getInt("anonymous_user_id");
                else
                    System.out.println("no results");
                System.out.println(arr2[i]);
                } catch (Exception e) {
		System.out.println("ERROR: Could not fetch record");
		return;
            }
        }
        
        /*Fetch the criteris ids from question id and course_id which are common to different criteria ids in question_details table*/
        
        try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT criterion_id FROM question_details WHERE course_id= '" + course_id + "' AND question_id = '" + question_id +"'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                    criterias.add(rs.getString("criterion_id"));
                } catch (Exception e) {
		System.out.println("ERROR: Could not fetch record");
		return;
            }
        
        /*for(int i=0; i<criterias.size();i++)
            System.out.println(criterias.get(i));*/
        
        
        /*for each criteria give seperate entry in the pa_grade table*/
        /*Duplicate the above entries for different ids from ArrayList*/
        
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<criterias.size();j++)
            {
                try {
			String sql=" INSERT INTO pa_grade ( user_id, anonymous_assesser_id, course_id, question_id, criteria_id, grade_points) VALUES "  + " (" + user_id + ","
					+ arr2[i] + ","+ "'" + course_id + "'" + ", '" + question_id + "' ," + "'" + criterias.get(j) + "'," + 0 +")";
		Statement stmt = conn.createStatement();
                stmt.execute(sql);
                } catch (SQLException e) {
			System.out.println(e);
			return;
		}
            }
        }
    }
    
    public int anonymous_to_user(int auid)
    {
        int uid=0;
        try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT user_id FROM student_anonymoususerid WHERE anonymous_user_id = " + auid ;
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                    uid = rs.getInt("user_id");
                else
                    System.out.println("no results");
                System.out.println(uid);
                } catch (Exception e) {
		System.out.println("ERROR: Could not fetch record");
            }
        return uid;
    }
    
    public int user_to_anonymous(int uid)
    {
        int auid=0;
        try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT anonymous_user_id FROM student_anonymoususerid WHERE user_id = " + uid ;
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                    auid = rs.getInt("anonymous_user_id");
                else
                    System.out.println("no results");
                } catch (Exception e) {
		System.out.println("ERROR: Could not fetch record");
            }
        return auid;
    }
    
    public void lms3_f( int user_id, String course_id,String question_id )
    {
        int a_user_id = user_to_anonymous(user_id);
        //System.out.println(a_user_id);
        ArrayList<Integer> ids_to_assess = new ArrayList<Integer>();
        
            try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT user_id FROM pa_grade WHERE anonymous_assesser_id = " + a_user_id ;
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    int temp = rs.getInt("user_id");
                    if(!ids_to_assess.contains(temp))
                        ids_to_assess.add(temp);
                }
                //System.out.println(ids_to_assess);
                } catch (Exception e) {
		System.out.println(e);
            }
        
        ArrayList<Integer> a_user_ids=new ArrayList<Integer>();
        for(int i=0;i<ids_to_assess.size();i++)
        {
            a_user_ids.add(user_to_anonymous(ids_to_assess.get(i)));
            lms3.cb2.addItem(""+a_user_ids.get(i));
        }
        ArrayList<String> criterias = new ArrayList<String>();
        
        try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT criterion_id FROM question_details WHERE course_id = '" + course_id + "'AND question_id = '" + question_id + "'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    criterias.add(rs.getString("criterion_id"));
                }
                } catch (Exception e) {
		System.out.println(e);
            }   
        for(int i=0;i<criterias.size();i++)
        {
            lms3 frame=new lms3();
            lms4 frame1=new lms4();
            if(frame.isVisible()==true)
            lms3.cb3.addItem(criterias.get(i));
            if(frame1.isVisible()==true)
            lms4.cb2.addItem(criterias.get(i));
        }
     
    }
    
    public void lms3_f1( int user_id, String course_id,String question_id )
    {
        int a_user_id = user_to_anonymous(user_id);
        //System.out.println(a_user_id);
        ArrayList<Integer> ids_to_assess = new ArrayList<Integer>();
        
            try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT user_id FROM pa_grade WHERE anonymous_assesser_id = " + a_user_id ;
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    int temp = rs.getInt("user_id");
                    if(!ids_to_assess.contains(temp))
                        ids_to_assess.add(temp);
                }
                //System.out.println(ids_to_assess);
                } catch (Exception e) {
		System.out.println(e);
            }
        
        ArrayList<Integer> a_user_ids=new ArrayList<Integer>();
        for(int i=0;i<ids_to_assess.size();i++)
        {
            a_user_ids.add(user_to_anonymous(ids_to_assess.get(i)));
        }
       ArrayList<String> responses = new ArrayList<String>();
            
        for (int i = 0 ; i<ids_to_assess.size() ; i++ )
        {
            try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT state FROM courseware_studentmodule WHERE user_id = '" + ids_to_assess.get(i)+ "' AND course_id = '" + course_id + "'AND question_id = '" + question_id + "'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                {
                    responses.add(rs.getString("state"));
                }
                } catch (Exception e) {
		System.out.println(e);
            }    
        }
        
        ArrayList<String> criterias = new ArrayList<String>();
        
        try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT criterion_id FROM question_details WHERE course_id = '" + course_id + "'AND question_id = '" + question_id + "'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    criterias.add(rs.getString("criterion_id"));
                }
                } catch (Exception e) {
		System.out.println(e);
            }   
        
        ArrayList<String> options = new ArrayList<String>();
        ArrayList<String> options_description = new ArrayList<String>();
        ArrayList<Integer> options_points = new ArrayList<Integer>();
        
        String selected_criteria = (String)lms3.cb3.getSelectedItem();
        
        //String selected_criteria = "cked";
        
        try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT option_id,option_description,option_points FROM option_details WHERE course_id = '" + course_id + "' AND question_id = '" + question_id + "' AND criterion_id = '" + selected_criteria +"'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    options.add(rs.getString("option_id"));
                    options_description.add(rs.getString("option_description"));
                    options_points.add(rs.getInt("option_points"));
                }
                } catch (Exception e) {
		System.out.println(e);
            }   
        System.out.println(options.size());
        System.out.println(options);
        lms3 f=new lms3();
        lms4 f1=new lms4();
        if(f.isVisible()==true)
        {
        if(options.size()==1)
        {
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
        }
        if(f1.isVisible()==true)
        {
            if(options.size()==1)
        {
            lms4.rd1.setVisible(true);
            lms4.rd1.setText(options.get(0));
        }
        else if(options.size()==2)
        {
            lms4.rd1.setVisible(true);
            lms4.rd1.setText(options.get(0));
            lms4.rd2.setVisible(true);
            lms4.rd2.setText(options.get(1));
        }
        else if(options.size()==3)
        {
            lms4.rd1.setVisible(true);
            lms4.rd1.setText(options.get(0));
            lms4.rd2.setVisible(true);
            lms4.rd2.setText(options.get(1));
            lms4.rd3.setVisible(true);
            lms4.rd3.setText(options.get(2));
        }
        else if(options.size()==4)
        {
            lms4.rd1.setVisible(true);
            lms4.rd1.setText(options.get(0));
            lms4.rd2.setVisible(true);
            lms4.rd2.setText(options.get(1));
            lms4.rd3.setVisible(true);
            lms4.rd3.setText(options.get(2));
            lms4.rd4.setVisible(true);
            lms4.rd4.setText(options.get(3));
        }
        else if(options.size()==5)
        {
            lms4.rd1.setVisible(true);
            lms4.rd1.setText(options.get(0));
            lms4.rd2.setVisible(true);
            lms4.rd2.setText(options.get(1));
            lms4.rd3.setVisible(true);
            lms4.rd3.setText(options.get(2));
            lms4.rd4.setVisible(true);
            lms4.rd4.setText(options.get(3));
            lms4.rd5.setVisible(true);
            lms4.rd5.setText(options.get(4));
        }
        }
        //System.out.println(options_points);
    }
    public void lms3_f2( int user_id, String course_id,String question_id )
    {
        int a_user_id = user_to_anonymous(user_id);
        //System.out.println(a_user_id);
        ArrayList<Integer> ids_to_assess = new ArrayList<Integer>();
        
            try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT user_id FROM pa_grade WHERE anonymous_assesser_id = " + a_user_id ;
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    int temp = rs.getInt("user_id");
                    if(!ids_to_assess.contains(temp))
                        ids_to_assess.add(temp);
                }
                //System.out.println(ids_to_assess);
                } catch (Exception e) {
		System.out.println(e);
            }
        
        ArrayList<Integer> a_user_ids=new ArrayList<Integer>();
        for(int i=0;i<ids_to_assess.size();i++)
        {
            a_user_ids.add(user_to_anonymous(ids_to_assess.get(i)));
        }
       ArrayList<String> responses = new ArrayList<String>();
            
        for (int i = 0 ; i<ids_to_assess.size() ; i++ )
        {
            try {
                //int x = 10;
                //System.out.println(x);
                String sql=" SELECT state FROM courseware_studentmodule WHERE user_id = '" + ids_to_assess.get(i)+ "' AND course_id = '" + course_id + "'AND question_id = '" + question_id + "'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                {
                    responses.add(rs.getString("state"));
                }
                } catch (Exception e) {
		System.out.println(e);
            }    
        }
        lms3 f=new lms3();
        lms4 f1=new lms4();
        
        String s=(String)lms3.cb2.getSelectedItem();
        int j=0;
        int uid=Integer.parseInt(s);
        for(int i=0;i<a_user_ids.size();i++)
        {
            if(a_user_ids.get(i)==uid)
                j=i;
        }
        if(f.isVisible()==true)
            lms3.ta.setText(responses.get(j));
        if(f1.isVisible()==true)
            lms4.ta.setText(responses.get(j));
    }
    
     public void results(int user_id, String course_id, String question_id)
    {
        int a=0,b=0,sas=0,pas=0;
        
        try {
                String sql=" SELECT no_assessors,no_assessment FROM question_details WHERE course_id = '" + course_id + "'AND question_id = '" + question_id + "'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                {
                    a=rs.getInt("no_assessors");
                    b=rs.getInt("no_assessment");
                }
                } catch (Exception e) {
		System.out.println(e);
            }   
        
        /*System.out.println(a);
        System.out.println(b);*/
        
        try {
                String sql=" SELECT self_assessed_grade FROM courseware_studentmodule WHERE user_id = " + user_id + " AND course_id = '" + course_id + "'AND question_id = '" + question_id + "'";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next())
                {
                    sas=rs.getInt("self_assessed_grade");
                }
                } catch (Exception e) {
		System.out.println(e);
            } 
        
        ArrayList<Integer> marks = new ArrayList<>();
        
         try {
                String sql=" SELECT AVG(grade_points) as avg_grade FROM pa_grade WHERE user_id = " + user_id + " AND course_id = '" + course_id + "'AND question_id = '" + question_id + "' GROUP BY anonymous_assesser_id HAVING count(*)>1";
		Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    marks.add(rs.getInt("avg_grade"));
                }
                } catch (Exception e) {
		System.out.println(e);
            } 
        
        Collections.sort(marks);
        pas = (marks.get(marks.size()/2-1)+marks.get(marks.size()/2))/2;
        System.out.println(pas);
    }
     
       public void insert_pa_grade(int user_id,int assessor_id,String q_id, String course, String cri_id,int points)
    {		
                try {
                    user_id=anonymous_to_user(user_id);
                    assessor_id=user_to_anonymous(assessor_id);
			String insertString="INSERT INTO pa_grade (user_id, anonymous_assessor_id, question_id, course, crieteria_id,"
                                + " grade_points) VALUES ("+user_id+","+assessor_id+", '"+q_id+"' , '"+course+"','"+cri_id+"' ,"+points+")";
		Statement stmt = conn.createStatement();
                stmt.execute(insertString);
                } catch (Exception e) {
			System.out.println("ERROR: Could not insert record");
			return;
		}
    }
    public static void  main(String args[])
    {
        DataBase_Handler db =new DataBase_Handler(); 
        //int arr[] = {2,3};
       // db.lms3_f1(1,"course 1","sample prompt");
        //db.insert_pa_grade_postshuffle(1,arr,"ques","course1");
        //db.lms3_f(3,"course 1","ques");
        //db.results(1,"course1","ques");
        db.insert_student_data_handler("asdfg","asd","fg","qwe@gm.com","12@wd","hell1");
        db.insert_student_data_handler("asdfg","asd","fg","qwe@gm.com","12@wd","hell2");
        db.insert_student_data_handler("asdfg","asd","fg","qwe@gm.com","12@wd","hell3");
    }
}
    