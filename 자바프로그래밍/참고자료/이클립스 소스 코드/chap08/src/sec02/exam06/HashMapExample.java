package sec02.exam06;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> priceMap = new HashMap<>();

        priceMap.put("초코 도넛", 2500);
        priceMap.put("딸기 도넛", 2700);
        priceMap.put("크림 도넛", 2500);

        System.out.println("도넛 가격 목록:");
        for (String name : priceMap.keySet()) {
            System.out.println(name + ": " + priceMap.get(name) + "원");
        }
    }
}