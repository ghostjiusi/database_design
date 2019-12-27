package test_dao;

import abs.DAOFactory;
import concrete_dao.GroupsUserCommentConcrete;
import implement_dao.GroupsUserCommentMapper;
import substance.GroupsUserComment;

public class GroupsUserCommentConcrete_test {

	GroupsUserCommentMapper groupsUsercommentmapper=DAOFactory.getInstance().getGroupsUserCommentMapper();
	public void TestInsert()
	{
		GroupsUserComment a=new GroupsUserComment();
		a.setGroupsCommentId("100");
		a.setGroupsUserId("5");
		a.setComment("还行");
		groupsUsercommentmapper.insert(a);
	}
	
	public void TestDelete()
	{
		groupsUsercommentmapper.deleteByPrimaryKey("11");
		System.out.println("成功删除了这条数据");
		
	}
	
	public void TestUpdate()
	{
		GroupsUserComment a=new GroupsUserComment();
		a.setGroupsCommentId("100");
		a.setGroupsUserId("5");
		a.setComment("还行");
		groupsUsercommentmapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		GroupsUserComment a=new GroupsUserComment();
		a=groupsUsercommentmapper.selectByPrimaryKey("11");
		System.out.println(a.getGroupsCommentId());
	}

}
