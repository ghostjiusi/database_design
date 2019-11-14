package concrete_dao;

import java.sql.SQLException;

import abs.DAOBase;
import implement_dao.MovieTagMapper;
import substance.MovieTagKey;

public class MovieTagConcrete extends DAOBase implements MovieTagMapper {

	@Override
	public int deleteByPrimaryKey(MovieTagKey key) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "delete from movie_tag_key where tag_id = ? and movie_id = ?";
		
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, key.getTagId());
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
	public int insert(MovieTagKey record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into movie_tag_key values(?,?)";
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, record.getTagId());
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