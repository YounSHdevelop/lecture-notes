package sec02.exam08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); 	// 현재 날짜와 시간

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; 	// 월은 0부터 시작!
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int hour = cal.get(Calendar.HOUR_OF_DAY); 	// 24시간 형식
        int minute = cal.get(Calendar.MINUTE);

        System.out.println("오늘: " + year + "년 " + month + "월 " + day + "일");
        System.out.println("현재 시간: " + hour + "시 " + minute + "분");

        cal.add(Calendar.DATE, 7); 			// 7일 뒤로 이동

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1; 	// 월은 0부터 시작!
        day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("7일후: " + year + "년 " + month + "월 " + day + "일");
    }
}