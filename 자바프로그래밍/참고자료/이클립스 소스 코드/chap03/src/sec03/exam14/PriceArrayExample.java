package sec03.exam14;

public class PriceArrayExample {
    public static void main(String[] args) {
        int[] price = { 2000, 2300, 2700, 3000 }; // 정수형 배열 price 선언
        int sum = 0;

        for (int i = 0; i < 4; i++) {	       // 인덱스 0부터 3까지 반복
            System.out.println("도넛 " + i + ": " + price[i] + "원");
            sum = sum + price[i];
        }
        System.out.println("총 도넛 가격: " + sum + "원");
    }
}