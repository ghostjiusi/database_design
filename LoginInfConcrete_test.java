package test_dao;

import abs.DAOFactory;
import concrete_dao.LoginInfConcrete;
import implement_dao.LoginInfMapper;
import substance.LoginInf;

public class LoginInfConcrete_test {

	LoginInfMapper 	logininfmapper=DAOFactory.getInstance().getLoginInfMapper();
	public void TestInsert()
	{
		LoginInf a=new 	LoginInf();
		a.setUserId("42");
		a.setLoginName("用户1");
		a.setLoginPassword("1");
		logininfmapper.insert(a);
	}
	
	public void TestDelete()
	{
		logininfmapper.deleteByPrimaryKey("11");
		System.out.println("成功删除了这条数据");
		
	}
	
	public void TestUpdate()
	{
		LoginInf a=new 	LoginInf();
		a.setUserId("41");
		a.setLoginName("用户2");
		a.setLoginPassword("1");
		logininfmapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		LoginInf a=new 		LoginInf();
		a=logininfmapper.selectByPrimaryKey("11");
		System.out.println(a.getUserId());
	}
}
