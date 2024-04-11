package Swing_03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        initialize();
    }

    public void initialize() {
        this.frame = new JFrame();
        this.frame.setTitle("Java Swing JPanel Demo");
        this.frame.setLayout(new BorderLayout(10, 5));
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        panel.setBackground(Color.RED);

        Button button1 = new Button("Button1");
        panel.add(button1);
        
        Button button2 = new Button("Button2");
        panel.add(button2);
        
        Button button3 = new Button("Button3");
        panel.add(button3);

        panel.setPreferredSize(new Dimension(250, 250));

        frame.add(panel, BorderLayout.CENTER);
        
        this.frame.setVisible(true);
    }
}
