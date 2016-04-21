
import java.util.ArrayList;
import java.util.Scanner;

public class SalesTransaction{
	Inventory inventory;
	ArrayList<SalesLineItem> lines = new ArrayList<SalesLineItem>();

    public SalesTransaction(){
		inventory = new Inventory();
    }

    public String addItemByIDAndQuantity(String itemID, int quantity){
    	//check for item in inventory
        int curStock = inventory.itemInSaleInventory(itemID);
    	if(curStock <= 0){
    		return "The item with id "+itemID+" is not currently in our inventory.";
    	}
        else if(curStock < quantity){
            return "You have requested more of this item than is in stock.";
        }
        else{
            boolean exists = false;
            //check for item already in inventory
            for(SalesLineItem lineItem : lines){
                if(lineItem.getItemID().equals(itemID)){
                    //increment existing lineItem conatianing item to be added
                    lineItem.incrementBy(quantity);
                    exists = true;
                }
            }
            if(!exists){
                //create new salesline item
                lines.add(new SalesLineItem(itemID, quantity, inventory.getSaleItemPriceFromID(itemID), inventory.getSaleItemNameFromID(itemID)));
            }
            return "This item was added to sales transaction successfuly.";
        }
    }

    public void getPayment(Scanner scanner){
    	System.out.printf("Please choose method of payment. (cash or card): ");
    	String paymentMethod = scanner.next();
    	if(paymentMethod.equals("cash")){
    		System.out.println();
    		System.out.println("Please pay Cashier.");
    		return;
    	}
    	else if(paymentMethod.equals("card")){
    		System.out.printf("Please enter card number: ");
    		String cardNum = scanner.next();
    		System.out.println();
    		System.out.println("Approving card...");
    		//add in actual card approving method when database is set up
    		System.out.println("Card was approved. Thank you!");
    		System.out.println();
    		return;
    	}
    	else{
    		System.out.println("You did not select an acceptable payment method. Please try again.");
    		getPayment(scanner);
    	}
    }

    public void printReceipt(){
    	float subtotal = 0;
    	for(SalesLineItem line : lines){
    		System.out.printf("%-8s %-15s\t%d x %.2f\t%.2f\n", line.getItemID(), line.getItemDescription(), line.getQuantity(), line.getItemPrice(), line.getSubtotal());
    		subtotal += line.getSubtotal();
    	}
    	System.out.printf("Subtotal%46.2f\n\n", subtotal);
    }

}