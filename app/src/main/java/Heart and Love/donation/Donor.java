// package org.example.donation;
package donation;
import java.time.LocalDateTime;
import java.util.ArrayList;


import login.User;
import schedule.*;

public class Donor extends User {
    private ArrayList<Donation> donations;

    // public Donor(){
    //     this.donations = new Arraylist<Donation>();
    // }

    public Donor(String firstName, String lastName, String email, int householdSize, String password){
        super(firstName, lastName, email, householdSize, password);
        this.donations = new ArrayList<>();
    }

    public void viewAcceptableDonations(){
        System.out.println("Acceptable donations: food, beverages, toiletries, medication");
    }

    public boolean scheduleDonations (String itemName, int quantity, LocalDateTime time, Schedule schedule){
        Appointment appointment = new Appointment(time, this.getFirstName(), schedule);
        try{
            // Schedule.addAppointment(appointment);
            Donation donation = new Donation (itemName, quantity, this, appointment);
            donations.add(donation);
            System.out.println("Donation schedule successful: \n" + donation.toString());
            Notification notification = new Notification(appointment);
            notification.sendReminder();
            return true;
        }
        catch(Exception e){
            System.out.println("Couldn't Schedule Donation!");
            return false;
        }

    }

    public void logDonations(){
        System.out.println("Donation Log is as follows:");
        for (Donation donation : donations){
            System.out.println("- "+ donation);
        }
    }

    public String toString(){
        String result = "Donor\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nEmail: " + getEmail();
        return result;
    }

}
