package Swing_04;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        initialize();
        show();
    }

    public void initialize() {
        this.frame = new JFrame();
        this.frame.setTitle("BorderPane Demo");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(800, 400);
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        this.frame.setLayout(borderLayout);

        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
        
        this.frame.setLocationRelativeTo(null);
    }

    public void show() {
        this.frame.setVisible(true);
    }
}
