package sec02.exam03;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("FlowLayout 예제");
        jf.setSize(500, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout()); //기본값 FlowLayout.CENTER

        jf.add(new JButton("버튼 1"));
        jf.add(new JButton("버튼 2"));
        jf.add(new JButton("긴 버튼 3"));
        jf.add(new JButton("버튼 4"));

        // jf.pack(); // 컴포넌트의 크기에 맞춰 창 크기 조정
        jf.setVisible(true);
    }
}