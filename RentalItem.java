/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amoah
 */
public class RentalItem {
    
    private String description;
    private double pricePerDay;
    private String itemID;

    public RentalItem(double pricePerDay, String itemID) {
        this.pricePerDay = pricePerDay;
        this.itemID = itemID;
    }

    public RentalItem(String description, double pricePerDay, String itemID) {
        this(pricePerDay, itemID);
        this.description = description;
    }

    public double getPrice() {
        return pricePerDay;
    }

    public String getItemID() {
        return itemID;
    }
}
