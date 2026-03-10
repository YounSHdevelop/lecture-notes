package sec02.exam07;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("CardLayout Example");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout());         // 프레임 설정

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);
        cardPanel.add(new JButton("1번째 카드"), "Card1");
        cardPanel.add(new JButton("2번째 카드"), "Card2");
        cardPanel.add(new JButton("3번째 카드"), "Card3");

        JButton nextButton = new JButton("다음 카드로"); 
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);  // 다음 카드로 전환
            }
        });

        jf.add(cardPanel, BorderLayout.CENTER);
        jf.add(nextButton, BorderLayout.SOUTH);
        jf.setVisible(true);
    }
}