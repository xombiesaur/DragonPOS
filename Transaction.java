public class Transaction{
	String type;
	Date returnDate;
	SalesLineItem[] lineItems;
	int curLineItem = 0;
	
	public Transaction(){
		Inventory inventory = new Inventory();
	}

	public boolean createLineItem(String itemId){
		Item newItem = inventory.getItemByID(itemID);
		if(newItem != null){
			//create new line item
			lineItems[curLineItem] = new SalesLineItem(newItem);
			curLineItem++;
			return true;
		}
		else{
			return false;
		}
	}
}