package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.ActorPrizeMapper;
import substance.Actor;
import substance.ActorPrize;

public class ActorPrizeConcrete extends DAOBase implements ActorPrizeMapper{

	@Override
	public int deleteByPrimaryKey(String actorPrizeId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from actor_prize where actor_prize_id=?";
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
	public int insert(ActorPrize record) {
		String sql="insert into actor_prize values(?,?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(2,record.getActorPrizeId());
            ps.setString(1,record.getAcatorId());
            ps.setString(3,record.getPrize());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public ActorPrize selectByPrimaryKey(String actorPrizeId) {
		ActorPrize a = new ActorPrize();
        String sql="select * from actor_prize where actor_prize_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, actorPrizeId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                a.setActorPrizeId(rs.getString("actor_prize_id"));
                a.setAcatorId(rs.getString("actor_id"));
                a.setPrize(rs.getString("prize"));
            }
            closeConnection(conn, ps, rs);
            return a;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(ActorPrize record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update actor_prize set actor_prize_id=?,actor_id=?, where actor_prize_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getAcatorId());
            ps.setString(2,record.getPrize());
            ps.setString(3,record.getActorPrizeId());
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
}