import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Eleven extends JFrame implements ActionListener {
    public JTextField t1, t2, t3;
    
    public Eleven() {
        setLayout(new GridLayout(4, 2, 10, 10));

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t3.setEditable(false);
        JLabel l1 = new JLabel("Number 1:");
        JLabel l2 = new JLabel("Number 2:");
        JLabel l3 = new JLabel("");
        JLabel result = new JLabel("Result:");
        JButton b = new JButton("Add");
        b.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b);
        add(result);
        add(t3);

        setTitle("Eleven");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Eleven();
        });
    }
}
