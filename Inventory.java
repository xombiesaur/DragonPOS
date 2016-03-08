
import java.util.ArrayList;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.List;

public class Inventory {
	
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
		
		
	
	
	
	/*static private List<ItemStock> items;

    public Inventory() {
        items = new ArrayList<ItemStock>();
    }

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
