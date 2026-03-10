package sec01.exam06;

import java.util.Scanner;		// java.util 패키지를 가져와서 사용함

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	// 스캐너 객체 만들기

        System.out.print("정수를 입력하세요: ");
        int price = scanner.nextInt();	      		// 정수형 변수 입력받기
        System.out.println("입력한 정수: " + price);

        System.out.print("실수를 입력하세요: ");
        double weight = scanner.nextDouble(); 		// 실수형 변수 입력받기
        System.out.println("입력한 실수: " + weight);

        scanner.nextLine();                    		// 버퍼 비우기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();	        // 한 줄 입력받기
        System.out.println("입력한 이름: " + name);

        System.out.print("참/거짓 (true/false)를 입력하세요: ");
        boolean isFry = scanner.nextBoolean();		// 불리언 입력받기
        System.out.println("입력한 값: " + isFry);

        scanner.close();                     		// 스캐너 닫기
    }
}