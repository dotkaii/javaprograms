import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Thirteen extends JFrame implements ActionListener {

    public Thirteen() {
        setLayout(new GridLayout(3, 1, 10, 10));

        Label uname = new Label("UserName:");
        TextField textField = new TextField(20);
        Label pass = new Label("Password:");
        TextField passField = new TextField(20);
        Button button = new Button("Submit");
        button.addActionListener(this);
        add(uname);
        add(textField);
        add(pass);
        add(passField);
        add(button);

        setTitle("Thirteen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Login successful!");
    }

    public static void main(String[] args) {
        new Thirteen();
    }
    
}
