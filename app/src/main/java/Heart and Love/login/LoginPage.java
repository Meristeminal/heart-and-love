package login;

// loginpage class file
public class LoginPage {
    private String username;
    private String password;
    private boolean isAuthenticated;
    private int loginAttempts;
    private final int MAX_ATTEMPTS = 3;

    // Constructor
    public LoginPage(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAuthenticated = false;
        this.loginAttempts = 0;
    }

    // Method to authenticate user
    public boolean login() {
        if (isLocked()) {
            System.out.println("Account locked due to too many failed login attempts.");
            return false;
        }

        if (isvalidCredentials(username, password)) {
            isAuthenticated = true;
            System.out.println("\nLogin successful!\n");
            return true;
        } else {
            loginAttempts++;
            return false;
        }
    }

    // Method to check if account is locked
    private boolean isLocked() {
        return loginAttempts >= MAX_ATTEMPTS;   
    }
    private boolean isvalidCredentials(String username, String password) {
        // In a real application, this method would check the credentials against a database
        return username.equals("admin") && password.equals("password");
    }

    public void logout() {
        this.username = null;
        this.password = null;
        this.isAuthenticated = false;
        System.out.println("\nSuccessfully logged out. Have a nice day!");
    }

}
