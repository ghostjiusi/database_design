package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.MovieMapper;
import substance.Actor;
import substance.Movie;

public class MovieConcrete extends DAOBase implements MovieMapper {

	@Override
	public int deleteByPrimaryKey(String movieId) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		 String sql="delete from movie where movie_id=?";
	        try {
	            conn=getConnection();
	            ps=conn.prepareStatement(sql);
	            ps.setString(1, movieId);
	            ps.executeUpdate();
	            closeConnection(conn, ps, rs);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return 0;
	}

	@Override
	public int insert(Movie record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into movie values(?,?)";
		try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getMovieId());
            ps.setString(2,record.getMovieName());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
	@Override
	public Movie selectByPrimaryKey(String movieId) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
        String sql="select * from movie where movie_id=?";
        this.initConnection(ps, conn, rs);
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, movieId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                movie.setMovieId(rs.getString("movie_id"));
                movie.setMovieName(rs.getString("movie_name"));
            }
            closeConnection(conn, ps, rs);
            return movie;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}


	@Override
	public int updateByPrimaryKey(Movie record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql="update movie set movie_name=?, where movie_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, record.getMovieName());
            ps.setString(2, record.getMovieId());            
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    

}