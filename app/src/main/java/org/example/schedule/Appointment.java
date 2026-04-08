package org.example.schedule;
import java.time.LocalDateTime;
import java.util.List;

import org.example.User;

/**
 * Stores information about an appointment. 
 */
class Appointment { 
    
    private final LocalDateTime dateTime; 
    private final List<User> participants;

    public Appointment(LocalDateTime dateTime, List<User> participants) {
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

    public List<User> getParticipants() {
        return participants;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String toString(){
        String result = "The appointment will occur at " + getId() + " and includes the following participants:\n" +  participants.toString();
        return result;
    
    }
}


