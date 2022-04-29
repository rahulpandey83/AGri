package connections.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoFactory {
	public static Connection con;
	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/main","root","123456");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;

	}

}
