package sec01.exam09;

import java.awt.*;
import javax.swing.*;

public class JComboBoxExample extends JFrame {
    public JComboBoxExample() {
        this.setTitle("JComboBox 예제");
        this.setSize(300, 130);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        JLabel statusLabel = new JLabel("도넛 선택", JLabel.CENTER);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        String[] donuts = {"기본 도넛", "레몬 도넛", "딸기 도넛", "초코 도넛"};
        JComboBox<String> comboBox = new JComboBox<>(donuts);      
        comboBox.setSelectedIndex(0); 	//인덱스 0 항목 미리 선택

        comboBox.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            statusLabel.setText("선택된 도넛: " + selected);
        });

        panel.add(new JLabel("도넛을 선택하세요:"));
        panel.add(comboBox);
        this.add(panel, BorderLayout.CENTER);
        this.add(statusLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JComboBoxExample());
    }
}