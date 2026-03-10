package sec02.exam11;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // 현재 날짜 및 시간
        LocalDateTime meeting = LocalDateTime.of(2025, 8, 10, 14, 30);

        System.out.println("현재: " + now);
        System.out.println("다음 미팅 시간: " + meeting);
        System.out.println("미팅 30분 전: " + meeting.minusMinutes(30));
    }
}