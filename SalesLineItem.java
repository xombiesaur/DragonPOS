public class SalesLineItem{
    Item item;
    int quantity;

    public SalesLineItem(Item item){
        this.item = item;
        quantity = 1;
    }

    public SalesLineItem(int quantity){
	   this.quantity = quantity;
    }

    public double getSubtotal(){
	   return quantity * getPrice();
    }
}
