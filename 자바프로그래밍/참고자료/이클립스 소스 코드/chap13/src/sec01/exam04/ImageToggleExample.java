package sec01.exam04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageToggleExample extends JFrame{
    static boolean isAni1 = true;  // 객체가 공유하는 static 변수

    public ImageToggleExample() {
        this.setTitle("이미지 변경 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JLabel imageLabel = new JLabel(new ImageIcon("img1.png"));
        this.add(imageLabel);

        JButton toggleButton = new JButton("그림 변경");
        this.add(toggleButton);
            
        toggleButton.addActionListener(e -> {
            if (isAni1) {
                imageLabel.setIcon(new ImageIcon("img2.png"));
                isAni1 = false;
            } else {
                imageLabel.setIcon(new ImageIcon("img1.png"));
                isAni1 = true;
            }
        });

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new ImageToggleExample());
    }
}