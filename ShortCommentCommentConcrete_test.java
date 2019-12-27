package test_dao;

import abs.DAOFactory;
import concrete_dao.ShortCommentConcrete;
import implement_dao.ShortCommentMapper;
import substance.MoviePrize;
import substance.ShortComment;

public class ShortCommentCommentConcrete_test {

	ShortCommentMapper shortcommentmapper=DAOFactory.getInstance().getShortCommentMapper();
	public void TestInsert()
	{
		ShortComment a=new ShortComment();
		a.setShortCommentId("43");
		a.setUserId("151");
		shortcommentmapper.insert(a);
	}
	
	public void TestDelete()
	{
		shortcommentmapper.deleteByPrimaryKey("43");
		System.out.println("成功删除了这条数据");
	}
	
	public void TestUpdate()
	{
		ShortComment a=new  ShortComment();
		a.setShortCommentId("142");
		a.setUserId("181");
		shortcommentmapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		
		ShortComment a=new ShortComment();
		a=shortcommentmapper.selectByPrimaryKey("142");
		System.out.println(a.getShortCommentId());
	}
}
