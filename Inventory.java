
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    static private List<ItemStock> items;

    public Inventory() {
        items = new ArrayList<ItemStock>();
    }

    public SaleItem removeItem(String itemID) {
        for (ItemStock itemStock : items) {
            SaleItem item = itemStock.item;
            if (item.getItemID().equals(itemID) && itemStock.stock > 0) {
                itemStock.stock--;
                return item;
            }
        }
        return null;
    }

    public void addItem(SaleItem item, int stock) {
        for (ItemStock itemStock : items) {
            if (itemStock.item.getItemID().equals(item.getItemID())) {
                itemStock.stock += stock;
                return;
            }
        }
        items.add(new ItemStock(item, stock));
    }

    private class ItemStock {

        SaleItem item;
        int stock;

        public ItemStock(SaleItem item, int stock) {
            this.item = item;
            this.stock = stock;
        }
    }

}
