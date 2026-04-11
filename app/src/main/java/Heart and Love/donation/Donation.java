package donation;
import login.User;
import schedule.Appointment;

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

    @Override
    public String toString(){
        String result = "Donation Appointment:\nItem: " + itemName + "\nQuantity: " + quantity + "\nDonor: " + donor.getFirstName() + " " + donor.getLastName();
        return result;
    }


}