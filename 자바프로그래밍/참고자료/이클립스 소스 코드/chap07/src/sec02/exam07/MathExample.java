package sec02.exam07;

public class MathExample {
    public static void main(String[] args) {
        int price = 3500;
        double discount = 0.15;

        double newPrice = price * (1 - discount);
        long rounded = Math.round(newPrice); 	// 반올림

        System.out.println("원래 가격: " + price + "원");
        System.out.println("할인율: " + (int)(discount * 100) + "%");
        System.out.println("할인가(반올림): " + rounded + "원");

        int donuts = (int)(Math.random() * 5) + 1;   // 랜덤 개수 생성 (1~5)
        System.out.println("랜덤 구매 개수: " + donuts + "개");
        System.out.println("총 가격: " + (rounded * donuts) + "원");
    }
}