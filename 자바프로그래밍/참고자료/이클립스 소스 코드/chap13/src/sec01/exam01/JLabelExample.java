package sec01.exam01;

import java.awt.*;
import javax.swing.*;

public class JLabelExample extends JFrame {
    public JLabelExample() {
        this.setTitle("JLabel 예제");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout()); 

        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel textLabel = new JLabel("미라클 자바");   // 문자 레이블
        ImageIcon icon = new ImageIcon("logo.png");     // 아이콘 생성
        JLabel imageLabel = new JLabel(icon);	   // 아이콘 레이블

        topPanel.add(textLabel);
        topPanel.add(imageLabel);
        this.add(topPanel, BorderLayout.CENTER); 

        JLabel combine = new JLabel("한빛아카데미", icon, JLabel.CENTER);
        combine.setVerticalTextPosition(JLabel.BOTTOM);   // 수직 위치 지정
        combine.setHorizontalTextPosition(JLabel.CENTER); // 수평 위치 지정
        this.add(combine, BorderLayout.SOUTH); 

        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JLabelExample());
    }
}