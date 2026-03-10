package sec01.exam07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderExample extends JFrame {
    public JSliderExample() {
        this.setTitle("JSlider 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        JLabel statusLabel = new JLabel("현재 볼륨: 50", JLabel.CENTER);
        statusLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));

        JSlider volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        volumeSlider.setMajorTickSpacing(20); // 주 눈금 간격
        volumeSlider.setMinorTickSpacing(5);  // 보조 눈금 간격
        volumeSlider.setPaintTicks(true);     // 눈금 표시
        volumeSlider.setPaintLabels(true);    // 숫자 표시
        volumeSlider.setSnapToTicks(true);    // 눈금 단위로 이동

        volumeSlider.addChangeListener(e -> {
            int volume = volumeSlider.getValue();
            statusLabel.setText("현재 볼륨: " + volume);
        });

        this.add(statusLabel, BorderLayout.NORTH);
        this.add(volumeSlider, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JSliderExample());
    }
}