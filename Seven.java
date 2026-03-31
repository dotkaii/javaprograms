import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Seven {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/syan",
                "root",
                "admin"
            );

            PreparedStatement ps = con.prepareStatement("SELECT * FROM Student WHERE percentage > ?");
            ps.setInt(1, 75);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int roll = rs.getInt("rollNo");
                String name = rs.getString("sname");
                String branch = rs.getString("branchcode");
                float per = rs.getFloat("percentage");

                System.out.println(roll + " " + name + " " + branch + " " + per);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
