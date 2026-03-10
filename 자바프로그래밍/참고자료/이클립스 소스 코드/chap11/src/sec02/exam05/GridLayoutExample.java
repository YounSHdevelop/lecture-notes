package sec02.exam05;

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GridLayout 예제");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(2, 3));  // 2행 3열의 격자 레이아웃

        jf.add(new JButton("1"));
        jf.add(new JButton("2"));
        jf.add(new JButton("3"));
        jf.add(new JButton("4"));
        jf.add(new JButton("5"));
        jf.add(new JButton("6"));

        jf.setVisible(true);
    }
}