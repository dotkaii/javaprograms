import java.awt.event.*;
import javax.swing.*;

public class Fifteen extends JFrame implements KeyListener {
    JLabel label;
    String text = "";
    public Fifteen() {
        label = new JLabel("Press any key...");
        add(label);
        setTitle("Fifteen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        text += e.getKeyChar();
        label.setText(text);
    }
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Fifteen();
        });
    }
}