package concrete_dao;
/*
 * 头像的那个变量类型不会传参
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import abs.DAOBase;
import implement_dao.LoginInfMapper;
import substance.ActorPrize;
import substance.LoginInf;

public class LoginInfConcrete extends DAOBase implements LoginInfMapper {

	@Override
	public int deleteByPrimaryKey(String userId) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="delete from login_inf where user_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, userId);
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public int insert(LoginInf record) {
		String sql="insert into login_inf values(?,?,?,?,?)";
		PreparedStatement ps=null;
        Connection conn=null;
        try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getUserId());
            ps.setString(2,record.getLoginName());
            ps.setString(3,record.getLoginPassword());
            ps.setString(4,record.getDiary());
            ps.setString(5,record.getLoginMessage());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public LoginInf selectByPrimaryKey(String userId) {
		LoginInf a = new LoginInf();
        String sql="select * from login_inf where login_inf_id=?";
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, userId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                a.setDiary(rs.getString("diary"));
                a.setLoginMessage(rs.getString("login_message"));
                a.setLoginName(rs.getString("login_name"));
                a.setLoginPassword(rs.getString("login_password"));
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
	public int updateByPrimaryKey(LoginInf record) {
		PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;
        String sql="update login_inf set login_name=?,login_password=?,diary=?,login_message=?, where user_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getLoginName());
            ps.setString(2,record.getLoginPassword());
            ps.setString(3,record.getDiary());
            ps.setString(4,record.getLoginMessage());   
            ps.setString(5,record.getUserId());     
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
    
}