package schedule;
import java.time.LocalDateTime;

/**
 * Stores information about an appointment. 
 */
public class Appointment { 
    
    private final LocalDateTime dateTime; 
    private final String participants;

    public Appointment(LocalDateTime dateTime, String participants, Schedule schedule) {
        this.dateTime = dateTime;
        this.participants = participants;
    }

    /**
     * Gets the id based on the date. 
     * @return
     */
    String getId() {
        return this.dateTime.toString();
    }

    public String getParticipants() {
        return participants;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String toString(){
        String result = "The appointment will occur at " + getId() + " and includes the following participants:\n" +  participants;
        return result;
    
    }
}


