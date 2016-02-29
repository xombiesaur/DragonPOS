
public class SaleItem {

    private String description;
    private double price;
    private String itemID;

    public SaleItem(double price, String itemID) {
        this.price = price;
        this.itemID = itemID;
    }

    public SaleItem(String description, double price, String itemID) {
        this(price, itemID);
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getItemID() {
        return itemID;
    }
}
