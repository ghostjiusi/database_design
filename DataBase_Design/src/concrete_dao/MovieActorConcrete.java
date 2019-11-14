package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import abs.DAOBase;
import implement_dao.MovieActorMapper;
import substance.MovieActorKey;

public class MovieActorConcrete extends DAOBase implements MovieActorMapper {

	@Override
	public int deleteByPrimaryKey(MovieActorKey key) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "delete from movie_actor_key where actor_id = ? and movie_id = ?";
		
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, key.getActorId());
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
	public int insert(MovieActorKey record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into movie_actor_key values(?,?)";
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, record.getActorId());
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