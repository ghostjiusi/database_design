package test_dao;

import abs.DAOFactory;
import concrete_dao.GroupsUserConcrete;
import implement_dao.GroupsUserMapper;
import substance.GroupsUser;


public class GroupsUserConcrete_test {

	GroupsUserMapper groupsusermapper=DAOFactory.getInstance().getGroupsUserMapper();
	public void TestInsert()
	{
		GroupsUser a=new GroupsUser();
		a.setGroupsId("111");
		a.setGroupsUserId("5");
		a.setUser("无脑观影");
		groupsusermapper.insert(a);
	}
	
	public void TestDelete()
	{
		groupsusermapper.deleteByPrimaryKey("11");
		System.out.println("成功删除了这条数据");
		
	}
	
	public void TestUpdate()
	{
		GroupsUser a=new GroupsUser();
		a.setGroupsId("110");
		a.setGroupsUserId("4");
		a.setUser("观影");
		groupsusermapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		GroupsUser a=new 	GroupsUser();
		a=groupsusermapper.selectByPrimaryKey("11");
		System.out.println(a.getGroupsUserId());
	}

}
