package sec01.exam03;

import java.util.Scanner;		

public class IfElseIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	

        System.out.print("쿠폰 수 입력: ");
        int coupon = scanner.nextInt();		// 정수형 변수 입력받기
        
        if (coupon >= 10) {					// coupon이 10개 이상
            System.out.println("도넛 4개 무료");
        } else if (coupon >= 3) {			// coupon이 3 - 9개
            System.out.println("무료 음료");
        } else {							// coupon이 2개 이하
            System.out.println("다음 기회에");
        }
        scanner.close();				
    }
}