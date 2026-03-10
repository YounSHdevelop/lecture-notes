package chap09.lab02;

import java.io.*;

public class DataStreamLab {
    public static void main(String[] args) {
        String[] titles = {"미라클 자바", "미라클 HTML", "운영체제"};
        int[] prices = {32000, 31000, 33000};
        boolean[] available = {true, true, false}; 	// 판매 가능 여부

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("books.dat"))) {
        	out.writeInt(titles.length); 	       	// 책의 개수를 먼저 저장
            for (int i = 0; i < titles.length; i++) {
            	out.writeUTF(titles[i]);       		// 책 제목
                out.writeInt(prices[i]);       	    // 가격
                out.writeBoolean(available[i]); 	// 판매 여부
            }
            System.out.println(titles.length + "권의 책 정보가 저장됨.");
        } catch (IOException e) {
            System.err.println("쓰기 오류 발생!: " + e.getMessage());
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream("books.dat"))) {
            int count = in.readInt(); 	    		// 책의 개수 먼저 읽음
            System.out.println("\n파일에서 책 정보 읽기:");
            for (int i = 0; i < count; i++) {
                String title = in.readUTF();
                int price = in.readInt();
                boolean isAvailable = in.readBoolean();
                System.out.println("[" + (i + 1) + "] " + title + " - " + price + "원, 판매 가능: " + isAvailable);
            }
        } catch (IOException e) {
            System.err.println("읽기 오류 발생!: " + e.getMessage());
        }
    }
}