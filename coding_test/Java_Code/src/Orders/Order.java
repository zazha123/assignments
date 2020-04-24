package Orders;

public class Order {
    private final static String NEW = "NEW";
    private final static String DONE = "FULFILLED";

    static int id = 0;
    String state;
    int num;

    public Order() {
        state = NEW;
        num = ++id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "state='" + state + '\'' +
                ", num=" + num +
                '}';
    }
}
