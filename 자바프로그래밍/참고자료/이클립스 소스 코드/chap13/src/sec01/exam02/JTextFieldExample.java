package sec01.exam02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldExample extends JFrame {
    public JTextFieldExample() {
        this.setTitle("JTextField 예제");
        this.setSize(350, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JPanel inputPanel = new JPanel();
        JLabel resultLabel = new JLabel();
        resultLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));

        JLabel inputLabel = new JLabel("이름을 입력하세요:");
        JTextField textField = new JTextField(10); // 문자길이 10

        JButton button = new JButton("확인");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                if (name.trim().isEmpty()) {
                    resultLabel.setText("이름을 입력해 주세요!");
                } else {
                    resultLabel.setText("Hi! " + name + "님!");
                }
            }
        });

        inputPanel.add(inputLabel);
        inputPanel.add(textField);
        inputPanel.add(button);
        this.add(inputPanel);
        this.add(resultLabel); 
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JTextFieldExample());
    }
}