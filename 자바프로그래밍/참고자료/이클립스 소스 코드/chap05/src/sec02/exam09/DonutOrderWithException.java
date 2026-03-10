package sec02.exam09;

import java.util.Scanner;

public class DonutOrderWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] donutMenu = {"", "초코 도넛", "레몬 도넛", "딸기 도넛"};
        int[] donutPrices = {0, 2000, 2200, 2100};

        System.out.println("도넛 주문 시스템에 오신 것을 환영합니다!");
        System.out.println("1: 초코 도넛 (2000원)");
        System.out.println("2: 레몬 도넛 (2200원)");
        System.out.println("3: 딸기 도넛 (2100원)");
        System.out.print("도넛 번호를 입력하세요: ");

        try {
            int menuNum = scanner.nextInt();   // 입력한 값이 숫자가 아닌 경우
            String donut = donutMenu[menuNum]; // 존재하지 않는 번호 입력 시
            int price = donutPrices[menuNum];

            System.out.println(donut + "을(를) 선택하셨습니다.");
            System.out.println("결제 금액: " + price + "원");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("메뉴 번호 오류! 1~3번 중에서 선택해 주세요.");
        } catch (Exception e) {
            System.out.println("입력 오류! 숫자를 입력해 주세요.");
        } finally {
            System.out.println("도넛 가게를 이용해 주셔서 감사합니다.");
            scanner.close();
        }
    }
}