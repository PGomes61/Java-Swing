package Swing_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;

    public MainFrame() {
        initialize();
    }

    public void initialize() {
        this.frame = new JFrame();
        this.frame.setTitle("FlowLayout Demo");

        this.panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        this.panel.setBackground(Color.PINK);

        for(int i = 1; i <= 5; i++) {
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }
        
        this.frame.setLayout(new BorderLayout());
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);

        this.frame.add(panel, BorderLayout.CENTER);
    }
}
