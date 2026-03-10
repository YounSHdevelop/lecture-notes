package sec02.exam04;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> donutMenu = new HashSet<>();

        donutMenu.add("초코 도넛");
        donutMenu.add("딸기 도넛");
        donutMenu.add("크림 도넛");
        donutMenu.add("초코 도넛"); // 중복된 값

        System.out.println("등록된 도넛 메뉴:");

        for (String donut : donutMenu) {
            System.out.println(donut);
        }
    }
}