import java.util.ArrayList;
import java.util.List;

public  class OrderClass {
    private static ArrayList<Order> orders = new ArrayList<>();

    public static ArrayList<Order> getOrders() {
        return orders;
    }

    public static void addorder(String name, String lastname, String pizza, String mytime){
        orders.add(new Order(name,lastname,pizza,mytime));
    }
}
