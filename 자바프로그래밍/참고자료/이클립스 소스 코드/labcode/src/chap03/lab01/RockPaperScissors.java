package chap03.lab01;

import java.util.Scanner;		

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	

        System.out.print("가위(0), 바위(1), 보(2) 중 선택: ");
        int user = scanner.nextInt();

        int com = (int) (Math.random() * 3);        // 0에서 2이하의 난수 생성
        System.out.println("컴퓨터의 선택: " + com);

        if (user == com) {
            System.out.println("비겼습니다!");
        } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
            System.out.println("사용자 승!");
        } else {
            System.out.println("컴퓨터 승!");
        }
        scanner.close();
    }
}