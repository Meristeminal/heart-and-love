package login;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int householdSize;
    private String password;
    

    public User(String firstName, String lastName, String email, int householdSize, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.householdSize = householdSize;
        this.password = password;
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
    
    public int getHouseholdSize() {
        return householdSize;
    }

    public String getPassword() {
        return password;
    }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHouseholdSize(int size) {
        this.householdSize = size;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean completeProfile() {
        boolean complete = 
            firstName != null && !firstName.isEmpty() &&
            lastName != null && !lastName.isEmpty() &&
            email  != null && !email.isEmpty() &&
            householdSize > 0;

        if (complete) {
            System.out.println("Account for " + email + " has been completed.");
        } else {
            if (firstName == null || firstName.isEmpty()) System.out.println("First name is missing.");
            if (lastName == null || lastName.isEmpty()) System.out.println("last name is missing.");
            if (email == null || email.isEmpty()) System.out.println("Email is missing.");
            if (householdSize == 0) System.out.println("Household size is set to 0.");
        }

        return complete;

    }

}