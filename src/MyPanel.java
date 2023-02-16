import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public static int score;
    public static int time = 60;
    public static JLabel scoreLabel = new JLabel("Score: " + score);
    public static JLabel timeLabel = new JLabel("Time: " + time);
    public static Timer timer;
    public MyPanel(){
        setLayout(null);
        setSize(500,500);
        setBackground(Color.BLUE);
        add(new Balloon(this));
        setLabels();
        setTimer();
        timer.start();
        setVisible(true);
    }
    public void setLabels(){
        scoreLabel.setBounds(0,0,200,75);
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 25));
        add(scoreLabel);
        timeLabel.setBounds(200, 0, 200, 75);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 25));
        add(timeLabel);
    }
    public void setTimer(){
        timer = new Timer(1000, e ->{
            if(time >0) {
                time--;
                timeLabel.setText("Time: " + time);
            }
            else{
                JOptionPane.showMessageDialog(null, "Game Over\nScore: " + score);
                timer.stop();
            }
        });
    }
}
