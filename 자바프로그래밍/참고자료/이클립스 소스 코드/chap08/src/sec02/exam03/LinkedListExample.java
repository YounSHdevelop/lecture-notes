package sec02.exam03;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> orders = new LinkedList<>();

        orders.add("초코 도넛");
        orders.add("딸기 도넛");
        orders.add("크림 도넛");

        System.out.println("현재 주문 목록:");
        for (String donut : orders) {
            System.out.println(donut);
        }

        orders.addFirst("기본 도넛"); // 맨 앞에 추가
        orders.addLast("생딸기 도넛"); // 맨 뒤에 추가

        System.out.println("\n도넛 추가 후:");
        for (String donut : orders) {
            System.out.println(donut);
        }

        orders.remove("딸기 도넛"); // 특정 도넛 삭제

        System.out.println("\n딸기 도넛 삭제 후:");
        for (String donut : orders) {
            System.out.println(donut);
        }
    }
}