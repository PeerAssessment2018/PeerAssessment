import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * This class demonstrates how to connect to MySQL and run some basic commands.
 * 
 * In order to use this, you have to download the Connector/J driver and add
 * its .jar file to your build path.  You can find it here:
 * 
 * http://dev.mysql.com/downloads/connector/j/
 * 
 * You will see the following exception if it's not in your class path:
 * 
 * java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/
 * 
 * To add it to your class path:
 * 1. Right click on your project
 * 2. Go to Build Path -> Add External Archives...
 * 3. Select the file mysql-connector-java-5.1.24-bin.jar
 *    NOTE: If you have a different version of the .jar file, the name may be
 *    a little different.
 *    
 * The user name and password are both "root", which should be correct if you followed
 * the advice in the MySQL tutorial. If you want to use different credentials, you can
 * change them below. 
 * 
 * You will get the following exception if the credentials are wrong:
 * 
 * java.sql.SQLException: Access denied for user 'userName'@'localhost' (using password: YES)
 * 
 * You will instead get the following exception if MySQL isn't installed, isn't
 * running, or if your serverName or portNumber are wrong:
 * 
 * java.net.ConnectException: Connection refused
 */
public class DBHandler {

	/** The name of the MySQL account to use (or empty for anonymous) */
	private final String userName = "root";

	/** The password for the MySQL account (or empty for anonymous) */
	private final String password = "";

	/** The name of the computer running MySQL */
	private final String serverName = "localhost";

	/** The port of the MySQL server (default is 3306) */
	private final int portNumber = 3306;

	/** The name of the database we are testing with (this default is installed with MySQL) */
	private final String dbName = "peer_assessment";
	
	/** The name of the table we are testing with */
	private final String student_data = "student_data";
        private final String question_details = "question_details";   
        private final String courseware_studentmodule = "courseware_studentmodule";
        private final String option_details = "option_details";
        private final String pa_grade = "pa_grade";
        private final String student_anonymoususerid = "student_anonymoususerid";
        private final String student_courseenrollment = "student_courseenrollment";
	
	/**
	 * Get a new database connection
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", this.userName);
		connectionProps.put("password", this.password);

		conn = DriverManager.getConnection("jdbc:mysql://"
				+ this.serverName + ":" + this.portNumber + "/" + this.dbName,
				connectionProps);

		return conn;
	}

	/**
	 * Run a SQL command which does not return a recordset:
	 * CREATE/INSERT/UPDATE/DELETE/DROP/etc.
	 * 
	 * @throws SQLException If something goes wrong
	 */
	public boolean executeUpdate(Connection conn, String command) throws SQLException {
	    Statement stmt = null;
	    try {
	        stmt = conn.createStatement();
	        stmt.executeUpdate(command); // This will throw a SQLException if it fails
	        return true;
	    } finally {

	    	// This will run whether we throw an exception or not
	        if (stmt != null) { stmt.close(); }
	    }
	}
	
	/**
	 * Connect to MySQL and do some stuff.
	 */
	/*public void run() {

		String username = "junk_username";
		String firstname = "junk_firstname";
		String lastname = "junk_lastname";
		String email = "junkmail@mail.com";
		String password = "password";
		// Connect to MySQL
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}

		//Create a table
                /*
		try {
		    String createString =
			        "CREATE TABLE " + this.tableName + " ( " +
			        "ID INTEGER NOT NULL, " +
			        "NAME varchar(40) NOT NULL, " +
			        "STREET varchar(40) NOT NULL, " +
			        "CITY varchar(20) NOT NULL, " +
			        "STATE char(2) NOT NULL, " +
			        "ZIP char(5), " +
			        "PRIMARY KEY (ID))";
			this.executeUpdate(conn, createString);
			System.out.println("Created a table");
	    } catch (SQLException e) {
			System.out.println("ERROR: Could not create the table");
			e.printStackTrace();
			return;
		}*/
                
                
                //Insert String
                /*try {
			String insertString = " INSERT INTO " + this.tableName + " ( " + " username, " + " first_name, " +
					" last_name, " + " email, " + " password )" + " VALUES "  + " (" +"," + "'" +username + "'" + ","
					+ "'" +firstname + "'" + ","+ "'" +lastname + "'" + ","+ "'" +email + "'" + "," + "'" +password + "'" + ")";
			this.executeUpdate(conn, insertString);
			System.out.println("Record Inserted");
	    } catch (SQLException e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}
		*/
                
		// Drop the table
		/*try {
		    String dropString = "DROP TABLE " + this.tableName;
			this.executeUpdate(conn, dropString);
			System.out.println("Dropped the table");
	    } catch (SQLException e) {
			System.out.println("ERROR: Could not drop the table");
			e.printStackTrace();
			return;
		}*/
	//}
        
        public void insert_student_data()
        {
                String username = "junk_username";
		String firstname = "junk_firstname";
		String lastname = "junk_lastname";
		String email = "junkmail@mail.com";
		String password = "password";
		
                // Connect to MySQL
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}
                
                try {
			String insertString = " INSERT INTO " + this.student_data + " ( " + " username, " + " first_name, " +
					" last_name, " + " email, " + " password )" + " VALUES "  + " (" +"," + "'" +username + "'" + ","
					+ "'" +firstname + "'" + ","+ "'" +lastname + "'" + ","+ "'" +email + "'" + "," + "'" +password + "'" + ")";
			this.executeUpdate(conn, insertString);
			System.out.println("Record Inserted");
                        } catch (SQLException e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}
        }
	
        public void insert_courseware_studentmodule(int user_id,String ans)
        {
            Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}
                
                try {
			String insertString = " INSERT INTO courseware_studentmodule ( user_id, course_id, question_id, state )" +" VALUES ( ' " 
                                +user_id+"' , ' course1 ' , ' "+ lms1.ta1.getText()+" ' , ' " +ans+" ' ) ";
			this.executeUpdate(conn, insertString);
			System.out.println("Record Inserted");
                } catch (SQLException e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}}
        public void insert_question_details_1(String course_id, String question_id,int x,int y)
        {
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}
                
                try {
			String insertString = " INSERT INTO " + this.question_details + " ( " + " course_id, " + " question_id, " +
					" no_assessors, " + " no_assessment )" + " VALUES "  + " (" + "'" + course_id + "'" + ","
                                + "'" + question_id + "'" + "," + x + "," + y + ")";
			this.executeUpdate(conn, insertString);
			System.out.println("Record Inserted");
                } catch (SQLException e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}
        }
            
        
	/**
	 * Connect to the DB and do some stuff
	 */
        public void insert_question_details_2(String cri_name, String cri_prompt,int nop)
        {		
                // Connect to MySQL
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}
                
                try {String question=cms1.prompt.getText();
			String insertString =" UPDATE "+ this.question_details+ " SET criterion_id = ' "+ cri_name +" ', criterion_prompt = '"+
                                cri_prompt+" ' , no_of_options = "+nop + " WHERE question_id = '"+question+"'";
			this.executeUpdate(conn, insertString);
			System.out.println("Record Updated");
                } catch (SQLException e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}
        }
        public void insert_options_details_1(String ques_id, String course_id,String cri_id,String op_id,String op_desc,int scale)
        {		
                // Connect to MySQL
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could not connect to the database");
			e.printStackTrace();
			return;
		}
                
                try {
			String insertString=" INSERT INTO " + this.option_details + " ( " + " course_id, " + " question_id, " +
					" criterion_id, " + " option_id, " + " option_description, " + " option_points " + " ) " + " VALUES "  + " (" + "'" +course_id + "'" + ","
					+ "'" +ques_id + "'" + ","+ "'" +cri_id + "'" + ", '"+op_id + "' ," + "'" +op_desc + "'," +scale + ")";
			this.executeUpdate(conn, insertString);
			System.out.println("Record Updated");
                } catch (SQLException e) {
			System.out.println("ERROR: Could not insert record");
			e.printStackTrace();
			return;
		}
        }
	public static void main(String[] args) {
		DBHandler app = new DBHandler();
                app.insert_question_details_1("helslo","junk_thisdng",4,5);
	}
}
