package abs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 鍏蜂綋鐨勮繛鎺ュ湪杩欓噷鎵ц
 */
public class DAOBase implements DAO{
	protected PreparedStatement ps;
	protected Connection conn;
	protected ResultSet rs;
    @Override
    public Connection getConnection() {
        Connection con=null;
        try{
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://192.168.56.101:1433;databaseName=Test;user=stu;password=123;");
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

    @Override
    public void closeConnection(Connection conn, Statement stmt, ResultSet rs ) {
        try {
			conn.close();
			stmt.close();
	        rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	//杩欓噷new涓�涓猚onn瀵硅薄锛岀劧鍚庝娇鐢╟onn瀵硅薄鐨勬柟鏉ユ潵杩涜鏁版嵁搴撶殑鍏抽棴
    }
    public void initConnection(PreparedStatement ps,Connection conn,ResultSet rs) {
    	 this.ps=null;
         this.conn=null;
         this.rs=null;
    }
}
