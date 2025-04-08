public class User {

    // Attributes
    protected int id;
    protected String name;
    protected String email;
    protected String password;
    protected boolean isLoggedIn;

    // Constructor for User
    User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Method for assigning an id to the user
    public void setId(int id) {
        this.id = id;
    }

    // Method for getting the id of the user
    public int getID() {
        return id;
    }

    // Method for assigning a name to the user
    public void setName(String name) {
        this.name = name;
    }

    // Method for getting the name of the user
    public String getName() {
        return name;
    }

    // Method for assigning an email to the user
    public void setEmail(String email) {
        this.email = email;
    }

    // Method for getting the email of the user
    public String getEmail() {
        return email;
    }

    // Method for assigning a password to the user
    public void setPassword(String password) {
        this.password = password;
    }

    // Method for getting the email of the user
    public String getPassword() {
        return password;
    }

    // Method for logging in
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            isLoggedIn = true;
            return true;
        }
        return false;
    }

    // Method for logging out
    public void logout() {
        isLoggedIn = false;
    }

    // Method for
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
