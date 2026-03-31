import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fourteen extends JFrame implements ActionListener {
    public String[] options = {"Option 1", "Option 2", "Option 3"};
    public JComboBox<String> comboBox;
    public JTextField textField;
    public Fourteen() {
        setLayout(new GridLayout(2, 2));
        textField = new JTextField(20);
        comboBox = new JComboBox<>(options);
        comboBox.addActionListener(this);
        add(textField);
        add(comboBox);

        setTitle("Fourteen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String selectedOption = (String) comboBox.getSelectedItem();
        textField.setText(selectedOption);
        // JOptionPane.showMessageDialog(this, "You selected: " + selectedOption);
        // if (e.getSource() == comboBox) {
        // }
    }

    public static void main(String[] args) {
        Fourteen frame = new Fourteen();
        frame.setVisible(true);
    }
    
}
