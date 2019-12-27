package test_dao;

import abs.DAOFactory;
import concrete_dao.GroupsUserCommentCommentConcrete;
import implement_dao.GroupsUserCommentCommentMapper;
import substance.GroupsUserCommentComment;

public class GroupsUserCommentCommentConcrete_test {
	GroupsUserCommentCommentMapper groupsUsercommentcommentmapper=DAOFactory.getInstance().getGroupsUserCommentCommentMapper();
	public void TestInsert()
	{
		GroupsUserCommentComment a=new GroupsUserCommentComment();
		a.setGroupsCommentCommentId("102");
		a.setGroupsCommentId("100");
		a.setGroupsUserId("5");
		a.setComment("�ÿ�");
		groupsUsercommentcommentmapper.insert(a);
	}
	
	public void TestDelete()
	{
		groupsUsercommentcommentmapper.deleteByPrimaryKey("11");
		System.out.println("�ɹ�ɾ������������");
		
	}
	
	public void TestUpdate()
	{
		GroupsUserCommentComment a=new GroupsUserCommentComment();
		a.setGroupsCommentCommentId("121");
		a.setGroupsCommentId("89");
		a.setGroupsUserId("6");
		a.setComment("���ÿ�");
		groupsUsercommentcommentmapper.updateByPrimaryKey(a);
	}
	public void TestSelect()
	{
		GroupsUserCommentComment a=new GroupsUserCommentComment();
		a=groupsUsercommentcommentmapper.selectByPrimaryKey("11");
		System.out.println(a.getGroupsCommentCommentId());
	}

}
