package jdbcprograms;
import java.sql.*;

public class JDBCStudentRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root"; // use your password

        try {
            // Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

            // Process result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.println(id + " | " + name + " | " + age + " | " + course + " | " + marks);
            }

            // Close connection
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    /*
     1 | Gayathri | 21 | Java | 88.5
2 | Sunil | 22 | Python | 78.0
3 | Deepa | 20 | C++ | 91.2

     */


            

       