package concrete_dao;

import java.sql.SQLException;

import abs.DAOBase;
import implement_dao.MovieWriterMapper;
import substance.MovieWriterKey;

public class MovieWriterConcrete extends DAOBase implements MovieWriterMapper {

	@Override
	public int deleteByPrimaryKey(MovieWriterKey key) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "delete from movie_writer_key where writer_id = ? and movie_id = ?";
		
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, key.getWriterId());
			ps.setString(2, key.getMovieId());
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
	public int insert(MovieWriterKey record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into movie_writer_key values(?,?)";
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, record.getWriterId());
			ps.setString(2, record.getMovieId());
			ps.execute();
			this.closeConnection(conn, ps, rs);
			return 1;
		}catch (Exception e) {
            e.printStackTrace();
        }
		return 0;
	}
    
}