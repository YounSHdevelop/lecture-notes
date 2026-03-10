package sec02.exam06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerExample extends JFrame {
    static JLabel infoLabel;

    public KeyListenerExample() {
        this.setTitle("KeyListener 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new BorderLayout());
        
        infoLabel = new JLabel("키를 누르세요.");
        JPanel panel = new JPanel();
        panel.setFocusable(true);   		     // 포커스 되도록 설정
        panel.requestFocusInWindow();		     // 강제 포커스 요청

        panel.addKeyListener(new KeyAdapter() {  // 리스너 등록
            @Override
            public void keyPressed(KeyEvent e) {  // 이벤트 리스너
                String keyText = KeyEvent.getKeyText(e.getKeyCode());
                infoLabel.setText("KeyPressed, code = " + e.getKeyCode() + " 이름: " + keyText);
            }
        });

        this.add(infoLabel, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.CENTER);
        this.add(panel); 
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new KeyListenerExample());
    }
}