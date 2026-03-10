package sec02.exam10;

import java.util.Scanner;		

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	
        int user;
        
        do {
            System.out.print("가위(0), 바위(1), 보(2) 중 선택: ");
            user = scanner.nextInt();		
         } while (user < 0 || user > 2);   // 0 ~ 2 값을 입력할 때 까지 반복 

        System.out.println("사용자의 선택: " + user);
        scanner.close();
    }
}