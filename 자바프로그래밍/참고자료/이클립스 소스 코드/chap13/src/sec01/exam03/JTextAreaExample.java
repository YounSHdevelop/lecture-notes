package sec01.exam03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextAreaExample extends JFrame {
    public JTextAreaExample() {
        this.setTitle("JTextArea 예제");
        this.setSize(400, 350); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout()); 

        JTextArea textArea = new JTextArea(10, 30); // 10행 30열
        textArea.setLineWrap(true);  			// 자동 줄바꿈 활성화
        JScrollPane scrollPane = new JScrollPane(textArea); 
        
        JButton button = new JButton("콘솔에 문자 출력");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textArea.getText();
                System.out.println("--- JTextArea에 입력된 내용 시작 ---");
                System.out.println(inputText);
                System.out.println("--- JTextArea에 입력된 내용 끝 ---");
            }
        });

        this.add(scrollPane, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JTextAreaExample());
    }
}