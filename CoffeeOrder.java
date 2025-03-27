import java.sql.SQLOutput;

public class CoffeeOrder {

    // TODO 2: Create instance variables:
    String size;
    String type;// - type (String)
    private String orderID; // - orderID (String, make this one private)

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders = 0;

    // TODO 4: Create a no-arg constructor
    // Set size to "medium" and type to "black"
    // Increment totalOrders
    public CoffeeOrder() {
        this.size = "medium";
        this.type = "Black";
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    // Set type to "black" by default
    // Increment totalOrders
    public CoffeeOrder(String size) {
        this.size = size;
        this.type = "Black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    // Increment totalOrders
    public CoffeeOrder(String size, String type) {
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    // something like "Order: medium black"
    String describeOrder() {
        return "Order: " + size + " " + type;
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static int getTotalOrders() {
        return totalOrders;
    }
}
