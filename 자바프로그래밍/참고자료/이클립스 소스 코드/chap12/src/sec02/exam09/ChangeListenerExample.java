package sec02.exam09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeListenerExample extends JFrame {
    public ChangeListenerExample() {
        this.setTitle("ChangeListener 예제");
        this.setSize(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(250, 30));

        JButton increaseButton = new JButton("진행률 10% 증가");

        progressBar.addChangeListener(e -> {        // 이벤트 리스너
            JProgressBar source = (JProgressBar) e.getSource();
            int currentValue = source.getValue();

            if (currentValue >= 100) {
                increaseButton.setEnabled(false);
            }
        });

        increaseButton.addActionListener(e -> {
            int newValue = progressBar.getValue() + 10;
            progressBar.setValue(newValue);
        });

        this.add(progressBar);
        this.add(increaseButton);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new ChangeListenerExample());
    }
}