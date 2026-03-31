import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Five extends Applet implements ActionListener {
    Button b;

    @Override
    public void init() {
        b = new Button("Change Color");
        b.addActionListener(this);
        add(b);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.red);
    }
}
