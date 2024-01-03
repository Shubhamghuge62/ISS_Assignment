import java.sql.*;
public class DataWriteToTable {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Shubham2003@@");
			Statement stat = connection.createStatement();
			
            String uname = "Shubham";
            String upass = "password123";
            String uemail = "shubham.ghuge@example.com";
            String umobile = "1234567890";

            // Execute the INSERT INTO query
            String insertQuery = "INSERT INTO users (uname, upass, uemail, umobile) " +
                                 "VALUES ('" + uname + "', '" + upass + "', '" + uemail + "', '" + umobile + "')";
            int rowsAffected = stat.executeUpdate(insertQuery);
            System.out.println(rowsAffected + " row(s) affected.");

			ResultSet rs =stat.executeQuery("select * from users");
			while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}