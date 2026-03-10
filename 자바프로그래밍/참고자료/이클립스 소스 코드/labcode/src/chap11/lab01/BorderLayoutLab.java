package chap11.lab01;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutLab extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BorderLayout 예제");
        jf.setSize(600, 300); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout(10, 10)); 
        
        JButton btn1 = new JButton("NORTH (북쪽)");
        btn1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        btn1.setForeground(Color.WHITE); 
        btn1.setBackground(new Color(255, 102, 102)); 
        jf.add(btn1, BorderLayout.NORTH);

        JButton btn2 = new JButton("CENTER (중앙)"); 
        btn2.setFont(new Font("Serif", Font.ITALIC, 24)); 
        btn2.setBackground(Color.CYAN); 
        jf.add(btn2, BorderLayout.CENTER); 
  
        jf.setVisible(true);
    }
}