package chap07.lab02;

import java.util.*;

public class DonutMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구매할 도넛을 쉼표로 입력(예: 초코,딸기,레몬): ");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, ",");
        StringBuilder receipt = new StringBuilder();
        int totalPrice = 0;

        while (st.hasMoreTokens()) {
            String d = st.nextToken().trim();
            int price = (int)(Math.random() * 1500) + 2000;
            receipt.append(d).append("도넛: ").append(price).append("원\n");
            totalPrice += price;
        }

        int points = totalPrice * 7 / 100;

        System.out.println("\n[도넛 영수증]");
        System.out.println(receipt);
        System.out.println("총 금액: " + totalPrice + "원");
        System.out.println("적립 포인트(7%): " + points + "점");

        sc.close();
    }
}