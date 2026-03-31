import java.awt.*;
import java.awt.event.*;

public class Ten extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b;

    public Ten() {
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        b = new Button("Multiply");
        b.addActionListener(this);

        add(t1);
        add(t2);
        add(b);
        add(t3);

        setSize(300, 200);
        setVisible(true);
        // setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = num1 * num2;
            t3.setText(result + "");
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Ten();
    }
}
