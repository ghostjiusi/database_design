package concrete_dao;

import abs.DAOBase;
import implement_dao.ShortCommentMapper;
import substance.Movie;
import substance.ShortComment;

public class ShortCommentConcrete extends DAOBase implements ShortCommentMapper {

	@Override
	public int deleteByPrimaryKey(String shortCommentId) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		 String sql="delete from short_comment where short_comment_id=?";
	        try {
	            conn=getConnection();
	            ps=conn.prepareStatement(sql);
	            ps.setString(1, shortCommentId);
	            ps.executeUpdate();
	            closeConnection(conn, ps, rs);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return 0;
	}

	@Override
	public int insert(ShortComment record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into short_comment values(?,?,?,?,?,?)";
		try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getShortCommentId());
            ps.setString(2,record.getUserId());
            ps.setString(3, record.getMovieId());
            ps.setString(4, record.getComment());
            ps.setString(5, record.getSeen());
            ps.setDouble(6, record.getScore());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public ShortComment selectByPrimaryKey(String shortCommentId) {
		// TODO Auto-generated method stub
		ShortComment movie = new ShortComment();
        String sql="select * from short_comment where short_comment_id=?";
        this.initConnection(ps, conn, rs);
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, shortCommentId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                movie.setShortCommentId(rs.getString("short_comment_id"));
                movie.setUserId(rs.getString("user_id"));
                movie.setMovieId(rs.getString("movie_id"));
                movie.setComment(rs.getString("comment"));
                movie.setSeen(rs.getString("seen"));
                movie.setScore(rs.getDouble("score"));
            }
            closeConnection(conn, ps, rs);
            return movie;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(ShortComment record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql="update short_comment set user_id=?,movie_id=?,comment=?,seen=?,score=? where short_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, record.getUserId());
            ps.setString(2, record.getMovieId());
            ps.setString(3,record.getComment());
            ps.setString(4, record.getSeen());
            ps.setDouble(5, record.getScore());
            ps.setString(6, record.getShortCommentId());
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}