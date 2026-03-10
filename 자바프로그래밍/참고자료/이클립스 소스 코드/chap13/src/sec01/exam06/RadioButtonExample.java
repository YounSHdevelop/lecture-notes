package sec01.exam06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonExample extends JFrame {
    public RadioButtonExample() {
        this.setTitle("JRadioButton 예제");
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));
        JLabel statusLabel = new JLabel("토핑 선택", JLabel.CENTER); 

        ButtonGroup group = new ButtonGroup(); // 논리적 컨테이너
        JRadioButton option1 = new JRadioButton("기본 토핑", true);
        JRadioButton option2 = new JRadioButton("스페셜 토핑");
        group.add(option1);
        group.add(option2);

        option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton source = (JRadioButton) e.getSource();
                statusLabel.setText("선택된 토핑: " + source.getText());
            }
        });

        option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton source = (JRadioButton) e.getSource();
                statusLabel.setText("선택된 토핑: " + source.getText());
            }
        });

        this.add(option1, BorderLayout.WEST);
        this.add(option2, BorderLayout.EAST);
        this.add(statusLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new RadioButtonExample());
    }
}