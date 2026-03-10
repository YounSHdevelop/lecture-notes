package sec02.exam07;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>();
        orders.add("초코 도넛");
        orders.add("딸기 도넛");
        orders.add("크림 도넛");

        Iterator<String> it = orders.iterator();

        while (it.hasNext()) {
            String donut = it.next();
            System.out.println("주문 도넛: " + donut);
        }
    }
}