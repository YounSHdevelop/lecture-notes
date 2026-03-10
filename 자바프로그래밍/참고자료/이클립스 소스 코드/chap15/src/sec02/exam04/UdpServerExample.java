package sec02.exam04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServerExample {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(11234);
            System.out.println("[UDP 서버] 시작되었습니다. 포트: 11234");
            
            byte[] receiveData = new byte[1024];
            
            while(true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                
                socket.receive(receivePacket);
                
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                
                System.out.println("[수신] " + clientAddress + ":" + clientPort + " : " + message);
                
                String response = "Echo: " + message;
                byte[] sendData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                
                socket.send(sendPacket);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}