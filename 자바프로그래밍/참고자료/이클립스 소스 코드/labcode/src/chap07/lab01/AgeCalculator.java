package chap07.lab01;

import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("당신의 출생 연도를 입력하세요(예: 2000): ");
        int birthYear = scanner.nextInt();  // 사용자로부터 정수 입력 받기

        LocalDate today = LocalDate.now();  // 현재 날짜 정보 가져오기
        int currentYear = today.getYear();  // 올해 연도만 추출

        int age = currentYear - birthYear;
        System.out.println("당신의 나이는 " + age + "세입니다.");
    }
}