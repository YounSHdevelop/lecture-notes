package sec02.exam11;

import java.awt.*;
import javax.swing.*;

public class ColorExample extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Color 예제");
        jf.setSize(400, 200); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(1, 2)); 

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW); 
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 0, 50)); 
        
        jf.add(panel1); // 왼쪽 칸에 배치
        jf.add(panel2); // 오른쪽 칸에 배치
        
        jf.setVisible(true);
    }
}