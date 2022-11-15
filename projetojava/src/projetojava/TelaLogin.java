package projetojava;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaLogin extends JInternalFrame {
    private JTextField textField2;
    private JPasswordField passwordField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaLogin frame = new TelaLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    	public TelaLogin() {
        setClosable(true);
        setTitle("Login");
        getContentPane().setBackground(new Color(37, 36, 43));
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Usuário");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 14));
        lblNewLabel.setBounds(10, 68, 58, 14);
        getContentPane().add(lblNewLabel);

        textField2 = new JTextField();
        textField2.setForeground(Color.WHITE);
        textField2.setFont(new Font("Tahoma", Font.BOLD, 12));
        textField2.setColumns(10);
        textField2.setBackground(new Color(37, 38, 43));
        textField2.setBounds(10, 109, 452, 32);
        getContentPane().add(textField2);

        JLabel lblNewLabel_4 = new JLabel("Escreva seu usuário");
        lblNewLabel_4.setForeground(new Color(116, 116, 116));
        lblNewLabel_4.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblNewLabel_4.setBounds(10, 86, 112, 14);
        getContentPane().add(lblNewLabel_4);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(25, 104, 194));
        panel.setBounds(0, 25, 473, 10);
        getContentPane().add(panel);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setFont(new Font("Nirmala UI", Font.BOLD, 14));
        lblSenha.setBounds(10, 154, 58, 14);
        getContentPane().add(lblSenha);

        JLabel lblNewLabel_4_1 = new JLabel("Escreva sua senha");
        lblNewLabel_4_1.setForeground(new Color(116, 116, 116));
        lblNewLabel_4_1.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblNewLabel_4_1.setBounds(10, 172, 102, 14);
        getContentPane().add(lblNewLabel_4_1);

        JButton btnCad = new JButton("Login");
        btnCad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                banc banco = new banc();
                if (banco.logg(textField2.getText(), new String(passwordField_1.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Bem Vindo, " + textField2.getText() + "!");
                } else {
                    JOptionPane.showMessageDialog(null, "Senha ou Login incorretos");
                }
            }
        });
        btnCad.setForeground(Color.WHITE);
        btnCad.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCad.setBackground(new Color(25, 104, 194));
        btnCad.setBounds(10, 259, 452, 32);
        getContentPane().add(btnCad);

        passwordField_1 = new JPasswordField();
        passwordField_1.setForeground(Color.WHITE);
        passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        passwordField_1.setBackground(new Color(37, 36, 43));
        passwordField_1.setBounds(10, 195, 452, 32);
        getContentPane().add(passwordField_1);
        setFrameIcon(new ImageIcon(TelaLogin.class.getResource("/icons/user.png")));
        setBorder(null);
        setBounds(100, 100, 474, 346);

    }

}