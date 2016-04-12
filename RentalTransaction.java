
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