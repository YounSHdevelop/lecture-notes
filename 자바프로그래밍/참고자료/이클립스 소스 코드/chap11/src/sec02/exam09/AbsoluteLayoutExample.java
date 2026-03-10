package sec02.exam09;

import java.awt.*;
import javax.swing.*;

public class AbsoluteLayoutExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("AbsoluteLayout 예제");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 200);
        jf.setLayout(null);         // 배치 관리자 비활성화

        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 50, 100, 30); // x, y, width, height
        jf.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(150, 100, 120, 30);
        jf.add(button2);
        
        jf.setVisible(true);
    }
}