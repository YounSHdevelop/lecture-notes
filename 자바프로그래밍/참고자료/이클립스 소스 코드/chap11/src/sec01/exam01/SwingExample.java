package sec01.exam01;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {

    	JFrame frame = new JFrame("Swing Example"); // JFrame 생성
        frame.setSize(300, 200);  					// 프레임 크기 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료방법

        JButton button = new JButton("Click Me");   // 버튼 생성 
        frame.add(button);							// 프레임에 버튼 추가
        
        frame.setVisible(true);   // 프레임 보이기

    }
}