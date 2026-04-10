package org.example;

import org.example.donation.Donation;
import org.example.donation.Donor;

import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    // Hard-coded demo users
    static Donor alice = new Donor("Alice", "Smith", "alice@example.com", "secret123", 4);
    static Donor eve   = new Donor("Eve",   "Taylor", "eve@example.com",  "pass",      2);

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      Heart & Love  –  Food Donation App  ");
        System.out.println("==========================================");

        boolean running = true;
        while (running) {
            printMainMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": demoViewProfile();             break;
                case "2": demoCompleteProfile();         break;
                case "3": demoViewAcceptableDonations(); break;
                case "4": demoDonationDetails();         break;
                case "0":
                    System.out.println("\nGoodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // ----------------------------------------------------------------
    // Menu
    // ----------------------------------------------------------------
    static void printMainMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. View donor profile");
        System.out.println("2. Complete profile check");
        System.out.println("3. View acceptable donations");
        System.out.println("4. View donation details");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    // ----------------------------------------------------------------
    // Demo 1 – view a donor profile
    // ----------------------------------------------------------------
    static void demoViewProfile() {
        System.out.println("\n[Demo: View Donor Profile]");
        System.out.println("  Name:           " + alice.getFirstName() + " " + alice.getLastName());
        System.out.println("  Email:          " + alice.getEmail());
        System.out.println("  Household size: " + alice.getHouseholdSize());

        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // ----------------------------------------------------------------
    // Demo 2 – completeProfile() on several cases
    // ----------------------------------------------------------------
    static void demoCompleteProfile() {
        System.out.println("\n[Demo: Complete Profile Check]");

        System.out.println("--- Case 1: Fully complete profile ---");
        new Donor("Bob", "Jones", "bob@example.com", "pass", 3).completeProfile();

        System.out.println("\n--- Case 2: Missing first name ---");
        new Donor("", "Jones", "bob@example.com", "pass", 3).completeProfile();

        System.out.println("\n--- Case 3: Household size is 0 ---");
        new Donor("Carol", "White", "carol@example.com", "pass", 0).completeProfile();

        System.out.println("\n--- Case 4: Missing email ---");
        new Donor("Dave", "Brown", "", "pass", 2).completeProfile();

        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // ----------------------------------------------------------------
    // Demo 3 – viewAcceptableDonations()
    // ----------------------------------------------------------------
    static void demoViewAcceptableDonations() {
        System.out.println("\n[Demo: View Acceptable Donations]");
        alice.viewAcceptableDonations();

        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // ----------------------------------------------------------------
    // Demo 4 – Donation fields and updates
    // ----------------------------------------------------------------
    static void demoDonationDetails() {
        System.out.println("\n[Demo: Donation Details]");

        Donation donation = new Donation("Canned Soup", 12, alice, null);

        System.out.println("Donation created:");
        System.out.println("  Item:     " + donation.getItemName());
        System.out.println("  Quantity: " + donation.getQuantity());
        System.out.println("  Donor:    " + donation.getDonor().getFirstName() + " " + donation.getDonor().getLastName());

        System.out.println("\n-- Updating item and quantity --");
        donation.updateItem("Canned Tomatoes");
        donation.setQuantity(20);
        System.out.println("  Item:     " + donation.getItemName());
        System.out.println("  Quantity: " + donation.getQuantity());

        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
}