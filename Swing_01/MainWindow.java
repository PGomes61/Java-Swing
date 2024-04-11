import javax.swing.JFrame;

public class MainWindow {
    private JFrame window;

    public MainWindow() {
        this.window = new JFrame();
        window.setTitle("Hello World!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);
    }

    public void show() {
        window.setVisible(true);
    }
}
