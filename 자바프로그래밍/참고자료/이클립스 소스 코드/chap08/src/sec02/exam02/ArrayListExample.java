package sec02.exam02;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("초코 도넛");
        al.add("딸기 도넛");
        al.add("크림 도넛");
        al.add(1, "기본 도넛");

        System.out.println("총 주문 수: " + al.size());

        for (int i = 0; i < al.size(); i++) {
            System.out.println( i + "번 위치: " + al.get(i));
        }

        al.remove("딸기 도넛");
        al.remove(0);

        System.out.println("\n도넛 삭제 후 주문 목록:");
        for (String order : al) {
            System.out.println(order);
        }
    }
}