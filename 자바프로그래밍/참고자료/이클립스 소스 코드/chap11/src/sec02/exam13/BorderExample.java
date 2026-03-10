package sec02.exam13;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BorderExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("경계선 예제");
        jf.setSize(300, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout());

        JPanel Panel = new JPanel();
        Panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
        Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));      
        JButton button1 = new JButton("버튼 1");
        JButton button2 = new JButton("버튼 2");
        
        Panel.add(button1);
        Panel.add(button2);
        jf.add(Panel, BorderLayout.CENTER);
        
        jf.setVisible(true);
    }
}