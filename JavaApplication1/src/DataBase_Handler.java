import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    
    public void insert_question_details_1(String course_id, String question_id,int x,int y)
    {	                
        try 
        {
            String sql = "INSERT INTO question_details(course_id,question_id,no_assessors,no_assessment) VALUES ("+"'"+course_id+"'"+ ","+"'"+question_id+"'"+","+x+","+y+ ");";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } 
        catch (Exception ex)
        {
             System.out.println(ex.getMessage());
	}
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
    
    public static void  main(String args[])
    {
        DataBase_Handler db =new DataBase_Handler();  
        //db.insert_question_details_1("sdg", "qwe",10, 10);
        //db.insert_student_data("qwer","qwe","r","qwe@qwef.com","password");
    }
}
    