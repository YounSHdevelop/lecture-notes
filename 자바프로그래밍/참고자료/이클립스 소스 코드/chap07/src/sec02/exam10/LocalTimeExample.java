package sec02.exam10;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now(); 		// 현재 시간
        LocalTime open = LocalTime.of(9, 0); 	// 09:00
        LocalTime close = open.plusHours(10); 	// 10시간 후

        System.out.println("현재 시간: " + now);
        System.out.println("도넛 가게 오픈: " + open);
        System.out.println("도넛 가게 마감: " + close);
    }
}