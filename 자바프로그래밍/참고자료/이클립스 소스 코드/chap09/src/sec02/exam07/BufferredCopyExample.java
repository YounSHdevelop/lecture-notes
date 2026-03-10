package sec02.exam07;

import java.io.*;

public class BufferredCopyExample {
    public static void main(String[] args) {
        try (BufferedReader fin = new BufferedReader(new FileReader("menu.txt"));
             BufferedWriter fout = new BufferedWriter(new FileWriter("new_menu.txt"))) {

            String line;
            while ((line = fin.readLine()) != null) { // 한 줄 씩 읽어오기
                fout.write(line);
                fout.newLine(); 			// 줄바꿈 추가
            }
            System.out.println("버퍼를 사용하여 복사 완료!");
        } catch (IOException e) {
            System.err.println("복사 중 오류 발생!: " + e.getMessage());
        }
    }
}