package chap09.lab01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteLab {
    public static void main(String[] args) {
        
        System.out.println("텍스트 입력! 'quit'을 입력하면 저장 종료.");
        
        try (Scanner scanner = new Scanner(System.in);
            FileWriter fout = new FileWriter("test.txt")) {
            String line;

            while (!(line = scanner.nextLine()).equals("quit")) {
            	fout.write(line + "\n");
            }
            System.out.println("'test.txt' 파일에 저장 완료!");
        } catch (IOException e) {
        	System.err.println("오류 발생!: " + e.getMessage());
        }
    }
}