package learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InPre {
	public static void InPre(Student s) throws ClassNotFoundException,SQLException
	{
		Connection conn =null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url="jdbc:sqlserver://192.168.137.3:1433;DatabaseName=StudentWork";
		conn=DriverManager.getConnection(url,"sa","123456");
		String sql="insert into Table_S values('"+s.getSID()+"','"+s.getSN()+"','"+s.getSEX()+"','"
				+s.getMC()+"','"+s.getBIR()+"','"+s.getCALL()+"')";
				PreparedStatement stmt=conn.prepareStatement(sql);
	}
}
