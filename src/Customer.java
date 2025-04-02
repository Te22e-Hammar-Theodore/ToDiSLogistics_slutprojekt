import java.util.ArrayList;

public class Customer extends User {

    //Attributes
    private ArrayList<Order> orders = new ArrayList<>();

    // Constructor for admin
    Customer(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void placeOrder(Order order) {

    }


}
