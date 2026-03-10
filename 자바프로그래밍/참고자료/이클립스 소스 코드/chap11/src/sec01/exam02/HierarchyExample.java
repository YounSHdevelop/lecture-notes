package sec01.exam02;

import java.awt.*;
import javax.swing.*;

public class HierarchyExample extends JFrame {
    public static void main(String[] args) {
    	JFrame jf = new JFrame("Swing Example"); 	// 최상위 컨테이너: jf
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel(); 	// 중간 컨테이너: JPanel1 생성
        panel1.setBorder(BorderFactory.createTitledBorder("패널1"));

        JPanel panel2 = new JPanel();		// 중간 컨테이너: JPanel2 생성
        panel2.setBorder(BorderFactory.createTitledBorder("패널2"));

        JButton button1 = new JButton("버튼 1"); // 기본 컴포넌트
        JButton button2 = new JButton("버튼 2");

        panel1.add(button1);         		// 기본 컴포넌트를 패널에 추가
        panel2.add(button2);

        jf.add(panel1, BorderLayout.WEST); // 패널을 프레임 왼쪽에 추가
        jf.add(panel2, BorderLayout.EAST); // 패널을 프레임 오른쪽에 추가
        jf.setVisible(true);    		// 프레임 보이기
    }
}