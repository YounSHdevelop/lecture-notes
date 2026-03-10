package sec02.exam01;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;

public class ServerSocketExample {
    public static void main(String[] args) throws Exception {
        ServerSocket sd = new ServerSocket();
        InetSocketAddress isa = new InetSocketAddress(11234);

        sd.bind(isa);

        System.out.println("[서버] 시작됨. 클라이언트 연결 대기 중!");
        
        while(true) { 	         // 서버는 데몬(Daemon)으로 계속 반복 수행
            Socket sa = sd.accept();  // 클라이언트 연결 수락 및 통신 소켓반환
            InetSocketAddress clientAddress = (InetSocketAddress) sa.getRemoteSocketAddress();
            System.out.println("[서버] 연결 수락: " + clientAddress.getHostString());

            OutputStream os = sa.getOutputStream(); 
            String message = "Hello Client from Server!"; // 전송할 메시지
            byte[] bytes = message.getBytes("UTF-8");

            os.write(bytes); 		// 데이터 전송
            os.flush();      		// 버퍼에 남아있는 데이터 강제 전송
            System.out.println("[서버] 데이터 전송 완료: [" + message + "]");
 
            os.close();
            sa.close();
            // 참고: sd.close()는 서버 서비스를 완전히 종료할 때 사용
        }
    }
}