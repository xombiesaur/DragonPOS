import java.sql.* ;  // for standard JDBC programs
import java.util.ArrayList;
import java.util.*;
import java.math.*;
import java.sql.*;
import java.io.*;

public class Pay{
	SalesTransaction sale;
	Connection con = null;
	String c;

	public Pay(SalesTransaction sale, String c){
		this.sale = sale;
		DBConnection temp = new DBConnection();
		con = temp.getConnection();
		this.c = c;
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
			sql = " INSERT INTO transactionInfo VALUES (" + idtransaction + ", "+c+");";
			stmt.executeUpdate(sql);
		}
      catch(Exception ex){
			System.out.println(ex.toString());
		}
	}

}