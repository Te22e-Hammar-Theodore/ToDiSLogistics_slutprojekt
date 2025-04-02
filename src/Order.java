import java.util.Date;

public class Order {

    // Attributes
    private int orderID;
    private String status;
    private Date createdAt;
    private Destination destination;

    // Method for getting the current status
    public String getStatus() {
        return status;
    }


}
