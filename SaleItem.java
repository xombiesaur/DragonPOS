
public class SaleItem {

    private String description;
    private float price;
    private String itemID;

    public SaleItem(float price, String itemID) {
        this.price = price;
        this.itemID = itemID;
    }

    public SaleItem(String description, float price, String itemID) {
        this(price, itemID);
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public String getItemID() {
        return itemID;
    }

    public String getDescription(){
        return description;
    }
}
