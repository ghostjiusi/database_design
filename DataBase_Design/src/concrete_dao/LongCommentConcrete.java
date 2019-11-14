package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.LongCommentMapper;
import substance.LongComment;

public class LongCommentConcrete extends DAOBase implements LongCommentMapper {

	@Override
	public int deleteByPrimaryKey(String longCommentId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from long_comment where long_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, longCommentId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(LongComment record) {
		String sql="insert into long_commment values(?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getLongCommentId());
            ps.setString(2,record.getUserId());
            ps.setString(3,record.getMovieId());
            ps.setString(4,record.getComment());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public LongComment selectByPrimaryKey(String longCommentId) {
		LongComment a = new LongComment();
        String sql="select * from long_comment where long_comment_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, longCommentId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                a.setComment(rs.getString("comment"));
                a.setLongCommentId(rs.getString("long_comment_id"));
                a.setMovieId(rs.getString("movie_comment"));
                a.setUserId(rs.getString("user_id"));
            }
            closeConnection(conn, ps, rs);
            return a;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(LongComment record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update long_commment set user_id=?,movie_id=?,comment=?, where long_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getUserId());
            ps.setString(2,record.getMovieId());
            ps.setString(3,record.getComment());    
            ps.setString(4,record.getLongCommentId()); 
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
   
}