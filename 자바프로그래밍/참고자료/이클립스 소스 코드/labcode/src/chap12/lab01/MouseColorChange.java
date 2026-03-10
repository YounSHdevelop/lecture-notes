package chap12.lab01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseColorChange extends JFrame {
    private JPanel trackingPanel;
    
    public MouseColorChange() {
        this.setTitle("마우스로 색상 변경");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setLayout(new BorderLayout());

        JLabel infoLabel = new JLabel("마우스를 움직이면 배경색이 변함");
        trackingPanel = new JPanel();

        trackingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {    
                int r = e.getX() % 256; 
                int g = e.getY() % 256; 
                
                trackingPanel.setBackground(new Color(r, g, 125));
            }
        });

        this.add(trackingPanel, BorderLayout.CENTER);
        this.add(infoLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseColorChange());
    }
}