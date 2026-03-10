package sec02.exam06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferredReaderExample {
    public static void main(String[] args) {
        try (BufferedReader fin = new BufferedReader(new FileReader("menu.txt"))) {

            String line;
            while ((line = fin.readLine()) != null) { // 한 줄 씩 읽어오기
               System.out.print(line);
            }
        } catch (IOException e) {
            System.err.println("복사 중 오류 발생!: " + e.getMessage());
        }
    }
}