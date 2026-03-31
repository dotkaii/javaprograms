import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Nine {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/syan",
                "root",
                "admin"
            );
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE deptno = ?");
            ps.setInt(1, 10);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                double salary = rs.getDouble("salary");
                int deptno = rs.getInt("deptno");
                System.out.println(eno + " " + ename + " " + salary + " " + deptno);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
