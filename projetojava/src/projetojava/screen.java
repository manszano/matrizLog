package projetojava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

@SuppressWarnings("serial")
public class screen extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException ex) {
            System.err.println(ex);
        } catch (IllegalAccessException ex) {
            System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    screen frame = new screen();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public screen() {
        setTitle("Trippin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1027, 625);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(32, 32, 33));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setForeground(new Color(37, 36, 43));
        menuBar.setBackground(new Color(25, 104, 194));
        menuBar.setBounds(0, 0, 2089, 22);
        contentPane.add(menuBar);

        JMenu mnNewMenu = new JMenu("Usuário");
        mnNewMenu.setForeground(new Color(255, 255, 255));
        mnNewMenu.setIcon(new ImageIcon(screen.class.getResource("/icons/user_go.png")));
        mnNewMenu.setFont(new Font("Segoe UI", mnNewMenu.getFont().getStyle(), 12));
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Login");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaLogin login = new TelaLogin();
                contentPane.add(login);
                login.setVisible(true);               
            }
        });
        mntmNewMenuItem.setIcon(new ImageIcon(screen.class.getResource("/icons/user.png")));
        mnNewMenu.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cadastro");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                TelaCadastro cadastro = new TelaCadastro();
                contentPane.add(cadastro);
                cadastro.setVisible(true);
            }
        });
        mntmNewMenuItem_1.setIcon(new ImageIcon(screen.class.getResource("/icons/user_add.png")));
        mnNewMenu.add(mntmNewMenuItem_1);

        JMenu mnInfo = new JMenu("Info");
        mnInfo.setForeground(new Color(255, 255, 255));
        mnInfo.setIcon(new ImageIcon(screen.class.getResource("/icons/information.png")));
        menuBar.add(mnInfo);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sobre");
        mntmNewMenuItem_2.setIcon(new ImageIcon(screen.class.getResource("/icons/information.png")));
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaSobre sobre = new TelaSobre();
                contentPane.add(sobre);
                sobre.setVisible(true);
            }
        });

        mnInfo.add(mntmNewMenuItem_2);

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(387, 21, -390, 493);
        contentPane.add(desktopPane);


    }
    

}
