package chap13.lab01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

public class LoginApp extends JFrame implements ActionListener {
    private final JTextField idField;
    private final JPasswordField pwField;
    private final JLabel resultLabel;
    private final JButton loginButton;

    public LoginApp() {
        super("로그인 창"); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 200);
        this.setLayout(new FlowLayout());

        idField = new JTextField(15);
        pwField = new JPasswordField(15);
        loginButton = new JButton("로그인");
        resultLabel = new JLabel("ID와 PW를 입력하세요.");

        this.add(new JLabel("아이디:"));
        this.add(idField);
        this.add(new JLabel("패스워드:"));
        this.add(pwField);
        this.add(loginButton);
        this.add(resultLabel);

        loginButton.addActionListener(this); 
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginApp());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String id = idField.getText();
            char[] passwordChars = pwField.getPassword();
            String password = new String(passwordChars);

            resultLabel.setText("ID: " + id + ", PW: " + password);
            Arrays.fill(passwordChars, '0');
        }
    }
}