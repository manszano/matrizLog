package projetojava;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TelaSobre extends JInternalFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaSobre frame = new TelaSobre();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaSobre() {
        setFrameIcon(new ImageIcon(TelaSobre.class.getResource("/icons/magnifier.png")));
        setTitle("Sobre");
        setBorder(null);
        setBackground(new Color(37, 36, 43));
        setForeground(new Color(37, 36, 43));
        setClosable(true);
        setBounds(100, 100, 369, 297);
        getContentPane().setLayout(null);

        JLabel lblAplicativoDesenvolvidoPela = new JLabel("Aplicativo desenvolvido pela equipe Trippin ®");
        lblAplicativoDesenvolvidoPela.setBackground(new Color(116, 116, 116));
        lblAplicativoDesenvolvidoPela.setForeground(new Color(116, 116, 116));
        lblAplicativoDesenvolvidoPela.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblAplicativoDesenvolvidoPela.setBounds(51, 238, 267, 20);
        getContentPane().add(lblAplicativoDesenvolvidoPela);

        JLabel lblIntegrantesDoGrupo = new JLabel("Integrantes do grupo:");
        lblIntegrantesDoGrupo.setForeground(Color.WHITE);
        lblIntegrantesDoGrupo.setFont(new Font("Nirmala UI", Font.BOLD, 14));
        lblIntegrantesDoGrupo.setBounds(26, 42, 154, 25);
        getContentPane().add(lblIntegrantesDoGrupo);

        JLabel lblBrunoMoreiras = new JLabel("Bruno Moreiras,");
        lblBrunoMoreiras.setForeground(new Color(25, 104, 194));
        lblBrunoMoreiras.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblBrunoMoreiras.setBounds(36, 78, 104, 25);
        getContentPane().add(lblBrunoMoreiras);

        JLabel lblGabrielBueno = new JLabel("Gabriel Bueno,");
        lblGabrielBueno.setForeground(new Color(25, 104, 194));
        lblGabrielBueno.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblGabrielBueno.setBounds(36, 104, 104, 25);
        getContentPane().add(lblGabrielBueno);

        JLabel lblLuccasCadeMeus = new JLabel("Juliana Viana,");
        lblLuccasCadeMeus.setForeground(new Color(25, 104, 194));
        lblLuccasCadeMeus.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblLuccasCadeMeus.setBounds(36, 131, 131, 25);
        getContentPane().add(lblLuccasCadeMeus);

        JLabel lblMatheusDeSouza = new JLabel("Luccas cade meus 1k?,");
        lblMatheusDeSouza.setForeground(new Color(25, 104, 194));
        lblMatheusDeSouza.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblMatheusDeSouza.setBounds(36, 159, 154, 25);
        getContentPane().add(lblMatheusDeSouza);

        JLabel lblJuliana = new JLabel("Matheus de Souza Manzano.");
        lblJuliana.setForeground(new Color(25, 104, 194));
        lblJuliana.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        lblJuliana.setBounds(36, 186, 165, 25);
        getContentPane().add(lblJuliana);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(25, 104, 194));
        panel.setBounds(0, 21, 369, 10);
        getContentPane().add(panel);

    }

}