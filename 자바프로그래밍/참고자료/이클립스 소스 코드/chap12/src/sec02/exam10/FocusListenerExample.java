package sec02.exam10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusListenerExample extends JFrame {
    private JLabel statusLabel;
    private final Color BG = UIManager.getColor("Button.background");

    public FocusListenerExample() {
        this.setTitle("FocusListener 예제");
        this.setSize(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));

        JButton button1 = new JButton("시작 버튼");
        JButton button2 = new JButton("다음 버튼");
        addFocusListeners(button1, "시작");
        addFocusListeners(button2, "다음");

        this.add(button1);
        this.add(button2);
        this.setVisible(true);
    }

    private void addFocusListeners(JButton button, String name) {
        button.addFocusListener(new FocusAdapter() { // 리스너 등록
            @Override
            public void focusGained(FocusEvent e) {  // 이벤트 리스너
                button.setBackground(Color.CYAN);
            }

            @Override
            public void focusLost(FocusEvent e) {   // 이벤트 리스너
                if (!e.isTemporary()) {
                button.setBackground(BG);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FocusListenerExample());
    }
}