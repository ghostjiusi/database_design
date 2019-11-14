package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.ActorMapper;
import substance.Actor;

public class ActorConcrete extends DAOBase implements ActorMapper{

	@Override
	public int deleteByPrimaryKey(String actorId) {//删除ID为actor_id的演员
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from actor where actor_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, actorId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(Actor record) {
		String sql="insert into actor values(?,?)";
        PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getActorId());
            ps.setString(2,record.getActorName());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public Actor selectByPrimaryKey(String actorId) {
		Actor actor = new Actor();
        String sql="select * from lcomment where actor_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, actorId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                actor.setActorId(rs.getString("actor_id"));
                actor.setActorName(rs.getString("actor_name"));
            }
            closeConnection(conn, ps, rs);
            return actor;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(Actor record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update lcomment set actor_name=?, where actor_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, record.getActorName());
            ps.setString(2, record.getActorId());            
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}