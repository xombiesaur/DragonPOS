import java.util.*;
import java.io.*;
import java.sql.*;
import java.math.*;

public class EmployeeManagement
{
   
   private Connection con;
   private PreparedStatement update = null;
   
   public EmployeeManagement()
   {
      DBConnection temp = new DBConnection();
		con = temp.getConnection();
   }
   
   
   
   public int addEmployee(String username, String name, String role, String password) throws SQLException, IOException, java.lang.ClassNotFoundException
   {
      Statement s = con.createStatement();
      String q = "select username from users where username = '"+username +"'";
      ResultSet result = s.executeQuery(q);
            
      if(result.next()) // username already exists.
      {
         return 1; //username found (1).
      }
      
      else //username found so we're ready to make changes.
      {
         if(name.length() > 45 || (name.length() == 0))
         {
            return 2; //name length too big.
         }
         
         if(!(role.equals("C") || role.equals("M")))
         {
            return 3; //invalid role.
         }
         
         else 
         {
            System.out.println("Role looks good.");
         }
         
         if(password.length() > 45 || (password.length() == 0))
         {
           return 4; //invalid password.
         }
         
         //update the users database.         
         q = "insert into users values ('" + username +"','" + name + "','" + role + "','" + password + "')";
         //result = s.executeQuery(q);
         //update = con.prepareStatement(q);
        // update.executeUpdate();
        
        s.executeUpdate(q);
         
         return 0; //update successful.
      }
   }//end of addEmployee()
   

      
      
      
   
   
   
   public int editEmployee(String username, String name, String role, String password) throws SQLException, IOException, java.lang.ClassNotFoundException
   {
      //verify username exists.
      Statement s = con.createStatement();
      String q = "select username from users where username = '"+username+"'";
      ResultSet result = s.executeQuery(q);
      
      if(!result.next()) //no username found.
      {
         return 1; //no username found (1).
      }
      
      else //username found so we're ready to make changes.
      {
         if(name.length() > 45 || (name.length() == 0))
         {
            return 2; //name length too big.
         }
         
         if(!(role.equals("C") || role.equals("M")))
         {
            return 3; //invalid role.
         }
         
         else 
         {
            System.out.println("Role looks good.");
         }
         
         if(password.length() >45 || (password.length() == 0))
         {
           return 4; //invalid password.
         }
         
         //update the users database.         
         q = "update users set name = '" + name +"', role = '" + role + "', pass = '" + password + "' where username = '" + username +"'";
         update = con.prepareStatement(q);
         update.executeUpdate();
         //con.commit();
        // result = s.executeQuery(q);
      } 
         return 0; //update successful.
      
   }//end of editEmployee()
  
  
  public int removeEmployee(String username) throws SQLException, IOException, java.lang.ClassNotFoundException
  {
      Statement s = con.createStatement();
      String q = "select username from users where username = '"+username+"'";
      ResultSet result = s.executeQuery(q);
      
      if(!result.next()) //no username found.
      {
         return 1; //no username found (1).
      }
      
      else
      {
         q = "delete from users where username = '" +username+"'";
         update = con.prepareStatement(q);
         update.executeUpdate();
         System.out.println("Delete successful.");
      }
      
      return 0; //delete successful.
 }
      
         

  
   
}//end of class
      