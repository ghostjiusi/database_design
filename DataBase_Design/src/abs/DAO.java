package abs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/*
 * 连接的接口，使每个实体都能连接数据库
 */
public interface  DAO {
    public Connection getConnection();
    public void closeConnection(Connection conn, Statement stmt, ResultSet rs );
}
