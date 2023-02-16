import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Balloon extends JLabel implements MouseListener {
    private final MyPanel panel;
    private static final Random rnd = new Random();
    private static final Image balloonUnscaled = new ImageIcon("balloon.png").getImage().getScaledInstance(50, 100, Image.SCALE_DEFAULT);
    public static ImageIcon balloonImage = new ImageIcon(balloonUnscaled);
    public Balloon(MyPanel panel){
        this.panel = panel;
        setBounds(rnd.nextInt(0, 400), rnd.nextInt(0, 350), balloonImage.getIconWidth(), balloonImage.getIconHeight());
        setSize(50, 100);
        setIcon(balloonImage);
        addMouseListener(this);
        setOpaque(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panel.remove(this);
        MyPanel.score++;
        MyPanel.scoreLabel.setText("Score: " + MyPanel.score);
        panel.repaint();
        panel.add(new Balloon(panel));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
