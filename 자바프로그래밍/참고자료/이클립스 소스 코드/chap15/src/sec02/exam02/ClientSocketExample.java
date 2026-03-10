package sec02.exam02;

import java.io.InputStream;
import java.net.Socket;
import java.net.InetSocketAddress;

public class ClientSocketExample {

    public static void main(String[] args) throws Exception {
        System.out.println("[클라이언트] 서버 연결 시도 중!");

        InetSocketAddress isa = new InetSocketAddress("127.0.0.1", 11234);
        Socket sd = new Socket();
        sd.connect(isa);

        System.out.println("[클라이언트] 서버 연결 성공!");

        InputStream is = sd.getInputStream();
        byte[] buffer = new byte[1024];
        int readByte = is.read(buffer);

        if (readByte != -1) {
            String message = new String(buffer, 0, readByte, "UTF-8");
            System.out.println("[클라이언트] 수신 메시지: " + message);
        }

        is.close();
        sd.close();

        System.out.println("[클라이언트] 연결 종료.");
    }
}