public class SalesLineItem{
    String itemID;
    int quantity;
    float price;
    String description = null;

    public SalesLineItem(String itemID, int quantity, float price){
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }
    public SalesLineItem(String itemID, int quantity, float price, String description){
        this(itemID, quantity, price);
        this.description = description;
    }

    public float getSubtotal(){
	   return quantity * price;
    }

    public String getItemID(){
    	return itemID;
    }

    public float getItemPrice(){
    	return price;
    }

    public void incrementBy(int q){
    	quantity += q;
    }

    public String getItemDescription(){
    	return description;
    }

    public int getQuantity(){
    	return quantity;
    }

}
