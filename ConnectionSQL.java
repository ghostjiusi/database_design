package DataBase;
import java.sql.*;
public class ConnectionSQL {
	
	public ConnectionSQL () {
		}
	public static Connection getConntions()  {
		Connection con = null;
		if(con == null) {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
					con = DriverManager.getConnection("jdbc:sqlserver://192.168.56.101:1433;databaseName=Test;user=stu;password=123;");
				 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
}
