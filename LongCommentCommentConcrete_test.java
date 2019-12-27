package test_dao;

import abs.DAOFactory;
import concrete_dao.LongCommentCommentConcrete;
import implement_dao.LongCommentCommentMapper;
import substance.LongCommentComment;

public class LongCommentCommentConcrete_test {
	LongCommentCommentMapper longcommentcommentmapper=DAOFactory.getInstance().getLongCommentCommentMapper();
	public void TestInsert()
	{
		LongCommentComment a=new 	LongCommentComment();
		a.setUserId("42");
		a.setLongCommentCommentId("133");
		a.setLongCommentId("18");
		a.setComment("还不错");
		longcommentcommentmapper.insert(a);
	}
	
	public void TestDelete()
	{
		longcommentcommentmapper.deleteByPrimaryKey("133");
		System.out.println("成功删除了这条数据");
		
	}
	
	public void TestUpdate()
	{
		LongCommentComment a=new LongCommentComment();
		a.setUserId("32");
		a.setLongCommentCommentId("123");
		a.setLongCommentId("1f");
		a.setComment("不错");
		longcommentcommentmapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		LongCommentComment a=new LongCommentComment();
		a=	longcommentcommentmapper.selectByPrimaryKey("11");
		System.out.println(a.getUserId());
	}

}
