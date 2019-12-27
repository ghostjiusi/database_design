package test_dao;

import abs.DAOFactory;
import concrete_dao.DirectorConcrete;
import implement_dao.DirectorMapper;
import substance.Director;

public class DirectorConcrete_test {
	DirectorMapper directormapper=DAOFactory.getInstance().getDirectorMapper();
	public void TestInsert()
	{
		Director a=new Director();
		a.setDirectorId("10");
		a.setDirectorName("����");
		directormapper.insert(a);
	}
	
	public void TestDelete()
	{
		directormapper.deleteByPrimaryKey("10");
		System.out.println("�ɹ�ɾ������������");
		
	}
	
	public void TestUpdate()
	{
		Director a=new Director();
		a.setDirectorId("10");
		a.setDirectorName("����");
		directormapper.updateByPrimaryKey(a);

	}
	public void TestSelect()
	{
		Director a=new Director();
		a=directormapper.selectByPrimaryKey("10");
		System.out.println(a.getDirectorId());
	}
}
