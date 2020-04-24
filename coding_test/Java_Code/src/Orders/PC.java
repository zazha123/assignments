package Orders;

import java.util.LinkedList;

public class PC {
    LinkedList<Order> list = new LinkedList<>();
    int capacity = 5;

    int cnt = 0;
    public void produce() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while(list.size() == capacity) wait();

                Order o = new Order();

                list.add(o);
                System.out.println("produce " + o);

                notify();

                Thread.sleep(200);
            }

        }
    }

    public void consume() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while(list.size() == 0) wait();

                Order o = list.removeFirst();
                o.state = "FULFILLED";

                System.out.println("cosumed " + o);

                notify();

                Thread.sleep(200);
            }

        }
    }
}
