package schedule;
import java.util.HashMap;


/**
 * Stores and manages appointment
 */
public class Schedule {

   private final HashMap<String, Appointment> availableSlots = new HashMap<>();

   /**
    * Adds an appointment to the schedule 
    * @param appt
    */
    public void addAppointment(Appointment appt) throws AppointmentSlotFilledException {

        String apptId = appt.getId();
        if (availableSlots.containsKey(apptId)) {
            throw new AppointmentSlotFilledException(apptId);
        }
        availableSlots.put(appt.getId(), appt);
    }

    /**
     * Removes an appointment from the schedule 
     * @param id
     */
    public void cancelAppointment(String id) {
        availableSlots.remove(id);
    }

    /**
     * Retrieves an appointment from the schedule
     * @param id
     * @return the appointment with the same id. 
     */
    public Appointment getAppointment(String id) {
        return availableSlots.get(id);
    }


    public class AppointmentSlotFilledException extends Exception {
        public AppointmentSlotFilledException(String apptId) {
            super("Appointment slot "+apptId+" is already filled.");
        }
    }

}


