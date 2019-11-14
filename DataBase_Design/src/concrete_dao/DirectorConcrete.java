package concrete_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.ActorPrizeMapper;
import implement_dao.DirectorMapper;
import substance.ActorPrize;
import substance.Director;

public class DirectorConcrete extends DAOBase implements DirectorMapper{

	@Override
	public int deleteByPrimaryKey(String directorId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from director where director_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, directorId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(Director record) {
		String sql="insert into director values(?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getDirectorId());
            ps.setString(2,record.getDirectorName());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public Director selectByPrimaryKey(String directorId) {
		Director a = new Director();
        String sql="select * from director where director_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, directorId);
            rs=ps.executeQuery();
            if (rs.next())
            {
            	a.setDirectorId(rs.getString("director_id"));
            	a.setDirectorName(rs.getString("director_name"));
            }
            closeConnection(conn, ps, rs);
            return a;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(Director record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update director set director_name=?, where director_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getDirectorName()); 
            ps.setString(2,record.getDirectorId());        
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
}