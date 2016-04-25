import java.sql.* ;  // for standard JDBC programs
import java.util.ArrayList;
public class Pay{
	SalesTransaction sale;
	Connection conn = null;
	String c;

	public Pay(SalesTransaction sale, String c){
		this.sale = sale;
		DBConnection temp = new DBConnection();
		conn = temp.getConnection();
		this.c = c;
	}

	public void complete(){
		try{
			Statement stmt = conn.createStatement();
			String sql = "";
			for(SalesLineItem item: sale.lines){
				sql = " INSERT INTO transactionItems VALUES (1,"+item.getItemID()+", "+item.getQuantity()+");";
				stmt.executeUpdate(sql);
			}
			sql = " INSERT INTO transactionInfo VALUES (1, "+c+");";
			stmt.executeUpdate(sql);
		}catch(Exception ex){
			System.out.println(ex.toString());
		}
	}

}