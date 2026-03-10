package sec01.exam05;

import java.util.Scanner;		

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	

        System.out.print("주문 입력: ");
        int menu = scanner.nextInt();		// 정수형 변수 입력받기
        
        switch (menu) {
            case 1:							// 메뉴 1번인 경우
                System.out.println("크림 도넛");
                break;
            case 2:							// 메뉴 2번인 경우
                System.out.println("딸기 도넛");
                break;
            case 3:							// 메뉴 3번인 경우
                System.out.println("너트 도넛");
                break;
            default:						// 1, 2, 3 이외의 모든 경우
                System.out.println("없는 메뉴입니다.");
        }
        scanner.close();
    }
}