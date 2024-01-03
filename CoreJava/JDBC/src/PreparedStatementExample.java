import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
        // Database connection parameters
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	 // Establish the database connection
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Shubham2003@@");		
        // SQL query 
        String sql = "SELECT * from users";

        try (
            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            // Execute the query
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Process the results
                while (resultSet.next()) {
                    int uid = resultSet.getInt("uid");
                    String uname = resultSet.getString("uname");
                    String uemail = resultSet.getString("uemail");
                    String umobile = resultSet.getString("umobile");
                    // Process or display the results
                    System.out.println("uid: " + uid +",uname: " + uname + ",uemail : " + uemail + ",umobile : " + umobile);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
