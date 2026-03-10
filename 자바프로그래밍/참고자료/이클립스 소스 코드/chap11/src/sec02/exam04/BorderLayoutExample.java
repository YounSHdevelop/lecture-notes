package sec02.exam04;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BorderLayout 예제");
        jf.setSize(500, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.setLayout(new BorderLayout(20, 10)); 

        jf.add(new JButton("북쪽"), BorderLayout.NORTH);
        jf.add(new JButton("남쪽"), BorderLayout.SOUTH);
        jf.add(new JButton("서쪽"), BorderLayout.WEST);
        jf.add(new JButton("동쪽"), BorderLayout.EAST);
        jf.add(new JButton("중앙"), BorderLayout.CENTER);

        jf.setVisible(true);
    }
}