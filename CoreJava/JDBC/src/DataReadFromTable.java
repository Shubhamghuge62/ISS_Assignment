import java.sql.*;
import java.util.*;
public class DataReadFromTable {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Shubham2003@@");
			Statement stat = connection.createStatement();
			ResultSet rs =stat.executeQuery("select * from users");
			while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

