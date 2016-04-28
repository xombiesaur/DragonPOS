import java.sql.* ;  // for standard JDBC programs
import java.util.ArrayList;
import java.util.*;
import java.math.*;
import java.sql.*;
import java.io.*;

public class Pay{
	SalesTransaction sale;
	Connection con = null;
	String card;
	int cash;

	public Pay(SalesTransaction sale, String card){
		this.sale = sale;
		DBConnection temp = new DBConnection();
		con = temp.getConnection();
		this.card = card;
		if(card.length() < 16){
			cash = 1;
		}
		else{
			cash = 0;
		}
	}

	public void complete() throws SQLException, IOException, java.lang.ClassNotFoundException
   {
      //String idtransaction = "";
      Statement s = con.createStatement();
      String q = "SELECT MAX(idtransaction) FROM transactionItems"; 
      ResultSet result = s.executeQuery(q);
      result.next();
      int idtransaction = Integer.parseInt(result.getString(1)) + 1;
      
              
		try
      {
			Statement stmt = con.createStatement();
			String sql = "";
			for(SalesLineItem item: sale.lines){
				sql = " INSERT INTO transactionItems VALUES (" + idtransaction+ ","+item.getItemID()+", "+item.getQuantity()+");";
				stmt.executeUpdate(sql);
			}
			sql = " INSERT INTO transactionInfo VALUES (" + idtransaction + ", '"+card+"', "+cash+");";
			stmt.executeUpdate(sql);
		}
			catch(SQLException ex){
							System.out.println(ex.toString());
			}
      catch(Exception ex){
			System.out.println(ex.toString());
		}
	}

}