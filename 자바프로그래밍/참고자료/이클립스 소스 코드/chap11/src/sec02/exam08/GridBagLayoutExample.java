package sec02.exam08;

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GridBagLayout 예제");
        jf.setSize(300, 150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        JButton button1 = new JButton("버튼 1");
        gbc.gridx = 0; 	    // 열(gridx)의 인덱스 0
        gbc.gridy = 0;		// 행(gridy)의 인덱스 0
        jf.add(button1, gbc);

        JButton button2 = new JButton("버튼 2");
        gbc.gridx = 1;		// 열(gridx)의 인덱스 1
        gbc.gridy = 0;		// 행(gridy)의 인덱스 0
        jf.add(button2, gbc);

        JButton button3 = new JButton("버튼 3");
        gbc.gridx = 0;		// 열(gridx)의 인덱스 0
        gbc.gridy = 1;		// 행(gridy)의 인덱스 1
        gbc.gridwidth = 2;   // 컴포넌트가 차지할 열(gridwidth)의 개수 2
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jf.add(button3, gbc);

        jf.setVisible(true);
    }
}