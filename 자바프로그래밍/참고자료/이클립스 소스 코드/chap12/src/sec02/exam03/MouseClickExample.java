package sec02.exam03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseClickExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Mouse Click 예제");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("마우스 클릭!", SwingConstants.CENTER);

        label.addMouseListener(new MouseListener() {  // 리스너 등록 
            @Override
            public void mouseClicked(MouseEvent e) {  // 이벤트 리스너 
                label.setText("마우스가 클릭 되었습니다!");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        jf.add(label);
        jf.setVisible(true);
    }
}