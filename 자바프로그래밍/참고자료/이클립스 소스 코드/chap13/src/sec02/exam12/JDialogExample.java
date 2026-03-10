package sec02.exam12;

import java.awt.*;
import javax.swing.*;

class MyDialog extends JDialog {
    private boolean confirmed = false;

    public MyDialog(Frame owner, String title) {
        super(owner, title, true);     // true: 모달
        this.setLayout(new BorderLayout(10, 10));
        JLabel label = new JLabel("정말 진행하시겠습니까?", JLabel.CENTER);
        this.add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton okBtn = new JButton("확인");
        okBtn.addActionListener(e -> {
            confirmed = true;
            dispose();			// 자원 해제 후 창 닫기
        });
        JButton cancelBtn = new JButton("취소");
        cancelBtn.addActionListener(e -> dispose());

        panel.add(okBtn);
        panel.add(cancelBtn);
        this.add(panel, BorderLayout.SOUTH);
        this.setSize(250, 150);
        this.setLocationRelativeTo(owner);
    }

    public boolean isConfirmed() {
        return confirmed;
    }
}

public class JDialogExample extends JFrame {
    public JDialogExample() {
        this.setTitle("JDialog 예제");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton openBtn = new JButton("대화 상자 열기");
        this.add(openBtn);
        openBtn.addActionListener(e -> {
            MyDialog dialog = new MyDialog(this, "사용자 확인");
            dialog.setVisible(true);       // 모달 대화상자
            if (dialog.isConfirmed()) {
                JOptionPane.showMessageDialog(this, "확인 버튼을 클릭!");
            }
        });
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JDialogExample());
    }
}