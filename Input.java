import java.util.*;
public class Input
{
   
   
   public static boolean isNegative(String str)
   {
      int size = str.length();
      String array[] = new String[size];
      
      for(int i = 0; i< size; i++)
      {
         array[i] = str.charAt(i) + "";
         
      }
      
      if(array[0].equals("-"))
      {
         //System.out.println("NEGATIVE NUMBER!!!!");
         return true;
      }
      
      return false;    
  }
     
     
  
  
  public static boolean isInteger(String str)
  {
      int size = str.length();
      String array[] = new String[size];
      
      for(int i = 0; i< size; i++)
      {
         array[i] = str.charAt(i) + "";
         
      }
      
      int start = 0;
      if(array[start].equals("-"))
      {
         start = 1;
      }
      
      for(int i = start ; i<size; i++)
      {
         if(array[i].equals("0")) {}
         else if(array[i].equals("1")) {} 
         else if(array[i].equals("2")) {} 
         else if(array[i].equals("3")) {}
         else if(array[i].equals("4")) {}
         else if(array[i].equals("5")) {}
         else if(array[i].equals("6")) {}
         else if(array[i].equals("7")) {}
         else if(array[i].equals("8")) {}
         else if(array[i].equals("9")) {}
         
         else
         {
            return false;
         }
      }
      
      return true;
   }
   
   
   
   public static boolean isDouble(String str)
  {
      int size = str.length();
      String array[] = new String[size];
      
      for(int i = 0; i< size; i++)
      {
         array[i] = str.charAt(i) + "";
         
      }
      
      int start = 0;
      if(array[start].equals("-"))
      {
         start = 1;
      }
      
      for(int i = start ; i<size; i++)
      {
         if(array[i].equals("0")) {}
         else if(array[i].equals("1")) {} 
         else if(array[i].equals("2")) {} 
         else if(array[i].equals("3")) {}
         else if(array[i].equals("4")) {}
         else if(array[i].equals("5")) {}
         else if(array[i].equals("6")) {}
         else if(array[i].equals("7")) {}
         else if(array[i].equals("8")) {}
         else if(array[i].equals("9")) {}
         else if(array[i].equals(".")) {}
         
         else
         {
            return false;
         }
      }
      
      return true;
   }

         
         
     
     

   
   
 } //end of class
               
         
      
   