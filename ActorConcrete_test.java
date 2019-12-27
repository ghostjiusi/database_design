package test_dao;

import abs.DAOFactory;
import concrete_dao.ActorConcrete;
import implement_dao.ActorMapper;
import substance.Actor;

public class ActorConcrete_test 
{
	ActorMapper actormapper=DAOFactory.getInstance().getActorMapper();
	
	public  void TestInsert()//增
	{
		Actor a=new Actor();
		a.setActorId("1");
		a.setActorName("范冰冰");
		actormapper.insert(a);
		
	}
	public void TestDelete()//删
	{
		
		actormapper.deleteByPrimaryKey("1");
		System.out.println("成功删除了这条数据");
		
	}
	
	public void TestUpdate()//改
	{
		Actor a=new Actor();
		a.setActorId("1");
		a.setActorName("刘德华");
		actormapper.updateByPrimaryKey(a);
		}
	
	public void TestSelect()//查
	{
		Actor a=new Actor();
		a=actormapper.selectByPrimaryKey("1");
		System.out.println(a.getActorName());
	}
	
	
	
}
