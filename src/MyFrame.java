import javax.swing.*;

public class MyFrame extends JFrame {
    private static MyPanel panel = new MyPanel();
    public MyFrame(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
