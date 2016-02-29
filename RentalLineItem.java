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

    public RentalLineItem(RentalItem item, int duration) {
        this.item = item;
        this.duration = duration;
    }

    public double getSubtotal() {
        return duration * item.getPrice();
    }
}
