package org.example.donation;
import org.example.User;
import org.example.schedule.Appointment;

public class Donation {
    private String itemName;
    private int quantity;
    private User donor;
    private Appointment appointment;

    public Donation(String itemName, int quantity, User donor, Appointment appointment){
        this.itemName = itemName;
        this.quantity = quantity;
        this.donor = donor;
        this.appointment = appointment;
    }

    // Getters in case we need 'em
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public User getDonor() {
        return donor;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    // Setters for the same reason
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void updateItem(String newItemName) {
        this.itemName = newItemName;
    }

    /* potentially of use
    public void printDetails(){
        System.out.println(this);
    }
    PS - do we need a toString method?
    */


}