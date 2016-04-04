public class SalesLineItem{
    SaleItem item;
    int quantity;

    public SalesLineItem(SaleItem item){
        this.item = item;
        quantity = 1;
    }

    public double getSubtotal(){
	   return quantity * item.getPrice();
    }

    public String getItemID(){
    	return item.getItemID();
    }

    public float getItemPrice(){
    	return item.getPrice();
    }

    public void increment(){
    	quantity++;
    }

    public String getItemDescription(){
    	return item.getDescription();
    }

    public int getQuantity(){
    	return quantity;
    }

}
