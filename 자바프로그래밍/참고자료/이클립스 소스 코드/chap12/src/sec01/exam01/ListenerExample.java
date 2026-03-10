package sec01.exam01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListenerExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Click 예제");
        jf.setSize(300, 150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout()); 

        JButton button = new JButton("Click Me");       	// 버튼 생성
        JLabel label = new JLabel("버튼을 클릭해 보세요.");  		// 레이블 생성

        button.addActionListener(new ActionListener() { 	// 리스너 등록 
            @Override
            public void actionPerformed(ActionEvent e) {	// 이벤트 리스너
                label.setText("버튼이 클릭 되었습니다!");   		// 레이블에 출력
            }
        });

        jf.add(button, BorderLayout.CENTER);
        jf.add(label, BorderLayout.SOUTH);
        jf.setVisible(true);
    }
}