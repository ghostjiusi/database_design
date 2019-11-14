package concrete_dao;

import java.sql.SQLException;

import abs.DAOBase;
import implement_dao.MovieDirectorMapper;
import substance.MovieDirectorKey;

public class MovieDirectorConcrete extends DAOBase implements MovieDirectorMapper {

	@Override
	public int deleteByPrimaryKey(MovieDirectorKey key) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "delete from movie_director_key where director_id = ? and movie_id = ?";
		
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, key.getDirectorId());
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
	public int insert(MovieDirectorKey record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into movie_director_key values(?,?)";
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, record.getDirectorId());
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