import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

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
        
    public void insert_student_data(String username,String first_name,String last_name,String email,String password)
    {
        try{
            String sql ="INSERT INTO student_data(username,first_name,last_name,email,password) VALUES ("+"'"+username+"'"+ ","+"'"+first_name+"'"+","+"'"+last_name+"'"+","+"'"+email+"'"+","+"'"+password+"'"+");";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
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
    
    public int insert_student_answer()
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
                    criterias.add(rs.getString("criterian_id"));
                } catch (Exception e) {
		System.out.println("ERROR: Could not fetch record");
		return;
            }
        
        for(int i=0; i<criterias.size();i++)
            System.out.println(criterias.get(i));
        /*for each criteria give seperate entry in the pa_grade table*/
        /*Duplicate the above entries for different ids from ArrayList*/
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
    
    public static void  main(String args[])
    {
        DataBase_Handler db =new DataBase_Handler();  
        
    }
}
    