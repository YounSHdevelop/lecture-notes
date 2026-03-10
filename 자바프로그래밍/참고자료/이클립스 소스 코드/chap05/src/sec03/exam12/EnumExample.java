package sec03.exam12;

public class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        boolean isWeekday() {
            return ordinal() < 5;   // 5보다 작으면 true 반환, 아니면 false 반환
        }
    }

    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        System.out.println("오늘은 " + today + "입니다.");

        if (today.isWeekday()) {
            System.out.println("평일입니다.");
        } else {
            System.out.println("주말입니다.");
        }
    }
}