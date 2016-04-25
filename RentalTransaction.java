
import java.util.ArrayList;
import java.util.Scanner;

public class RentalTransaction{
	Inventory inventory;
	ArrayList<RentalLineItem> lines = new ArrayList<RentalLineItem>();

		public RentalTransaction(){
			inventory = new Inventory();
		}

		public String addItemByID(String itemID, int duration , int quantity){
    	//check for item in inventory

      boolean isRental = inventory.itemInRentalInventory(itemID);
    	int curStock = inventory.itemInInventory(itemID);
    	//System.out.println("*");
    	if(curStock <= 0){
    		return "The item with id "+itemID+" is not currently in our inventory.";
    	}
      else if(curStock < quantity){
        return "You have requested more of this item than is in stock.";
      }
     else{
     		if(isRental){
            boolean exists = false;
            //check for item already in inventory
            for(RentalLineItem lineItem : lines){
                if(lineItem.getItemID().equals(itemID)){
                    //increment existing lineItem conatianing item to be added
                    lineItem.incrementBy(quantity);
                    exists = true;
                }
            }
            if(!exists){
            		String iName = inventory.getSaleItemNameFromID(itemID);
                //create new salesline item
                lines.add(new RentalLineItem(itemID, duration, quantity, inventory.getSaleItemPriceFromID(itemID), inventory.getSaleItemNameFromID(itemID)));
            }
        	  return "This item was added to sales transaction successfuly.";
        	}
        	return "Not a rental";
     		}
     }
}