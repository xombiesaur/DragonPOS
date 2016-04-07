//LoginDB.java


import java.util.ArrayList;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.List;

public class LoginDB {
  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://54.209.1.181/216pos";

  //  Database credentials
  static final String USER = "amber";
  static final String PASS = "216216";

  private Connection conn = null;

  public LoginDB(){
    try{
		//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);

		}
      /*//STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();*/
    catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
    }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
    }/*finally{
      //finally block used to close resources
      try{
        if(stmt!=null)
          stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
        if(conn!=null)
          conn.close();
      }catch(SQLException se){
        se.printStackTrace();
      }
    }//end finally*/
  }//end instantiate

    public String getPassword(String username){
	  	try{
	  		Statement stmt = null;
		  	//STEP 4: Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT pass, role FROM users WHERE username = '"+username+"'";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				String pass  = rs.getString("pass");
				String role = rs.getString("role");

				return pass;
		    }

		    return null;
		}catch(Exception ex){
			System.out.println("error gettng password: "+ex.toString());
			return null;
		}
    } 

} //*/

/*
	public Inventory() throws Exception{
	try {
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection conn = DriverManager.getConnection("jdbc:mysql://54.209.1.181/216pos","root","216216");
		   conn.close();
		}
		catch(ClassNotFoundException ex) {
		   System.out.println("Error: unable to load driver class!");
		   System.exit(1);
		}
	}

	public static void main(String[] args) throws Exception{
		Inventory inventory = new Inventory();
	}
}




/*
	static private ArrayList<ItemStock> items;

    public Inventory() {
        items = new ArrayList<ItemStock>();
        for (int i = 0; i < 200; i++) {
            ItemStock stock = new ItemStock("ID" + i, "Description " + i, i + 100, i);
            items.add(stock);
        }
    }

    public boolean itemInInventory(String itemID){
        for(ItemStock itemStock : items){
            if(itemStock.getID().equals(itemID) && itemStock.getQuantity() > 0){
                return true;
            }
        }
        //item is not in stock
        return false;
    }

    public ItemStock getItemStockFromID(String itemID){
        for(ItemStock itemStock : items){
            if(itemStock.getID().equals(itemID)){
                return itemStock;
            }
        }
        //item is not in stock
        return null;
    }
}

*/
/*
    public SaleItem removeItem(String itemID) {
        for (ItemStock itemStock : items) {
            SaleItem item = itemStock.item;
            if (item.getItemID().equals(itemID) && itemStock.stock > 0) {
                itemStock.stock--;
                return item;
            }
        }
        return null;
    }

    public void addItem(SaleItem item, int stock) {
        for (ItemStock itemStock : items) {
            if (itemStock.item.getItemID().equals(item.getItemID())) {
                itemStock.stock += stock;
                return;
            }
        }
        items.add(new ItemStock(item, stock));
    }

    private class ItemStock {

        SaleItem item;
        int stock;

        public ItemStock(SaleItem item, int stock) {
            this.item = item;
            this.stock = stock;
        }
    }

}*/
