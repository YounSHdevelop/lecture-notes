package sec02.exam08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemListenerExample extends JFrame {
    public ItemListenerExample() {
        this.setTitle("ItemListener 예제");
        this.setSize(350, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JCheckBox agreeCheckBox = new JCheckBox("약관에 동의합니다.");
        JButton finishButton = new JButton("가입 완료");
        finishButton.setEnabled(false);

        agreeCheckBox.addItemListener(new ItemListener() { // 리스너 등록
            @Override
            public void itemStateChanged(ItemEvent e) {    // 이벤트 리스너
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    finishButton.setEnabled(true);
                } else {
                    finishButton.setEnabled(false);
                }
            }
        });

        this.add(agreeCheckBox);
        this.add(finishButton);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new ItemListenerExample());
    }
}