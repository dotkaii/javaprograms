import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Twelve extends JFrame {
    public Twelve() {
        setLayout(new GridLayout(5,2,10,10));
        for (int i = 1; i <= 10; i++) {
            add(new JButton(i + ""));
        }

        setTitle("Twelve");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Twelve();
    }
}
