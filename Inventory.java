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

	private static Connection conn = null;

	public Inventory(){
		conn = DBConnection.getConnection();
	}//end instantiate

	public static int itemInSaleInventory(String itemID){
		try{
			Statement stmt = null;
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM item WHERE itemID = '"+itemID+"' AND isRental = 0";
			ResultSet rs = stmt.executeQuery(sql);
			if(!rs.next()){
        return -1;
      }
      else{
        return rs.getInt("currentInventory");
      }
		}catch(Exception ex){
      System.out.println("error gettng info: "+ex.toString());
      return -2;
		}
	}
	
		public static int itemInInventory(String itemID){
		try{
			Statement stmt = null;
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM item WHERE itemID = '"+itemID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(!rs.next()){
        return -1;
      }
      else{
        return rs.getInt("currentInventory");
      }
		}catch(Exception ex){
      System.out.println("error gettng info: "+ex.toString());
      return -2;
		}
	}
	
	
	public String getSaleItemNameFromID(String itemID){
		try{
			Statement stmt = null;
				//STEP 4: Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT itemName FROM item WHERE itemID = '"+itemID+"'";
			ResultSet rs = stmt.executeQuery(sql);
		
			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				return rs.getString("itemName");
			}
		
				return null;
		}catch(Exception ex){
			System.out.println("error gettng info: "+ex.toString());
			return null;
		}
	}

  public float getSaleItemPriceFromID(String itemID){
    try{
      Statement stmt = null;
        //STEP 4: Execute a query
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT salePrice FROM item WHERE itemID = '"+itemID+"'";
      ResultSet rs = stmt.executeQuery(sql);
    
      //STEP 5: Extract data from result set
      while(rs.next()){
        //Retrieve by column name
        return rs.getFloat("salePrice");
      }
    
      return -1;
    }catch(Exception ex){
      System.out.println("error gettng info: "+ex.toString());
      return -2;
    }
  }
	
//check inventory if item is avalable for rental
	public boolean itemInRentalInventory(String itemID){
		try{
			Statement stmt = null;
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT isRental FROM item WHERE itemID = '"+itemID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			int isARental = -1;
			while (rs.next()){
				isARental = rs.getInt("isRental");
			}
			//System.out.println(isARental);
			if (isARental > 0 ){
				return true;
			}
			return false;
		}catch(Exception ex){
       System.out.println("error gettng info: "+ex.toString());
       return false;
		}
	}
//get intem info for rental
	public ItemStock getRentalItemFromID(String itemID){
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
				ItemStock itemInfo = new ItemStock(itemID, rs.getString("itemName"), rs.getInt("itemPrice"));
				return itemInfo;
			}
	
				return null;
		}catch(Exception ex){
			System.out.println("error gettng info: "+ex.toString());
			return null;
		}
	}

} //*/

// This copy of inventory uses a method to make the code smaller
/*
public class Inventory {

	private Connection conn = null;

	public Inventory(){
		conn = DBConnection.getInstance();
	}//end instantiate
	
	private ResultSet dbRequest(String sql){
		Statement stmt = null;
		stmt = conn.createStatement();
		return stmt.executeQuery(sql);
	}  
	
	public String[] getSaleItemFromID(String itemID){
		try{

		String sql;
		sql = "SELECT itemName, itemPrice FROM saleItem WHERE itemID = '"+itemID+"'";
		ResultSet rs = dbRequest(sql);
	
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
	
//check inventory if item is avalable for rental
		public boolean itemInRentalInventory(String itemID){
			Statement stmt = null;
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT isRental FROM item WHERE itemID = '"+itemID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			int isARental;
			isARental = rs.getInt("isRental");
			if (isARental > 0 ){
				return true;
			}
			return false;
		}
	
//get intem info for rental
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

}
//*/

