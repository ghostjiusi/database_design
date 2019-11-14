package concrete_dao;

import java.sql.SQLException;

import abs.DAOBase;
import implement_dao.WriterMapper;
import substance.WriterKey;

public class WriterConcrete extends DAOBase implements WriterMapper {

	@Override
	public int deleteByPrimaryKey(WriterKey key) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "delete from writer_key where writer_id = ? and writer_name = ?";
		
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, key.getWriterId());
			ps.setString(2, key.getWriterName());
			ps.execute();
			this.closeConnection(conn, ps, rs);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert(WriterKey record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into writer_key values(?,?)";
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, record.getWriterId());
			ps.setString(2, record.getWriterName());
			ps.execute();
			this.closeConnection(conn, ps, rs);
			return 1;
		}catch (Exception e) {
            e.printStackTrace();
        }
		return 0;
	}
    
}