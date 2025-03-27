public class CoffeeShop {
    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder order1 = new CoffeeOrder("Latte", "Medium");
        CoffeeOrder order2 = new CoffeeOrder("Espresso", "Small");
        CoffeeOrder order3 = new CoffeeOrder("Cappuccino");

        // TODO 3: Call describeOrder() on each and print the result
        System.out.println(order1.describeOrder());
        System.out.println(order2.describeOrder());
        System.out.println(order3.describeOrder());

        // TODO 4: Print the total number of orders using
        System.out.println("Total orders: " + CoffeeOrder.getTotalOrders());
    }
}
