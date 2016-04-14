/*import java.util.ArrayList;
import java.util.List;

public class Transaction {

    List<RentalLineItem> rentals;
    List<SalesLineItem> sales;

    public Transaction() {
        rentals = new ArrayList<RentalLineItem>();
        sales = new ArrayList<SalesLineItem>();
    }

    public void addSaleLineItem(SalesLineItem saleLineItem) {
        sales.add(saleLineItem);
    }

    public void addRentalLineItem(RentalLineItem rentalLineItem) {
        rentals.add(rentalLineItem);
    }

    public boolean removeSaleLineItem(String itemID) {
        for (int i = 0; i < sales.size(); i++) {
            SalesLineItem lineItem = sales.get(i);
            if (lineItem.item.getItemID().equals(itemID)) {
                sales.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removeRentalLineItem(String itemID) {
        for (int i = 0; i < rentals.size(); i++) {
            RentalLineItem lineItem = rentals.get(i);
            if (lineItem.item.getItemID().equals(itemID)) {
                rentals.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public double getTotalCost() {
        double totalCost = 0;
        for(RentalLineItem lineItem : rentals) {
            totalCost += lineItem.getSubtotal();
        }
        for(SalesLineItem lineItem : sales) {
            totalCost += lineItem.getSubtotal();
        }
        return totalCost;
    }

//    public Transaction() {
//        Inventory inventory = new Inventory();
//    }
//
//    public boolean createLineItem(String itemId) {
//        SaleItem newItem = inventory.getItemByID(itemID);
//        if (newItem != null) {
//            //create new line item
//            lineItems[curLineItem] = new SalesLineItem(newItem);
//            curLineItem++;
//            return true;
//        } else {
//            return false;
//        }
//    }
}
*/