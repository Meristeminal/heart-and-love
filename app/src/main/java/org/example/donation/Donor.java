package org.example.donation;
import java.time.LocalDateTime;
import java.util.*;

import org.example.schedule.*;
import org.example.User;

public class Donor extends User {
    private List<Donation> donations;

    public Donor(){
        this.donations = new Arraylist<>();
    }

    public Donor(String firstName, String lastName,, String email, String password, int householdSize){
        super(firstName, lastName, email, password, householdSize);
        this.donations = new Arraylist<>();
    }

    public void viewAcceptableDonations(){
        System.out.println("Acceptable donations: food, beverages, toiletries, medication");
    }

    public boolean scheduleDonations(String itemName, int quantity, LocalDateTime slot, Schedule schedule){
        
        /*
        if (schedule.makeAppointment(slot, this)){
            Donation donation = new Donation (itemName, quantity, slot);
            donations.add(donation);
            System.out.println("Donation schedule successful: " + donation);
            return true;
        }
8?*/


        System.out.println("Unable to schedule donation because slot is unavailable.");
        return false;
    }

    public void logDonations(){
        System.out.println("Donation Log is as follows:");
        for (Donation donation : donations){
            System.out.println("- "+ donation);
        }
    }

}
