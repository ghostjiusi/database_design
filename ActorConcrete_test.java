package test_dao;

import abs.DAOFactory;
import concrete_dao.ActorConcrete;
import implement_dao.ActorMapper;
import substance.Actor;

public class ActorConcrete_test 
{
	ActorMapper actormapper=DAOFactory.getInstance().getActorMapper();
	
	public  void TestInsert()//��
	{
		Actor a=new Actor();
		a.setActorId("1");
		a.setActorName("������");
		actormapper.insert(a);
		
	}
	public void TestDelete()//ɾ
	{
		
		actormapper.deleteByPrimaryKey("1");
		System.out.println("�ɹ�ɾ������������");
		
	}
	
	public void TestUpdate()//��
	{
		Actor a=new Actor();
		a.setActorId("1");
		a.setActorName("���»�");
		actormapper.updateByPrimaryKey(a);
		}
	
	public void TestSelect()//��
	{
		Actor a=new Actor();
		a=actormapper.selectByPrimaryKey("1");
		System.out.println(a.getActorName());
	}
	
	
	
}
