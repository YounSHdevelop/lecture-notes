package chap02.lab02;

import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        
        Scanner sin = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age  = sin.nextInt();
 
        sin.nextLine();
        System.out.print("이름을 입력하세요: ");
        String name = sin.nextLine();
        System.out.print("\n" + name + "님의 나이는 " + age + "입니다.\n");
        
        sin.close();
    }
}