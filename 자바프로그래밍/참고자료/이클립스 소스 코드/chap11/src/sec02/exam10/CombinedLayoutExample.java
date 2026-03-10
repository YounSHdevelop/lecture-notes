package sec02.exam10;

import java.awt.*;
import javax.swing.*;

public class CombinedLayoutExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("복합레이아웃 예제");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout());
        
        JPanel gridPanel = new JPanel();  // CENTER 영역에 들어갈 JPanel
        gridPanel.setLayout(new GridLayout(2, 2)); // 2x2 격자

        gridPanel.add(new JButton("좌상"));
        gridPanel.add(new JButton("우상"));
        gridPanel.add(new JButton("좌하"));
        gridPanel.add(new JButton("우하"));

        jf.add(gridPanel, BorderLayout.CENTER);
        jf.add(new JButton("확인"), BorderLayout.SOUTH);

        jf.setVisible(true);
    }
}