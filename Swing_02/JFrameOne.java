package Swing_02;

import javax.swing.JFrame;

public class JFrameOne extends JFrame{
    public JFrameOne() {
        initialize();
    }

    public void initialize() {
        setTitle("JFrameOne");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
