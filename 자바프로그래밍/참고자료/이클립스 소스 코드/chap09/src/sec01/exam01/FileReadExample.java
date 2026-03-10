package sec01.exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (FileReader fin = new FileReader("menu.txt")) {
            int ch;
            while ((ch = fin.read()) != -1) { // 한 문자씩 읽어 정수로 반환
                System.out.print((char) ch);      
            }   
        } catch (IOException e) {
        	System.err.println("오류 발생!: " + e.getMessage());
        }
    }
}