package sec02.exam04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseInfoExample extends JFrame {
    static JLabel infoLabel;

    public MouseInfoExample() {
        this.setTitle("MouseEvent 정보");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());

        infoLabel = new JLabel("마우스를 클릭해요.");
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 240, 255));

        panel.addMouseListener(new MouseAdapter() {  // 어댑터 클래스 사용
            @Override
            public void mousePressed(MouseEvent e) {  // 이벤트 리스너
                int x = e.getX();
                int y = e.getY();

                infoLabel.setText("좌표: (X: " + x + ", Y: " + y + ")");
            }
        });

        this.add(infoLabel, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null); 		// 화면 중앙 배치
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new MouseInfoExample());
    }
}