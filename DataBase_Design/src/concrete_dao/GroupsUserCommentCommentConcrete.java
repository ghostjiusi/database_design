package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.GroupsUserCommentCommentMapper;
import substance.GroupsUserCommentComment;

public class GroupsUserCommentCommentConcrete extends DAOBase implements GroupsUserCommentCommentMapper {

	@Override
	public int deleteByPrimaryKey(String groupsCommentCommentId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from groups_users where groups_comment_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsCommentCommentId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(GroupsUserCommentComment record) {
		String sql="insert into groups_user_comment_comment values(?,?,?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsCommentCommentId());
            ps.setString(2,record.getGroupsCommentId());
            ps.setString(3,record.getGroupsUserId());
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
	public GroupsUserCommentComment selectByPrimaryKey(String groupsCommentCommentId) {
		GroupsUserCommentComment a = new GroupsUserCommentComment();
        String sql="select * from groups_user_comment_comment where groups_user_comment_comment_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsCommentCommentId);
            rs=ps.executeQuery();
            if (rs.next())
            {
            	a.setComment(rs.getString("comment"));
            	a.setGroupsCommentCommentId(rs.getString("groups_comment_comment_id"));
            	a.setGroupsCommentId(rs.getString("groups_comment_id"));
            	a.setGroupsUserId(rs.getString("groups_user_id"));
            }
            closeConnection(conn, ps, rs);
            return a;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(GroupsUserCommentComment record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update groups_user_comment_comment set groups_comment_id=?,groups_user_id=?,comment=?, where groups_comment_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsCommentId());
            ps.setString(2,record.getGroupsUserId());
            ps.setString(3,record.getComment());
            ps.setString(4,record.getGroupsCommentCommentId());
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
}