package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.LongCommentCommentMapper;
import substance.LongCommentComment;

public class LongCommentCommentConcrete extends DAOBase implements LongCommentCommentMapper {

	@Override
	public int deleteByPrimaryKey(String longCommentCommentId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from long_comment_comment where long_comment_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, longCommentCommentId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(LongCommentComment record) {
		String sql="insert into long_comment_comment values(?,?,?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getLongCommentCommentId());
            ps.setString(2,record.getLongCommentId());
            ps.setString(3,record.getUserId());
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
	public LongCommentComment selectByPrimaryKey(String longCommentCommentId) {
		LongCommentComment a = new LongCommentComment();
        String sql="select * from long_comment_comment where long_comment_commment_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, longCommentCommentId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                a.setComment(rs.getString("comment"));
                a.setLongCommentCommentId(rs.getString("long_comment_comment_id"));
                a.setLongCommentId(rs.getString("long_comment_id"));
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
	public int updateByPrimaryKey(LongCommentComment record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update long_comment_comment set long_comment_id=?,user_id=?,comment=?, where long_commment_commment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getLongCommentId());
            ps.setString(2,record.getUserId());
            ps.setString(3,record.getComment());   
            ps.setString(4,record.getLongCommentCommentId());         
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}