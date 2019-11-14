package concrete_dao;

import abs.DAOBase;
import implement_dao.MoviePrizeMapper;
import substance.Movie;
import substance.MoviePrize;

public class MoviePrizeConcrete extends DAOBase implements MoviePrizeMapper {

	@Override
	public int deleteByPrimaryKey(String moviePrizeId) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		 String sql="delete from movie_prize where movie_id=?";
	        try {
	            conn=getConnection();
	            ps=conn.prepareStatement(sql);
	            ps.setString(1, moviePrizeId);
	            ps.executeUpdate();
	            closeConnection(conn, ps, rs);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return 0;
	}

	@Override
	public int insert(MoviePrize record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into movie_prize values(?,?,?)";
		try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getMoviePrizeId());
            ps.setString(2,record.getMovieId());
            ps.setString(3, record.getSituation());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public MoviePrize selectByPrimaryKey(String moviePrizeId) {
		// TODO Auto-generated method stub
		MoviePrize movie = new MoviePrize();
        String sql="select * from movie_prize where movie_prize_id=?";
        this.initConnection(ps, conn, rs);
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, moviePrizeId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                movie.setMovieId(rs.getString("movie_id"));
                movie.setSituation(rs.getString("situation"));
            }
            closeConnection(conn, ps, rs);
            return movie;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(MoviePrize record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql="update movie_prize set movie_id=?, situation=?,where movie_prized_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, record.getMovieId());
            ps.setString(2, record.getSituation()); 
            ps.setString(3, record.getMoviePrizeId());
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}