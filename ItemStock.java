public class ItemStock{
    String id;
    String description;
    float price;
    int quantity;

    public ItemStock(String id, String description, float price, int quantity){
	this(id, price, quantity);
	this.description = description;
    }
    
    public ItemStock(String id, float price, int quantity){
	this(id, price);
	this.quantity = quantity;
    }
    
  public ItemStock(String id, String description, float price){
	this(id, price);
	this.description = description;
    }

    public ItemStock(String id, float price){
	this.id = id;
	this.price = price;
	this.description = "";
	this.quantity = 0;
    }

    public String getID(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public float getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}