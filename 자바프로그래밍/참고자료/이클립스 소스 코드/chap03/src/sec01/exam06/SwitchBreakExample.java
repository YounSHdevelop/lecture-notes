package sec01.exam06;

import java.util.Scanner;		

public class SwitchBreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	

        System.out.print("세트메뉴 입력: ");
        int menu = scanner.nextInt();		// 정수형 변수 입력받기
        
        switch (menu) {
            case 3:							// 세트메뉴 3번
                System.out.println("너트도넛");
            case 2:							// 세트메뉴 2번
                System.out.println("딸기도넛");
            case 1:							// 세트메뉴 1번
                System.out.println("크림도넛");
                break;
            default:						// 1, 2, 3 이외의 모든 경우
                System.out.println("없는 메뉴 입니다.");
        }
        scanner.close();
    }
}