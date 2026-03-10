package sec01.exam02;

import java.io.FileReader;
import java.io.IOException;

public class MultipleReadExample {
    public static void main(String[] args) {
        try (FileReader fin = new FileReader("menu.txt")) {
            char[] cbuf = new char[10];  // 10 크기의 문자 배열 cbuf
            int count;

            while ((count = fin.read(cbuf)) != -1) { // 10개 문자 읽기
                for (int i = 0; i < count; i++) { 
                    System.out.print(cbuf[i]);  
                }
            }        
        } catch (IOException e) {
            System.err.println("오류 발생!: " + e.getMessage());
        }
    }
}