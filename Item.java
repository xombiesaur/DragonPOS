public class Item{
	String description;
	double price;
	String itemID;

	public Item(double price, String itemID){
		this.price = price;
		this.itemID = itemID;
	}

	public Item(String description, double price, String itemID){
		Item(price, itemID);
		this.description = description;
	}

	public double getPrice(){
		return price;
	}
}