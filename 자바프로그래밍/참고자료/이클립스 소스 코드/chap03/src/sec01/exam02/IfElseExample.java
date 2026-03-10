package sec01.exam02;

public class IfElseExample {
    public static void main(String[] args) {
        int price = 15000;

        if (price >= 20000) {		
            System.out.println("쿠폰 1장");   	// 조건이 참일 때 실행
        } else {		
            System.out.println("쿠폰 없음");   	// 조건이 거짓일 때 실행
        }
        System.out.println("또 방문해 주세요.");
    }
}