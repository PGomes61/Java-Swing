package Swing_06;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

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
        this.frame.setTitle("GridLayout Demo");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(800, 400);
        this.frame.setLocationRelativeTo(null);

        this.panel = new JPanel(new GridLayout(5, 5, 10, 10));

        for(int i = 1; i <= 25; i++) {
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }

        frame.add(panel);
        
        this.frame.pack();
        this.frame.setVisible(true);
    }
}