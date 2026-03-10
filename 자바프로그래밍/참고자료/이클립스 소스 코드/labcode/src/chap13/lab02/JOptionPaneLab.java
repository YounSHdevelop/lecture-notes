package chap13.lab02;

import java.awt.*;
import javax.swing.*;

public class JOptionPaneLab extends JFrame {
    public JOptionPaneLab() {
        this.setTitle("JOptionPane 예제");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton openBtn = new JButton("대화 상자 열기");
        this.add(openBtn);

        openBtn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                this,                          	// 부모 컴포넌트
                "정말 진행하시겠습니까?",    			// 메시지
                "사용자 확인",               		// 타이틀
                JOptionPane.YES_NO_OPTION  		// '예/아니오' 사용
            );

            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "확인 버튼을 클릭!");
            }
        });
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JOptionPaneLab());
    }
}