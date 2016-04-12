//singleton for connection


import java.util.ArrayList;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.List;

public class DBConnection{
  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://54.209.1.181/216pos";

  //  Database credentials
  static final String USER = "amber";
  static final String PASS = "216216";

  private static Connection conn = null;

  public DBConnection(){
  	//nothing here;
  }

  public static Connection getConnection(){
  	if(conn == null){
	    try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

		}
	    catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	    }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	    }
	}
	return conn;
  }
}
