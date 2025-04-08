import Vehicle.Vehicle;

import java.util.ArrayList;

public class System {

    // Attributes
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public System() {
        this.users = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    // Method for adding new users
    public void addUser(User user) {
        users.add(user);
    }

    // Method for adding new vehicles
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Method for getting user information
    public ArrayList<User> getUser() {
        return users;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicles;
    }
}
