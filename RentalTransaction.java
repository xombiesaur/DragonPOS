
import java.util.ArrayList;
import java.util.Scanner;

public class RentalTransaction{
	Inventory inventory;
	ArrayList<RentalLineItem> lines = new ArrayList<RentalLineItem>();

		public RentalTransaction(){
			inventory = new Inventory();
		}

		public void addItemByID(String itemID){
    	//check for item in inventory
      int curStock = inventory.itemInRentalInventory(itemID);
    	if(curStock <= 0){
    		return "The item with id "+itemID+" is not currently in our inventory.";
    	}
        else if(curStock < quantity){
            return "You have requested more of this item than is in stock.";
        }
        else{
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
                //create new salesline item
                lines.add(new RentalLineItem(itemID, quantity, inventory.getRentalItemPriceFromID(itemID), inventory.getRentalItemNameFromID(itemID)));
            }
            return "This item was added to sales transaction successfuly.";
        }
    	
    	
    	
    	
    	//------------------------------------------------------------
    	if(!inventory.itemInRentalInventory(itemID)){
    		System.out.println("The item with id "+itemID+" is not currently in our rental inventory.");
    		return;
    	}
    	ItemStock tempItem = inventory.getRentalItemFromID(itemID);
    	//check for item in current line items
    	boolean itemExists = false;
    	//loop through current SalesLineItems
    	/*
    	for(RentalLineItem lineItem : lines){
    		if(lineItem.getItemID().equals(itemID)){
    			//increment existing lineItem conatianing item to be added
    			itemExists = true;
    			lineItem.increment();
    		}
    	}
    	if(!itemExists){
    		//new salesLineItem needs to be created to hold item
    		RentalItem tempRentalItem = new RentalItem(tempItem.getDescription(), tempItem.getPrice(), tempItem.getID());
    		RentalLineItem tempSLI = new RentalLineItem(tempRentalItem);
    		lines.add(tempSLI);
    	}
			//*/
    }
}