package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.ActorPrizeMapper;
import implement_dao.GroupsMapper;
import substance.ActorPrize;
import substance.Groups;

public class GroupsConcrete extends DAOBase implements GroupsMapper{

	@Override
	public int deleteByPrimaryKey(String actorPrizeId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from groups where groups_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, actorPrizeId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(Groups record) {
		String sql="insert into groups values(?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsId());
            ps.setString(2,record.getGroupsName());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public Groups selectByPrimaryKey(String groupsId) {
		Groups a = new Groups();
        String sql="select * from groups where groups_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, groupsId);
            rs=ps.executeQuery();
            if (rs.next())
            {
            	a.setGroupsId(rs.getString("groups_id"));
            	a.setGroupsName(rs.getString("groups_name"));
            }
            closeConnection(conn, ps, rs);
            return a;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(Groups record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update groups set groups_name=?, where groups_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getGroupsName()); 
            ps.setString(2,record.getGroupsId());
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
}