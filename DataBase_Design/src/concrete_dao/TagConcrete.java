package concrete_dao;

import abs.DAOBase;
import implement_dao.TagMapper;
import substance.Movie;
import substance.Tag;

public class TagConcrete extends DAOBase implements TagMapper {

	@Override
	public int deleteByPrimaryKey(String tagId) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		 String sql="delete from tag where tag_id=?";
	        try {
	            conn=getConnection();
	            ps=conn.prepareStatement(sql);
	            ps.setString(1, tagId);
	            ps.executeUpdate();
	            closeConnection(conn, ps, rs);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return 0;
	}

	@Override
	public int insert(Tag record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql = "insert into tag values(?,?)";
		try{
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,record.getTagId());
            ps.setString(2,record.getTagName());
            ps.executeUpdate();
            closeConnection(conn,ps,null);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public Tag selectByPrimaryKey(String tagId) {
		// TODO Auto-generated method stub
		Tag movie = new Tag();
        String sql="select * from tag where tag_id=?";
        this.initConnection(ps, conn, rs);
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, tagId);
            rs=ps.executeQuery();
            if (rs.next())
            {
                movie.setTagId(rs.getString("tag_id"));
                movie.setTagName(rs.getString("tag_name"));
            }
            closeConnection(conn, ps, rs);
            return movie;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int updateByPrimaryKey(Tag record) {
		// TODO Auto-generated method stub
		this.initConnection(ps, conn, rs);
		String sql="update tag set tag_name=?, where tag_id=?";
        try {
            conn=getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1, record.getTagName());
            ps.setString(2, record.getTagId());            
            ps.executeUpdate();
            closeConnection(conn, ps, rs);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
	}
}
    