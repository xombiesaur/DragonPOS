import java.util.*;
import java.io.*;
import java.sql.*;
import java.math.*;

public class TestingEmployee
{
   public static void main(String[] args) throws SQLException, IOException, java.lang.ClassNotFoundException
   {
      EmployeeManagement kd = new EmployeeManagement();
      int n = kd.editEmployee("armaan", "Armaan", "M", "ak");
      System.out.println(n);
      n = kd.addEmployee("john", "John", "C", "dk");
      System.out.println(n);
      n = kd.removeEmployee("john");
      System.out.println(n);
      
      
      
      
   }
   
}