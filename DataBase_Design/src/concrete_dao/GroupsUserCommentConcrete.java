package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.GroupsUserCommentMapper;
import substance.GroupsUserComment;

public class GroupsUserCommentConcrete extends DAOBase implements GroupsUserCommentMapper {

	@Override
	public int deleteByPrimaryKey(String groupsCommentId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from group_comment where group_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsCommentId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(GroupsUserComment record) {
		String sql="insert into groups_user_commnet values(?,?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsCommentId());
            ps.setString(2,record.getGroupsUserId());
            ps.setString(3,record.getComment());
            
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public GroupsUserComment selectByPrimaryKey(String groupsCommentId) {
		GroupsUserComment a = new GroupsUserComment();
        String sql="select * from groups_user_comment where groups_user_comment_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsCommentId);
            rs=ps.executeQuery();
            if (rs.next())
            {
            	a.setComment(rs.getString("comment"));
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
	public int updateByPrimaryKey(GroupsUserComment record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update groups_user_comment set groups_user_id=?,comment=?, where groups_comment_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsUserId());
            ps.setString(2,record.getComment());  
            ps.setString(3,record.getGroupsCommentId()); 
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}