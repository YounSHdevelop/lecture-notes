package chap03.lab02;

import java.util.Scanner;		

public class StandGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	
        int com, user, bet, chip = 10;
        
        while (true){
            com = (int) (Math.random() * 10) + 1;   	// 1 ~ 10의 무작위 수
            user = (int) (Math.random() * 10) + 1;  	        // 1 ~ 10의 무작위 수
            System.out.println("\nyou = " + user + ", 칩은 " + chip + "개");
            System.out.print("배팅할 칩수 입력(0=포기): ");
            bet = scanner.nextInt();
            System.out.println("com = " + com);

            if (bet <= 0 || bet > chip) continue;      // 이번 판 포기
            if (com > user) {                               // 컴퓨터 승
                chip = chip - bet;                   	// 배팅한 칩 사라짐
                System.out.println("> 컴퓨터 승! 칩은 " + chip + "개");
            } else {                                  	        // 사용자 승
                chip = chip + bet;                    	// 배팅한 칩만큼 추가
                System.out.println("> 사용자 승! 칩은 " + chip + "개");
            }
            if (chip <= 0 || chip >= 30)  break;   // 게임 종료
        }
        scanner.close();
    }
}