package sec01.exam08;

import java.awt.*;
import javax.swing.*;
import java.util.List;

public class JListExample extends JFrame {
    public JListExample() {
        this.setTitle("JList 예제");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 20));
        JLabel statusLabel = new JLabel("도넛 선택", JLabel.CENTER);

        String[] donuts = {"기본 도넛", "레몬 도넛", "딸기 도넛", "초코 도넛"};
        JList<String> donutList = new JList<>(donuts);    // JList 생성
        JScrollPane scrollPane = new JScrollPane(donutList);

        JButton selectButton = new JButton("선택 확인");
        selectButton.addActionListener(e -> {
            List<String> selected = donutList.getSelectedValuesList();

            if (selected.isEmpty()) {            // 선택 여부에 따라 라벨에 표시
                statusLabel.setText("선택된 도넛이 없습니다.");
            } else {
                statusLabel.setText("선택된 도넛: " + selected);
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(selectButton);
        this.add(panel, BorderLayout.CENTER);
        this.add(statusLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JListExample());
    }
}