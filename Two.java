import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Two extends JFrame{

    public Two() {
        String[] columnNames = {"Emp No", "Name", "Salary"};
        Object[][] data = {
            {001, "Alice", 50000},
            {002, "Bob", 60000},
            {003, "Charlie", 55000},
            {004, "David", 70000},
            {005, "Eve", 65000},
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane pane = new JScrollPane(table);
        add(pane);

        setTitle("Employee Table");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Two();
    }
}
