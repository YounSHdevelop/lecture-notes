package sec01.exam03;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (FileWriter fout = new FileWriter("new_menu.txt")) {
            fout.write("4. 크림 도넛\n");	// 문자열 단위로 파일에 쓰기
            fout.write("5. 딸기 도넛\n");
            fout.write("6. 생딸기 도넛\n");
            System.out.println("파일 쓰기 완료!");
        } catch (IOException e) {
            System.err.println("오류 발생!: " + e.getMessage());
        }
    }
}