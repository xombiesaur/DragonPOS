public class SalesLineItem{
    SaleItem item;
    int quantity;

    public SalesLineItem(SaleItem item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public double getSubtotal(){
	   return quantity * item.getPrice();
    }
}
