package sec02.exam12;

import java.awt.*;
import javax.swing.*;

public class FontExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("폰트 예제");
        jf.setSize(300, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        
        JButton button1 = new JButton("Button 1");
        Font font1 = new Font("맑은 고딕", Font.ITALIC, 16);
        button1.setFont(font1);

        JButton button2 = new JButton("Button 2");
        Font font2 = new Font("Consolas", Font.BOLD + Font.ITALIC, 16);
        button2.setFont(font2);

        jf.add(button1);
        jf.add(button2);
        jf.setVisible(true);
    }
}