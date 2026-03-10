package sec02.exam05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionExample extends JFrame {
    static JLabel infoLabel;
    
    public MouseMotionExample() {
        this.setTitle("MouseMotionListener 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());

        infoLabel = new JLabel("마우스를 클릭해요.");
        JPanel trackingPanel = new JPanel();
        trackingPanel.setBackground(new Color(255, 255, 200));

        trackingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {    // 이벤트 리스너
                infoLabel.setText("이동: (X: " + e.getX() + ", Y: " + e.getY() + ")");
            }

            @Override
            public void mouseDragged(MouseEvent e) {  // 이벤트 리스너
                infoLabel.setText("드래그: (X: " + e.getX() + ", Y: " + e.getY() + ")");
            }
        });

        this.add(trackingPanel, BorderLayout.CENTER);
        this.add(infoLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new MouseMotionExample());
    }
}