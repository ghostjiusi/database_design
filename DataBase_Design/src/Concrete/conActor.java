package Concrete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.*;
import DataBase.ConnectionSQL;
import Entity.Actor;

public class conActor  implements ActorDao{
//插入一个新的演员
	@Override
	public boolean insertActor(Actor a) {
		// TODO Auto-generated method stub
		Connection con = ConnectionSQL.getConntions();
		PreparedStatement insertp;
		String sql = "insert into **()........";
		
		try {
			insertp = con.prepareStatement(sql);
			insertp.setString(1, a.getActorId());
			insertp.setString(2, a.getActorname());	
			insertp.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
//删除演员编号为S的演员信息
	@Override
	public boolean deleteActor(String s) {
		// TODO Auto-generated method stub
		Connection con = ConnectionSQL.getConntions();
		String sql = "delete from ** where ** = '"+s+"'";
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updataActor(Actor a) {
		// TODO Auto-generated method stub
		Connection con = ConnectionSQL.getConntions();
		String sql = "updata ** set *=?,*=? where *=? ";
	
		try {
			PreparedStatement pstmt  = con.prepareStatement(sql);
			pstmt.setString(2, a.getActorId());
			pstmt.setString(1, a.getActorname());
			pstmt.execute();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return true;
	}
//输出编号为S的演员信息
	@Override
	public Actor getActor(String s) {
		// TODO Auto-generated method stub
		Connection con = ConnectionSQL.getConntions();
		String sql = "select * from && where &&='"+s+"'";
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			Actor act = new Actor();
			while(rs.next()) {
				act.setActorId(rs.getString(""));
				act.setActorname(rs.getString(""));
			}
			rs.close();
			stmt.close();
			con.close();
			return act;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
//输出所有演员信息
	@Override
	public ArrayList<Actor> getList() {
		// TODO Auto-generated method stub
		Connection con = ConnectionSQL.getConntions();
		String sql = "select * from &&";
		Statement stmt = null;
		ArrayList<Actor> actors = new ArrayList<Actor>();
	
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Actor a = new Actor();
				a.setActorId(rs.getString("&&"));
				a.setActorname(rs.getString("&&"));
				actors.add(a);
			}
			rs.close();
			stmt.close();
			con.close();
			return actors;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
