import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the database connection with useSSL=false
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false", "root", "Shubham2003@@");

        // SQL query for calling the stored procedure
        String sql = "{CALL GetUserDetails()}";

        try (
            // Create a callable statement
            CallableStatement callableStatement = connection.prepareCall(sql);
        ) {
            // Execute the stored procedure
            try (ResultSet resultSet = callableStatement.executeQuery()) {
                // Process the results
                while (resultSet.next()) {
                    int uid = resultSet.getInt("uid");
                    String uname = resultSet.getString("uname");
                    String uemail = resultSet.getString("uemail");
                    String umobile = resultSet.getString("umobile");

                    // Process or display the results
                    System.out.println("uid: " + uid + ", uname: " + uname + ", uemail: " + uemail + ", umobile: " + umobile);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
