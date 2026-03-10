package sec02.exam05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClientExample {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int serverPort = 11234;
            
            Scanner scanner = new Scanner(System.in);
            
            while(true) {
                System.out.print("메시지 입력: ");
                String message = scanner.nextLine();
                
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                
                socket.send(sendPacket);
                
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                
                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("[서버 응답]: " + serverResponse);
            }
            socket.close();
            scanner.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}