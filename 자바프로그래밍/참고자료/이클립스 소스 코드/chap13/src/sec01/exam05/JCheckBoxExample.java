package sec01.exam05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxExample extends JFrame {
    public JCheckBoxExample() {
        this.setTitle("JCheckBox 예제");
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));
        JLabel statusLabel = new JLabel("선택하세요!", JLabel.CENTER); 

        JCheckBox lemonDonut = new JCheckBox("레몬 도넛");
        JCheckBox chocoDonut = new JCheckBox("초코 도넛");
        lemonDonut.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    statusLabel.setText("레몬 도넛 선택");
                } else {
                    statusLabel.setText("레몬 도넛 해제");
                }
            }
        });

        chocoDonut.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    statusLabel.setText("초코 도넛 선택");
                } else {
                    statusLabel.setText("초코 도넛 해제");
                }
            }
        });

        this.add(lemonDonut, BorderLayout.EAST);
        this.add(chocoDonut, BorderLayout.WEST);
        this.add(statusLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JCheckBoxExample());
    }
}