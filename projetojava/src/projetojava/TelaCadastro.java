package projetojava;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class TelaCadastro extends JInternalFrame {
    private JTextField cadUser;
    private JLabel lblNewLabel_4;
    private JPasswordField cadSenha2;
    private JPasswordField cadSenha;

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex1) {
            System.err.println(ex1);
        } catch (InstantiationException ex1) {
            System.err.println(ex1);
        } catch (IllegalAccessException ex1) {
            System.err.println(ex1);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastro frame = new TelaCadastro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaCadastro() {
        setFrameIcon(new ImageIcon(TelaCadastro.class.getResource("/icons/user_add.png")));
        setToolTipText("");
        setBorder(null);
        setBackground(new Color(0, 0, 0));
        setClosable(true);
        getContentPane().setBackground(new Color(37, 36, 43));
        getContentPane().setForeground(new Color(37, 38, 43));
        setTitle("Cadastro");
        setBounds(100, 100, 474, 417);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Usuário");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 14));
        lblNewLabel.setBounds(10, 70, 58, 14);
        getContentPane().add(lblNewLabel);

        cadUser = new JTextField();
        cadUser.setFont(new Font("Tahoma", Font.BOLD, 12));
        cadUser.setForeground(new Color(255, 255, 255));
        cadUser.setBackground(new Color(37, 38, 43));
        cadUser.setBounds(10, 111, 452, 32);
        getContentPane().add(cadUser);
        cadUser.setColumns(10);

        lblNewLabel_4 = new JLabel("Escolha um nome de usuário");
        lblNewLabel_4.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblNewLabel_4.setForeground(new Color(116, 116, 116));
        lblNewLabel_4.setBounds(10, 88, 161, 14);
        getContentPane().add(lblNewLabel_4);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(25, 104, 194));
        panel.setBounds(0, 27, 473, 10);
        getContentPane().add(panel);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setFont(new Font("Nirmala UI", Font.BOLD, 14));
        lblSenha.setBounds(10, 156, 58, 14);
        getContentPane().add(lblSenha);

        JLabel lblNewLabel_4_1 = new JLabel("Escolha uma senha");
        lblNewLabel_4_1.setForeground(new Color(116, 116, 116));
        lblNewLabel_4_1.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblNewLabel_4_1.setBounds(10, 174, 102, 14);
        getContentPane().add(lblNewLabel_4_1);

        JLabel lblNewLabel_4_1_1 = new JLabel("Escreva a senha novamente");
        lblNewLabel_4_1_1.setForeground(new Color(116, 116, 116));
        lblNewLabel_4_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblNewLabel_4_1_1.setBounds(10, 262, 153, 14);
        getContentPane().add(lblNewLabel_4_1_1);

        JLabel lblRepitaASenha = new JLabel("Repita a Senha");
        lblRepitaASenha.setForeground(Color.WHITE);
        lblRepitaASenha.setFont(new Font("Nirmala UI", Font.BOLD, 14));
        lblRepitaASenha.setBounds(10, 244, 102, 16);
        getContentPane().add(lblRepitaASenha);

        JButton btnCad = new JButton("Registrar");
        btnCad.setBackground(getBackground());
        btnCad.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                banc banco = new banc();
                if (banco.igual(new String(cadSenha.getPassword()), new String(cadSenha2.getPassword()))) {
                    if (banco.existe(cadUser.getText()) == false) {
                        banc.addUser(cadUser.getText());
                        banc.addSenha(new String(cadSenha.getPassword()));
                        banc.userAdded();
                        JOptionPane.showMessageDialog(null, "Usuário: " + cadUser.getText() + " Registrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário: " + cadUser.getText() + " Já existe");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não são iguais!");
                }
            }

        });
        btnCad.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCad.setForeground(new Color(255, 255, 255));
        btnCad.setBackground(new Color(25, 104, 194));
        btnCad.setBounds(10, 337, 452, 32);
        getContentPane().add(btnCad);

        cadSenha2 = new JPasswordField();
        cadSenha2.setForeground(new Color(255, 255, 255));
        cadSenha2.setFont(new Font("Tahoma", Font.BOLD, 12));
        cadSenha2.setBackground(new Color(37, 36, 43));
        cadSenha2.setBounds(10, 285, 452, 32);
        getContentPane().add(cadSenha2);

        cadSenha = new JPasswordField();
        cadSenha.setForeground(Color.WHITE);
        cadSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
        cadSenha.setBackground(new Color(37, 36, 43));
        cadSenha.setBounds(10, 197, 452, 32);
        getContentPane().add(cadSenha);

    }

}
