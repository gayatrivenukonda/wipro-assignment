package jdbc;

import java.sql.*;

public class JDBCStudent {
    public static void main(String[] args) {

        // Update your DB connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "root";

        try {
            // 1. Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // 3. Create SQL query
            String sql = "SELECT * FROM Student";

            // 4. Create statement
            Statement statement = connection.createStatement();

            // 5. Execute query
            ResultSet resultSet = statement.executeQuery(sql);

            // 6. Process result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String course = resultSet.getString("course");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: " + id + ", Name: " + name +
                                   ", Age: " + age + ", Course: " + course +
                                   ", Marks: " + marks);
            }

            // 7. Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}