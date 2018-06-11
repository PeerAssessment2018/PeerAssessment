import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
public class connection_table 
{
    Connection conn;
    public connection_table()
    {
        conn=null;
    }
    public Connection get_Connection()
    {
        //Connection conn=null;
        try{
            Properties conn_prop=new Properties();
            conn_prop.put("user", "root");
            conn_prop.put("password", "");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/peer_assesment",conn_prop);
            System.out.println("Connection established !!");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    public int student_data_entry(String username,String first_name,String last_name,String email,String password)
    {
        int f=0;
        try{
            String sql ="INSERT INTO student_data(id,username,first_name,last_name,email,password) VALUES ("+"12,"+username+","+first_name+","+last_name+","+email+","+password+");";
            Statement stmt = conn.createStatement();
        stmt.execute(sql);
        f=1;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return f;
    }
    public static void  main(String args[])
    {
        connection_table c1=new connection_table();
        c1.get_Connection();
        System.out.println(c1.student_data_entry("'Ram'","'Ram'", "'Das'", "'ramdas1@blabalcom'", "'one'"));
    }
    
        public int enter_into_questiondet(String s1,String s2,String s3)
    {
         int f=0;
        try{
           // String sql ="INSERT INTO question_details(course_id,question_id,no_assessors,no_assessment,criterion_id,criterion_) VALUES (";");";
            Statement stmt = conn.createStatement();
        stmt.execute(sql);
        f=1;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return f;
    }
}
