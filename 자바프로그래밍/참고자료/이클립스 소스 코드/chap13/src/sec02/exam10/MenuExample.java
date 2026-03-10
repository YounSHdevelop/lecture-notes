package sec02.exam10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuExample extends JFrame {
    public MenuExample() {
        this.setTitle("메뉴 만들기 예제");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar(); // 메뉴바 생성 및 프레임에 부착
        this.setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("파일"); // JMenu 생성 및 메뉴바에 추가
        menuBar.add(fileMenu);
        JMenuItem newItem = new JMenuItem("새로 만들기");// JMenuItem 생성
        JMenuItem openItem = new JMenuItem("열기");
        JMenuItem exitItem = new JMenuItem("종료");

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "새 문서를 만듭니다.");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0); 		// 프로그램 종료
            }
        });

        fileMenu.add(newItem);     		// JMenu에 JMenuItem을 추가
        fileMenu.add(openItem);
        fileMenu.addSeparator();   		// 구분선 추가
        fileMenu.add(exitItem);
        this.setLocationRelativeTo(null); 	// 화면 중앙 배치
        this.setVisible(true);
    }

    public static void main(String[] args)  {
        SwingUtilities.invokeLater(() -> new MenuExample());
    }
}