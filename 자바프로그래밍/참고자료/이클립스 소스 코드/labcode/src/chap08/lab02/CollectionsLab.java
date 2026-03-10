package chap08.lab02;

import java.util.*;

public class CollectionsLab {
    public static void main(String[] args) {
        
        List<String> donutsList = new ArrayList<>();    // ArrayList 사용
        donutsList.add("레몬 도넛");
        donutsList.add("초코 도넛");
        donutsList.add("딸기 도넛");
        donutsList.add("초코 도넛"); 						// 중복 허용
        System.out.println("=== List ===");
        System.out.println("판매된 도넛 목록: " + donutsList);
        System.out.println("첫 번째 판매 도넛: " + donutsList.get(0));

        Set<String> donutsSet = new HashSet<>(donutsList);  // HashSet 사용
        System.out.println("\n=== Set ===");
        System.out.println("판매된 도넛 종류: " + donutsSet);
       
        Map<String, Integer> menu = new HashMap<>();		// HashMpa 사용
        menu.put("레몬 도넛", 1500);
        menu.put("초코 도넛", 2000);
        menu.put("딸기 도넛", 2200);
        System.out.println("\n=== Map ===");
        System.out.println("도넛 메뉴판: " + menu);
        System.out.println("초코 도넛 가격: " + menu.get("초코 도넛") + "원");
    }
}