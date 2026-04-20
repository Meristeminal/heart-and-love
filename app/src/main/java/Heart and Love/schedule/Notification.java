package schedule;
public class Notification{
    private Appointment appointment;

    public Notification(Appointment appointment){
        this.appointment = appointment;
    }

    public void sendReminder(){
      System.out.println("\nThis is a reminder that you have an appointment!\n" + appointment.toString());
    }

    public void sendRecipientConfirmation(){
        System.out.println("\nYou scheduled to receive a food donation!\n" + appointment.toString());
    }

    public void sendDonorConfirmation(){
        System.out.println("\nYou are scheduled to donate!\n" + appointment.toString());
    }



}