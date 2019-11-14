package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.GroupsUserMapper;
import substance.GroupsUser;

public class GroupsUserConcrete extends DAOBase implements GroupsUserMapper {

	@Override
	public int deleteByPrimaryKey(String groupsUserId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from groups_user_id where groups_user_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsUserId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(GroupsUser record) {
		String sql="insert into groups_user values(?,?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsUserId());
            ps.setString(2,record.getGroupsId());
            ps.setString(3,record.getUser());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public GroupsUser selectByPrimaryKey(String groupsUserId) {
		GroupsUser a = new GroupsUser();
        String sql="select * from groups_user where groups_user_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsUserId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                a.setGroupsId(rs.getString("groups_id"));
                a.setGroupsUserId(rs.getString("groups_user_id"));
                a.setUser(rs.getString("user"));
            }
            closeConnection(conn, ps, rs);
            return a;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(GroupsUser record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update groups_user set groups_id=?,groups_user=?, where groups_user_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsId());
            ps.setString(2,record.getUser());     
            ps.setString(3,record.getGroupsUserId());     
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}