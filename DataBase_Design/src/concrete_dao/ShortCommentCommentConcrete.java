package concrete_dao;

import abs.DAOBase;
import implement_dao.ShortCommentCommentMapper;
import substance.Movie;
import substance.ShortCommentComment;

public class ShortCommentCommentConcrete extends DAOBase implements ShortCommentCommentMapper {

	@Override
	public int deleteByPrimaryKey(String shortCommendCommendId) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		 String sql="delete from short_comment_comment where short_commend_commend_id =?";
	        try {
	            conn=getConnection();
	            ps=conn.prepareStatement(sql);
	            ps.setString(1, shortCommendCommendId);
	            ps.executeUpdate();
	            closeConnection(conn, ps, rs);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return 0;
	}

	@Override
	public int insert(ShortCommentComment record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into short_comment_comment values(?,?,?,?,?)";
		try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getShortCommendCommendId());
            ps.setString(2,record.getUserId());
            ps.setString(3, record.getShortCommendId());
            ps.setString(4, record.getComment());
            ps.setString(5,record.getIsUsef());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public ShortCommentComment selectByPrimaryKey(String shortCommendCommendId) {
		// TODO Auto-generated method stub
		ShortCommentComment movie = new ShortCommentComment();
        String sql="select * from short_comment_comment where short_commend_commend_id=?";
        this.initConnection(ps, conn, rs);
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, shortCommendCommendId);
            rs=ps.executeQuery();
            if (rs.next())
            {
            	movie.setShortCommendCommendId(rs.getString("short_commend_commend_id"));
            	movie.setUserId(rs.getString("user_id"));
            	movie.setShortCommendId(rs.getString("short_commend_id"));
            	movie.setComment(rs.getString("comment"));
            	movie.setIsUsef(rs.getString("is_userf"));
            }
            closeConnection(conn, ps, rs);
            return movie;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(ShortCommentComment record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql="update short_comment_comment set user_id=?,short_commend_id=?,comment=?,is_usef=?  where short_comment_comment=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, record.getUserId());
            ps.setString(2, record.getShortCommendId());
            ps.setString(3,record.getComment());
            ps.setString(4, record.getIsUsef());
            ps.setString(5, record.getShortCommendCommendId());
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}