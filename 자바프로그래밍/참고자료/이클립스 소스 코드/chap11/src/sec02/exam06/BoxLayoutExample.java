package sec02.exam06;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BoxLayout 예제");
        jf.setSize(300, 150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));

        jf.add(new JButton("Button 1"));  // 컴포넌트 추가
        jf.add(new JButton("Button 2"));
        jf.add(new JButton("Button 3"));

        jf.setVisible(true);
    }
}