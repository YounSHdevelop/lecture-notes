package sec02.exam07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowCloseExample extends JFrame {
    public WindowCloseExample() {
        this.setTitle("버튼으로 종료");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton exitButton = new JButton("프로그램 종료");
        exitButton.addActionListener(e -> checkAndClose()); 
        addWindowListener(new WindowAdapter() {         // 리스너 등록
            @Override
            public void windowClosing(WindowEvent e) {  // 이벤트 리스너
                checkAndClose();		           
            }
        });

        this.add(exitButton);
        this.setVisible(true);
    }
    
    private void checkAndClose() { 		// 종료 확인 및 처리 공통 로직
        int result = JOptionPane.showConfirmDialog(  // 간단한 팝업 창
            this, "정말로 프로그램을 종료하시겠어요?", "종료 확인",
            JOptionPane.YES_NO_OPTION 	// '예' 또는 '아니오'만 제공
        );

        if (result == JOptionPane.YES_OPTION) {
            dispose(); 				// 자원 해제 후 창 닫기
            System.exit(0);			// 프로그램 종료
        } // 아니오(NO)를 선택 → 아무것도 하지 않아 창이 유지됨
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WindowCloseExample());
    }
}