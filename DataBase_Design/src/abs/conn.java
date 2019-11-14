package abs;

import java.sql.*;

public class conn {
	private static Connection con = null;
	public conn() {
}
	public static Connection getConn() {
		if(con == null) {
			try {
				
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			con = DriverManager.getConnection("jdbc:sqlserver://192.168.56.101:1433;databaseName=Test;user=stu;password=123;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		return con;
		
	}
}