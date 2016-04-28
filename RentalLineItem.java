/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amoah
 */
public class RentalLineItem {

    RentalItem item;
    int duration = 1;
    String itemID;
    int quantity;
    float price;
    String description = null;

    public RentalLineItem(String itemID, int duration, int quantity, float price, String description) {
        this.itemID = itemID;
        this.duration = duration;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public double getSubtotal() {
        return duration * quantity * price;
    }
    
    public String getItemID(){
    	return itemID;
    }

    public float getItemPrice(){
    	return price;
    }

    public void incrementBy(int q){
    	quantity += q;
    }

    public String getItemDescription(){
    	return description;
    }

    public int getQuantity(){
    	return quantity;
    }
    public int getDuration(){
    	return duration;
    }
}
