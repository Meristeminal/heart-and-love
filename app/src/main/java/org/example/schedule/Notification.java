package org.example.schedule;
public class Notification{
    private Appointment appointment;

    public Notification(Appointment appointment){
        this.appointment = appointment;
    }

    public void sendReminder(){
      System.out.println("This is a reminder that you have an appointment!\n" + appointment.toString());
    }

    public void sendRecipientConfirmation(){
        System.out.println("You scheduled to receive a food donation!\n" + appointment.toString());
    }

    public void sendDonorConfirmation(){
        System.out.println("You are scheduled to donate! \n" + appointment.toString());
    }



}