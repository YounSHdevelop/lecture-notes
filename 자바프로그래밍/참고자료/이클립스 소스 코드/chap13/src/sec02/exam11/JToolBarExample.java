package sec02.exam11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToolBarExample extends JFrame {
    public JToolBarExample() {
        this.setTitle("JToolBar 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        
        JToolBar fileToolBar = new JToolBar("파일 툴바"); // JToolBar 생성
        fileToolBar.setFloatable(true); 
        fileToolBar.setOrientation(JToolBar.HORIZONTAL); 
        JTextArea textArea = new JTextArea("여기에 문서 내용이 표시됩니다.");

        JButton newBtn = new JButton(new ImageIcon("new.png"));
        newBtn.setToolTipText("새 파일"); // 툴팁 설정
        newBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "새 파일 실행"));

        JButton openBtn = new JButton(new ImageIcon("open.png"));
        openBtn.setToolTipText("파일 열기");
        openBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "파일 열기 실행"));

        JButton saveBtn = new JButton(new ImageIcon("save.png"));
        saveBtn.setToolTipText("저장");
        saveBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "저장 실행"));

        fileToolBar.add(newBtn);
        fileToolBar.add(openBtn);
        fileToolBar.addSeparator();  // 구분선 추가
        fileToolBar.add(saveBtn);

        this.add(fileToolBar, BorderLayout.NORTH);
        this.add(new JScrollPane(textArea), BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new JToolBarExample());
    }
}