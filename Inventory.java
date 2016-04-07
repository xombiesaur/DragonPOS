/*
Cleaned up Inventory class for database connection. Handles both rental and sales
>> dcb3
Based on loginDB structure
*/
import java.util.ArrayList;
import java.sql.* ;	// for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.List;

public class Inventory {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://54.209.1.181/216pos";

	//	Database credentials
	static final String USER = "amber";
	static final String PASS = "216216";

	private Connection conn = null;

	public Inventory(){
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
	}//end instantiate

	public String[] getSaleItemFromID(String itemID){
		try{
			Statement stmt = null;
			//STEP 4: Execute a query
		stmt = conn.createStatement();
		String sql;
		sql = "SELECT itemName, itemPrice FROM saleItem WHERE itemID = '"+itemID+"'";
		ResultSet rs = stmt.executeQuery(sql);
	
		//STEP 5: Extract data from result set
		while(rs.next()){
			//Retrieve by column name
			String iteminfo = new String[2];
			iteminfo[0]	= rs.getString("itemName");
			iteminfo[1] = rs.getString("itemPrice");
			return iteminfo;
			}
	
				return null;
		}catch(Exception ex){
			System.out.println("error gettng info: "+ex.toString());
			return null;
		}
	}
	
		public String[] getRentalItemFromID(String itemID){
		try{
			Statement stmt = null;
			//STEP 4: Execute a query
		stmt = conn.createStatement();
		String sql;
		sql = "SELECT itemName, itemPrice, rentOn FROM saleItem WHERE itemID = '"+itemID+"'";
		ResultSet rs = stmt.executeQuery(sql);
	
		//STEP 5: Extract data from result set
		while(rs.next()){
			//Retrieve by column name
			String iteminfo = new String[2];
			iteminfo[0]	= rs.getString("itemName");
			iteminfo[1] = rs.getString("itemPrice");
			
			return iteminfo;
			}
	
				return null;
		}catch(Exception ex){
			System.out.println("error gettng info: "+ex.toString());
			return null;
		}
	}

} //*/