package test_dao;

import abs.DAOFactory;
import concrete_dao.MovieConcrete;
import implement_dao.MovieMapper;
import substance.Movie;

public class MovieConcrete_test {

	MovieMapper moviemapper=DAOFactory.getInstance().getMovieMapper();
	public void TestInsert()
	{
		Movie a=new Movie();
		a.setMovieName("ʧ����");
		a.setMovieId("123");
		moviemapper.insert(a);
	}
	
	public void TestDelete()
	{
		//Movie a=new Movie();
		//a.setMovieName("ʧ����");
		//a.setMovieId("123");
		moviemapper.deleteByPrimaryKey("ʧ����");
		System.out.println("�ɹ�ɾ������������");
	}
	
	public void TestUpdate()
	{
		Movie a=new Movie();
		a.setMovieName("ʧ����2");
		a.setMovieId("1213");
		moviemapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		Movie a=new Movie();
		a=moviemapper.selectByPrimaryKey("11");
		System.out.println(a.getMovieName());
	}
}
