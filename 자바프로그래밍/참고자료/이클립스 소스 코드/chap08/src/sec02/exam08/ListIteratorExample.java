package sec02.exam08;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>();
        orders.add("초코 도넛");
        orders.add("딸기 도넛");
        orders.add("크림 도넛");

        ListIterator<String> listIt = orders.listIterator();

        System.out.println("앞에서부터 출력:");
        while (listIt.hasNext()) {	    // 다음 순회 할 요소가 있는 동안 반복
            System.out.println(listIt.next());
        }

        System.out.println("\n뒤에서부터 출력:");
        while (listIt.hasPrevious()) {   // 이전 순회 할 요소가 있는 동안 반복
            System.out.println(listIt.previous());
        }
    }
}