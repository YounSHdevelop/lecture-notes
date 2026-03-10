package sec01.exam04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) {
        try (FileReader fin = new FileReader("menu.txt");
             FileWriter fout = new FileWriter("new_menu.txt", true);) {

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            System.out.println("파일 이어서 복사 완료!");
        } catch (IOException e) {
            System.err.println("오류 발생!: " + e.getMessage());
        }
    }
}