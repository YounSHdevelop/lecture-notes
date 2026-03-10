package sec01.exam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyExample {
    public static void main(String[] args) {
        long bytesCopied = 0;				// 복사된 바이트 양

        try (FileInputStream in = new FileInputStream("donut.png");
             FileOutputStream out = new FileOutputStream("donut-copy.png")) {
            byte[] buf = new byte[8192]; 		// 8KB 버퍼
            int n;

            while ((n = in.read(buf)) != -1) {	// 8KB 바이트 읽음
                out.write(buf, 0, n);			// buf에 있는 데이터 씀
                bytesCopied += n;
            }
            System.out.println(bytesCopied + "바이트 복사 완료");
        } catch (IOException e) {
            System.err.println("복사 중 오류 발생!: " + e.getMessage());
        }
    }
}