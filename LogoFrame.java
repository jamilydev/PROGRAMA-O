package com.mycompany.programa.addition;



import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LogoFrame extends JFrame {
    public LogoFrame() {
        // Definir o layout
        setLayout(new BorderLayout());

        // Adicionar o texto
        JLabel label = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO", SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);

        // Adicionar a imagem
        ImageIcon logoIcon = new ImageIcon("logifmt.png");
        JLabel logoLabel = new JLabel(logoIcon);
        add(logoLabel, BorderLayout.CENTER);

        // Configurar o frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
}
   
